package co.com.edu.uco.ing.software.project.transports.application.service.documenttype;

import static co.com.edu.uco.ing.software.project.transports.application.converter.DocumentTypeMapper.DOCUMENT_TYPE_MAPPER;
import co.com.edu.uco.ing.software.project.transports.application.dto.DocumentTypeDTO;
import co.com.edu.uco.ing.software.project.transports.application.exception.TransportBadRequestException;
import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;
import co.com.edu.uco.ing.software.project.transports.domain.service.documenttype.SaveDocumentTypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ApplicationSaveDocumentTypeService {

  private final SaveDocumentTypeService documentTypeSaveService;

  public void execute(DocumentTypeDTO documentTypeDTO) {
    DocumentType documentType = DOCUMENT_TYPE_MAPPER.documentTypeDTOToDocumentType(documentTypeDTO);
      documentTypeSaveService.create(documentType);
  }

}
