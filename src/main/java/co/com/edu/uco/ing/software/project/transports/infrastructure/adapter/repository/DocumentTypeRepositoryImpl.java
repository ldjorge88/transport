package co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.repository;

import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;
import co.com.edu.uco.ing.software.project.transports.domain.port.DocumentTypeRepository;
import co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.repository.jpa.DocumentTypeJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

import java.util.List;

import static co.com.edu.uco.ing.software.project.transports.application.mapper.DocumentTypeMapper.DOCUMENT_TYPE_MAPPER;

@RequiredArgsConstructor
@Slf4j
@Repository
public class DocumentTypeRepositoryImpl implements DocumentTypeRepository {

  private final DocumentTypeJpaRepository documentTypeJpaRepository;

  @Override
  public List<DocumentType> findAll() {
    return DOCUMENT_TYPE_MAPPER.documentTypeEntityListToDocumentTypeList(
        documentTypeJpaRepository.findAll()
    );
  }

  @Override
  public Long save(DocumentType documentType) {
    return documentTypeJpaRepository.save(
        DOCUMENT_TYPE_MAPPER.documentTypeToDocumentTypeEntity(documentType)
    ).getId();
  }

  @Override
  public boolean exists(DocumentType documentType) {
    return !ObjectUtils.isEmpty(
        documentTypeJpaRepository.findDocumentTypeEntityByCode(
            DOCUMENT_TYPE_MAPPER.documentTypeToDocumentTypeEntity(documentType).getCode())
    );
  }

}
