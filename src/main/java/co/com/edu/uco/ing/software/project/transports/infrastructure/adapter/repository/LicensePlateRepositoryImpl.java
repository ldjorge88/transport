package co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.repository;

import co.com.edu.uco.ing.software.project.transports.domain.model.LicensePlate;
import co.com.edu.uco.ing.software.project.transports.domain.port.LicensePlateRepository;
import co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.repository.jpa.LicenseJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

import java.util.List;

import static co.com.edu.uco.ing.software.project.transports.application.mapper.LicensePlateMapper.LICENSE_PLATE_MAPPER;

@Repository
@RequiredArgsConstructor
public class LicensePlateRepositoryImpl implements LicensePlateRepository {

  private final LicenseJpaRepository licenseJpaRepository;


  @Override
  public List<LicensePlate> findAll() {
    return LICENSE_PLATE_MAPPER.licensePlateEntityListToLicensePlateList(
        licenseJpaRepository.findAll()
    );
  }

  @Override
  public Long save(LicensePlate licensePlate) {
    return licenseJpaRepository.save(
        LICENSE_PLATE_MAPPER.lincensePlateTOLicensePlateEntity(licensePlate)
    ).getId();
  }

  @Override
  public boolean exists(LicensePlate licensePlate) {
    return !ObjectUtils.isEmpty(
        licenseJpaRepository.findLicensePlateEntityByCodePlate(
                LICENSE_PLATE_MAPPER.lincensePlateTOLicensePlateEntity(licensePlate))
            .getCodePlate());
  }

}
