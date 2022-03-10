package co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentJpaTypeRepository extends JpaRepository<DocumentJpaTypeRepository, Long> {

}
