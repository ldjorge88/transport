package co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.repository.jpa;

import co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.entity.DocumentTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentTypeJpaRepository extends JpaRepository<DocumentTypeEntity, Long> {
  DocumentTypeEntity findDocumentTypeEntityByCode(String code);
  DocumentTypeEntity findDocumentTypeEntityByName(DocumentTypeEntity description);
}
