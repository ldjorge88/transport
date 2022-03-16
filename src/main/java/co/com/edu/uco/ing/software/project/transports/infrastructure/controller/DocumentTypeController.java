package co.com.edu.uco.ing.software.project.transports.infrastructure.controller;

import co.com.edu.uco.ing.software.project.transports.application.dto.DocumentTypeDTO;
import co.com.edu.uco.ing.software.project.transports.application.service.documenttype.ApplicationSaveDocumentTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/document-type/")
public class DocumentTypeController {

  private final ApplicationSaveDocumentTypeService appSaveDocumentTypeService;

  @PostMapping
  public void create(@RequestBody DocumentTypeDTO documentTypeDTO) {
    appSaveDocumentTypeService.execute(documentTypeDTO);
  }

  @GetMapping
  public DocumentTypeDTO findAll(){
    return new DocumentTypeDTO();
  }

}
