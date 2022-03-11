package co.com.edu.uco.ing.software.project.transports.infrastructure.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(value = "/document_type/")
public class DocumentTypeController {

  @PostMapping
  public void create() {
    log.info("Jorge");
  }

}
