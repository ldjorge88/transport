package co.com.edu.uco.ing.software.project.transports.application.service.documenttype;

import co.com.edu.uco.ing.software.project.transports.application.converter.DocumentTypeMapper;
import co.com.edu.uco.ing.software.project.transports.application.dto.DocumentTypeDTO;
import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AppSaveDocumentTypeService {

  public void test(DocumentTypeDTO documentTypeDTO) {
    DocumentType documentType = DocumentTypeMapper.INSTANCE.documentTypeDTOToDocumentType(documentTypeDTO);
    log.info("entity: {}", documentType);
  }

}
