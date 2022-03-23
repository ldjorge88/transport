package co.com.edu.uco.ing.software.project.transports.domain.port;

import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;

import java.util.List;

public interface DocumentTypeRepository {
  List<DocumentType> findAll();

  Long save(DocumentType documentType);

  boolean exists(DocumentType documentType);
}
