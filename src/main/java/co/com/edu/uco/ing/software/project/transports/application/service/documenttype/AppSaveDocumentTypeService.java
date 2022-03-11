package co.com.edu.uco.ing.software.project.transports.application.service.documenttype;

import co.com.edu.uco.ing.software.project.transports.application.converter.DocumentTypeMapper;
import co.com.edu.uco.ing.software.project.transports.application.dto.DocumentTypeDTO;
import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;
import co.com.edu.uco.ing.software.project.transports.domain.service.documenttype.DocumentTypeSaveService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AppSaveDocumentTypeService {

  private final DocumentTypeSaveService documentTypeSaveService;

  public void create(DocumentTypeDTO documentTypeDTO) {
    DocumentType documentType = DocumentTypeMapper.INSTANCE.documentTypeDTOToDocumentType(documentTypeDTO);
    documentTypeSaveService.create(documentType);
  }

}
