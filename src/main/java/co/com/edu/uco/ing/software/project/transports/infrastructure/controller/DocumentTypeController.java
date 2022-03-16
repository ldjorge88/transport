package co.com.edu.uco.ing.software.project.transports.infrastructure.controller;

import co.com.edu.uco.ing.software.project.transports.application.dto.DocumentTypeDTO;
import co.com.edu.uco.ing.software.project.transports.application.service.documenttype.ApplicationListDocumentTypeService;
import co.com.edu.uco.ing.software.project.transports.application.service.documenttype.ApplicationSaveDocumentTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/document-type/")
public class DocumentTypeController {

  private final ApplicationSaveDocumentTypeService applicationSaveDocumentTypeService;
  private final ApplicationListDocumentTypeService applicationListDocumentTypeService;

  @GetMapping
  public List<DocumentTypeDTO> findAll() {
    return applicationListDocumentTypeService.execute();
  }

  @PostMapping
  public void create(@RequestBody DocumentTypeDTO documentTypeDTO) {
    applicationSaveDocumentTypeService.execute(documentTypeDTO);
  }

}
