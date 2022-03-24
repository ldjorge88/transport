package co.com.edu.uco.ing.software.project.transports.domain.service;

import co.com.edu.uco.ing.software.project.transports.application.exception.TransportBadRequestException;
import co.com.edu.uco.ing.software.project.transports.domain.model.Owner;
import co.com.edu.uco.ing.software.project.transports.domain.port.OwnerRepository;
import co.com.edu.uco.ing.software.project.transports.domain.service.owner.FindOwnerService;
import co.com.edu.uco.ing.software.project.transports.domain.service.owner.SaveOwnerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static co.com.edu.uco.ing.software.project.transports.application.enums.ErrorMessage.U_EXISTING_RECORD;

public class OwnerServiceTest {

  @Test
  void successfulOwnerCreation() {

    int document = 12345;
    String documentType = "2";
    String firstName = "Jorge";
    String lastName = "Lima";
    String email = "ldjorge1988@gmail.com";
    String city = "Medellín";
    String rut = "1233248";
    String phone = "3217187437";
    String licensePlate = "HOT435";
    String dateOfBirth = "01/02/1988";

    //act
    Owner owner = Owner.ownerBuilder(document, documentType)
        .setFirstName(firstName)
        .setLastName(lastName)
        .setEmail(email)
        .setCity(city)
        .setRut(rut)
        .setPhone(phone)
        .setLicensePlate(licensePlate)
        .setDateOfBirth(dateOfBirth)
        .build();

    var ownerRepository = Mockito.mock(OwnerRepository.class);
    var ownerService = new SaveOwnerService(ownerRepository);

    Mockito.when(ownerRepository.save(Mockito.any(Owner.class))).thenReturn(1L);

    var id = ownerService.execute(owner);

    Mockito.verify(ownerRepository, Mockito.times(1)).save(owner);
    Assertions.assertEquals(1L, id);
  }

  @Test
  void errorCreationOwnerExists() {

    int document = 12345;
    String documentType = "2";
    String firstName = "Jorge";
    String lastName = "Lima";
    String email = "ldjorge1988@gmail.com";
    String city = "Medellín";
    String rut = "1233248";
    String phone = "3217187437";
    String licensePlate = "HOT435";
    String dateOfBirth = "01/02/1988";

    //act
    Owner owner = Owner.ownerBuilder(document, documentType)
        .setFirstName(firstName)
        .setLastName(lastName)
        .setEmail(email)
        .setCity(city)
        .setRut(rut)
        .setPhone(phone)
        .setLicensePlate(licensePlate)
        .setDateOfBirth(dateOfBirth)
        .build();

    var ownerRepository = Mockito.mock(OwnerRepository.class);
    var ownerService = new SaveOwnerService(ownerRepository);

    Mockito.when(ownerRepository.exists(Mockito.any())).thenReturn(true);
    Assertions.assertEquals(U_EXISTING_RECORD.getMessage(),
        Assertions.assertThrows(IllegalStateException.class, () ->
                ownerService.execute(owner))
            .getMessage());
  }

  @Test
  void successfulOwnerFindAll() {

    int document = 12345;
    String documentType = "2";

    Owner owner = Owner.ownerBuilder(document, documentType);

    var ownerRepository = Mockito.mock(OwnerRepository.class);
    var ownerService = new FindOwnerService(ownerRepository);

    Mockito.when(ownerRepository.findByDocument(owner.getDocument())).thenReturn(owner);
    Owner ownersResponse = ownerService.execute(12345);

    Assertions.assertEquals(owner, ownersResponse);
  }

}
