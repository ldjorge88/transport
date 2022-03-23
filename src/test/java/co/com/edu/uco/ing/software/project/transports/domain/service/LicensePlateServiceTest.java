package co.com.edu.uco.ing.software.project.transports.domain.service;

import co.com.edu.uco.ing.software.project.transports.application.exception.TransportBadRequestException;
import co.com.edu.uco.ing.software.project.transports.domain.model.LicensePlate;
import co.com.edu.uco.ing.software.project.transports.domain.model.LicensePlateBuilder;
import co.com.edu.uco.ing.software.project.transports.domain.port.LicensePlateRepository;
import co.com.edu.uco.ing.software.project.transports.domain.service.licenseplate.FindAllLicensePlateService;
import co.com.edu.uco.ing.software.project.transports.domain.service.licenseplate.SaveLicensePlateService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static co.com.edu.uco.ing.software.project.transports.application.enums.ErrorMessage.U_EXISTING_RECORD;

public class LicensePlateServiceTest {

  @Test
  void successfulLicensePlate() {

    //arrange
    var licensePlate = new LicensePlateBuilder().build();

    var licensePlateRepository = Mockito.mock(LicensePlateRepository.class);
    var licensePlateService = new SaveLicensePlateService(licensePlateRepository);

    Mockito.when(licensePlateRepository.save(Mockito.any(LicensePlate.class))).thenReturn(1L);

    //act
    var id = licensePlateService.create(licensePlate);

    //assert
    Mockito.verify(licensePlateRepository, Mockito.times(1)).save(licensePlate);
    Assertions.assertEquals(1L, id);
  }

  @Test
  void errorCreationLicensePlateExists() {

    //arrange
    var licensePlate = new LicensePlateBuilder().build();

    var licensePlateRepository = Mockito.mock(LicensePlateRepository.class);
    var licensePlateService = new SaveLicensePlateService(licensePlateRepository);

    Mockito.when(licensePlateRepository.exists(Mockito.any())).thenReturn(true);

    //act - assert
    Assertions.assertEquals(U_EXISTING_RECORD.getMessage(),
        Assertions.assertThrows(TransportBadRequestException.class, () ->
                licensePlateService.create(licensePlate))
            .getMessage());
  }

  @Test
  void successfulLicensePlateFindAll() {

    //arrange
    var licensePlate = new LicensePlateBuilder().build();
    var licensePlate1 = new LicensePlateBuilder().build();
    var licensePlate3 = new LicensePlateBuilder().build();
    List<LicensePlate> licensePlateListExpected = new ArrayList<>();
    licensePlateListExpected.add(licensePlate);
    licensePlateListExpected.add(licensePlate1);
    licensePlateListExpected.add(licensePlate3);

    var licensePlateRepository = Mockito.mock(LicensePlateRepository.class);
    var licensePlateService = new FindAllLicensePlateService(licensePlateRepository);

    Mockito.when(licensePlateRepository.findAll()).thenReturn(Arrays.asList(licensePlate, licensePlate1, licensePlate3));
    List<LicensePlate> licensePlatesResponse = licensePlateService.getList();

    Assertions.assertEquals(licensePlateListExpected, licensePlatesResponse);
  }

}
