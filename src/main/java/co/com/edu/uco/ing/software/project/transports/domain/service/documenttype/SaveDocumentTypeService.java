package co.com.edu.uco.ing.software.project.transports.domain.service.documenttype;

import co.com.edu.uco.ing.software.project.transports.application.enums.ErrorMessage;
import co.com.edu.uco.ing.software.project.transports.application.exception.TransportBadRequestException;
import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;
import co.com.edu.uco.ing.software.project.transports.domain.port.DocumentTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveDocumentTypeService {

  private final DocumentTypeRepository documentTypeRepository;

  public Long create(DocumentType documentType) {

    if (documentTypeRepository.exists(documentType)) {
      throw new TransportBadRequestException(ErrorMessage.U_EXISTING_RECORD);
    }

    return documentTypeRepository.save(documentType);
  }

}
