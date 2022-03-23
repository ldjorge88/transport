package co.com.edu.uco.ing.software.project.transports.domain.service.licenseplate;

import co.com.edu.uco.ing.software.project.transports.domain.model.LicensePlate;
import co.com.edu.uco.ing.software.project.transports.domain.port.LicensePlateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAllLicensePlateService {

  private final LicensePlateRepository licensePlateRepository;

  public List<LicensePlate> getList() {
    return licensePlateRepository.findAll();
  }

}
