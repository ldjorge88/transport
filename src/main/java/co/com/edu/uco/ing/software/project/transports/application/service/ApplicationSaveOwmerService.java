package co.com.edu.uco.ing.software.project.transports.application.service;

import co.com.edu.uco.ing.software.project.transports.application.dto.OwnerDTO;
import co.com.edu.uco.ing.software.project.transports.application.dto.OwnerResponseDTO;
import co.com.edu.uco.ing.software.project.transports.domain.model.Owner;
import co.com.edu.uco.ing.software.project.transports.domain.service.owner.SaveOwnerService;
import org.springframework.stereotype.Component;

@Component
public class ApplicationSaveOwmerService {

  private final SaveOwnerService saveOwnerService;

  public ApplicationSaveOwmerService(SaveOwnerService saveOwnerService) {
    this.saveOwnerService = saveOwnerService;
  }

  public OwnerResponseDTO execute(OwnerDTO ownerDTO) {

    Owner owner = Owner.of(ownerDTO.getDocument(), ownerDTO.getDocumentType(), ownerDTO.getFirstName(), ownerDTO.getLastName(), ownerDTO.getEmail(),
        ownerDTO.getCity(), ownerDTO.getRut(), ownerDTO.getPhone(), ownerDTO.getLicensePlate());

    return new OwnerResponseDTO<>(this.saveOwnerService.execute(owner));

  }
}
