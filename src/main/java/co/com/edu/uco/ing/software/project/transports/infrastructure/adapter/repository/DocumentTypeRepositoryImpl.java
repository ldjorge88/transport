package co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.repository;

import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;
import co.com.edu.uco.ing.software.project.transports.domain.port.DocumentTypeRepository;
import co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.entity.DocumentTypeEntity;
import co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.repository.jpa.DocumentTypeJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

import java.util.List;

import static co.com.edu.uco.ing.software.project.transports.application.converter.DocumentTypeMapper.DOCUMENT_TYPE_MAPPER;

@RequiredArgsConstructor
@Slf4j
@Repository
public class DocumentTypeRepositoryImpl implements DocumentTypeRepository {

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
  public DocumentType findByName(
      String code) {
    return null;
  }

  @Override
  public Long save(DocumentType documentType) {
    DocumentTypeEntity documentTypeEntity = DOCUMENT_TYPE_MAPPER.documentTypeToDocumentTypeEntity(documentType);
    return documentTypeJpaRepository.save(documentTypeEntity).getId();
  }

  @Override
  public boolean exists(DocumentType documentType) {
    DocumentTypeEntity documentTypeEntity = DOCUMENT_TYPE_MAPPER.documentTypeToDocumentTypeEntity(documentType);
    return !ObjectUtils.isEmpty(documentTypeJpaRepository.findDocumentTypeEntityByCode(documentTypeEntity.getCode()));
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
