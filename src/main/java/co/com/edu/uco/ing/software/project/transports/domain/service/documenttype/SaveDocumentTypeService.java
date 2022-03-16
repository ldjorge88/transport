package co.com.edu.uco.ing.software.project.transports.domain.service.documenttype;

import co.com.edu.uco.ing.software.project.transports.application.enums.ErrorMessage;
import co.com.edu.uco.ing.software.project.transports.application.exception.TransportBadRequestException;
import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;
import co.com.edu.uco.ing.software.project.transports.domain.port.DocumentTypeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class SaveDocumentTypeService {

  private final DocumentTypeRepository documentTypeRepository;

  public void create(DocumentType documentType) {

    if (documentTypeRepository.exists(documentType)) {
      log.error(ErrorMessage.T_EXISTING_RECORD.getMessage().concat(documentType.toString()));
      throw new TransportBadRequestException(ErrorMessage.U_EXISTING_RECORD);
    }

    documentTypeRepository.save(documentType);
  }

}
