package co.com.edu.uco.ing.software.project.transports.infrastructure.controller;

import co.com.edu.uco.ing.software.project.transports.application.dto.OwnerDTO;
import co.com.edu.uco.ing.software.project.transports.application.dto.OwnerResponseDTO;
import co.com.edu.uco.ing.software.project.transports.application.service.owner.ApplicationDeleteOwnerService;
import co.com.edu.uco.ing.software.project.transports.application.service.owner.ApplicationFindOwnerService;
import co.com.edu.uco.ing.software.project.transports.application.service.owner.ApplicationListOwnerService;
import co.com.edu.uco.ing.software.project.transports.application.service.owner.ApplicationSaveOwmerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api-owner")
public class OwnerController {

  private final ApplicationListOwnerService applicationListOwnerService;
  private final ApplicationSaveOwmerService applicationSaveOwmerService;
  private final ApplicationDeleteOwnerService applicationDeleteOwnerService;
  private final ApplicationFindOwnerService applicationFindOwnerService;

  public OwnerController(ApplicationListOwnerService applicationListOwnerService, ApplicationSaveOwmerService applicationSaveOwmerService,
                         ApplicationDeleteOwnerService applicationDeleteOwnerService, ApplicationFindOwnerService applicationFindOwnerService) {
    this.applicationListOwnerService = applicationListOwnerService;
    this.applicationSaveOwmerService = applicationSaveOwmerService;
    this.applicationDeleteOwnerService = applicationDeleteOwnerService;
    this.applicationFindOwnerService = applicationFindOwnerService;
  }

  @GetMapping
  public Object list() {
    return applicationListOwnerService.execute();
  }

  @GetMapping(params = "documentId")
  public OwnerResponseDTO findByDocumentId(int documentId) {
    return new OwnerResponseDTO<>(applicationFindOwnerService.execute(documentId));
  }

  @PostMapping
  public OwnerResponseDTO<Long> create(@RequestBody OwnerDTO ownerDTO) {
    return this.applicationSaveOwmerService.execute(ownerDTO);
  }

  @DeleteMapping
  public OwnerResponseDTO<Long> delete(@RequestBody OwnerDTO ownerDTO) {
    return this.applicationDeleteOwnerService.execute(ownerDTO);
  }
}
