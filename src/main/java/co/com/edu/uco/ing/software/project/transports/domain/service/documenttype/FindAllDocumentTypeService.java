package co.com.edu.uco.ing.software.project.transports.domain.service.documenttype;

import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;
import co.com.edu.uco.ing.software.project.transports.domain.port.DocumentTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAllDocumentTypeService {

  private final DocumentTypeRepository documentTypeRepository;

  public List<DocumentType> geList() {
    return documentTypeRepository.findAll();
  }

}
