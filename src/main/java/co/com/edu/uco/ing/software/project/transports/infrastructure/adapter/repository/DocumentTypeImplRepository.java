package co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.repository;

import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;
import co.com.edu.uco.ing.software.project.transports.domain.port.DocumentTypeRepository;
import co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.entity.DocumentTypeEntity;
import co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.repository.jpa.DocumentTypeJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Repository
public class DocumentTypeImplRepository implements DocumentTypeRepository {

  private final DocumentTypeJpaRepository documentTypeJpaRepository;

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
    DocumentTypeEntity documentTypeEntity = DocumentTypeEntity.builder()
        .code(documentType.getCode())
        .name(documentType.getName())
        .description(documentType.getDescription())
        .build();
    return this.documentTypeJpaRepository.save(documentTypeEntity).getId();
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
