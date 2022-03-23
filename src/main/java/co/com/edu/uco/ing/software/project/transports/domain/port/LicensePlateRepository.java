package co.com.edu.uco.ing.software.project.transports.domain.port;

import co.com.edu.uco.ing.software.project.transports.domain.model.LicensePlate;

import java.util.List;

public interface LicensePlateRepository {
  List<LicensePlate> findAll();

  Long save(LicensePlate licensePlate);

  boolean exists(LicensePlate licensePlate);
}
