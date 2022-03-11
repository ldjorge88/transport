package co.com.edu.uco.ing.software.project.transports.infrastructure.controller;

import co.com.edu.uco.ing.software.project.transports.application.dto.DocumentTypeDTO;
import co.com.edu.uco.ing.software.project.transports.application.service.documenttype.AppSaveDocumentTypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "/document_type/")
public class DocumentTypeController {

  private final AppSaveDocumentTypeService appSaveDocumentTypeService;

  @PostMapping
  public void create(@RequestBody DocumentTypeDTO documentTypeDTO) {
    appSaveDocumentTypeService.test(documentTypeDTO);
  }

}
