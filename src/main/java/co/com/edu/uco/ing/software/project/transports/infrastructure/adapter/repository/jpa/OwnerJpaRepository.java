package co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.repository.jpa;

import co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.entity.OwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OwnerJpaRepository extends JpaRepository<OwnerEntity, Long> {
  OwnerEntity findByDocumentAndDocumentType(int document, String documentType);
  Optional<OwnerEntity> findByDocument(int document);
}
