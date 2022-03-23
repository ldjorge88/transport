package co.com.edu.uco.ing.software.project.transports.domain.service.licenseplate;

import co.com.edu.uco.ing.software.project.transports.application.enums.ErrorMessage;
import co.com.edu.uco.ing.software.project.transports.application.exception.TransportBadRequestException;
import co.com.edu.uco.ing.software.project.transports.domain.model.LicensePlate;
import co.com.edu.uco.ing.software.project.transports.domain.port.LicensePlateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveLicensePlateService {

  private final LicensePlateRepository licensePlateRepository;

  public Long create(LicensePlate licensePlate) {

    if (licensePlateRepository.exists(licensePlate)) {
      throw new TransportBadRequestException(ErrorMessage.U_EXISTING_RECORD);
    }

    return licensePlateRepository.save(licensePlate);
  }

}
