package co.com.edu.uco.ing.software.project.transports.domain.port;

import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;

import java.util.List;

public interface DocumentTypeRepository {

  List<DocumentType> findAll();
  DocumentType findByCode(String code);
  DocumentType findByName(String code);
  Long save(DocumentType documentType);
  boolean exists(DocumentType documentType);
  Long delete(DocumentType documentType);
  DocumentType update(DocumentType documentType);

}
