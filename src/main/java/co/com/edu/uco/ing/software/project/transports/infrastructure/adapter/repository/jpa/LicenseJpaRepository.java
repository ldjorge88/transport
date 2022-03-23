package co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.repository.jpa;

import co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.entity.LicensePlateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LicenseJpaRepository extends JpaRepository<LicensePlateEntity, Long> {
  LicensePlateEntity findLicensePlateEntityByCodePlate(LicensePlateEntity codePlate);
}
