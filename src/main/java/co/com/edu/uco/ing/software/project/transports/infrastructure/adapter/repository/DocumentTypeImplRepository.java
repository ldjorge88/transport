package co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.repository;

import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;
import co.com.edu.uco.ing.software.project.transports.domain.port.DocumentTypeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
public class DocumentTypeImplRepository implements DocumentTypeRepository {


  @Override
  public List<DocumentType> findAll() {
    return null;
  }

  @Override
  public DocumentType findByCode(String code) {
    return null;
  }

  @Override
  public DocumentType findByName(String code) {
    return null;
  }

  @Override
  public Long save(DocumentType documentType) {
    return null;
  }

  @Override
  public boolean exists(DocumentType documentType) {
    return false;
  }

  @Override
  public Long delete(DocumentType documentType) {
    return null;
  }

  @Override
  public DocumentType update(DocumentType documentType) {
    return null;
  }
}
