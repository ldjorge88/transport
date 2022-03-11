package co.com.edu.uco.ing.software.project.transports.domain.service.documenttype;

import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;
import co.com.edu.uco.ing.software.project.transports.domain.port.DocumentTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SaveDocumentTypeService {

  private static final String EXISTS_MESSAGE = "Ya existe un tipo de documento con los datos ingresados";

  private final DocumentTypeRepository documentTypeRepository;

  public void create(DocumentType documentType) {

    if (documentTypeRepository.exists(documentType)) {
      throw new RuntimeException(EXISTS_MESSAGE);
    }

    documentTypeRepository.save(documentType);
  }

}
