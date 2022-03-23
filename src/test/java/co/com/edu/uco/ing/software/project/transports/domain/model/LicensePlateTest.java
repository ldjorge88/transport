package co.com.edu.uco.ing.software.project.transports.domain.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LicensePlateTest {

  @Test
  void validateSuccesfulCreation() {

    LicensePlate licensePlate = new LicensePlateBuilder().build();

    Assertions.assertEquals("ABC123", licensePlate.getCodePlate());
    Assertions.assertEquals("placa de automovil de ejemplo", licensePlate.getDescription());

  }

  @Test
  void setDataAfterCreation() {
    LicensePlate licensePlate = new LicensePlate();

    licensePlate.setCodePlate("ABC123");
    licensePlate.setDescription("Cambio despues de creado el vehiculo");

    Assertions.assertEquals("ABC123", licensePlate.getCodePlate());
    Assertions.assertEquals("Cambio despues de creado el vehiculo", licensePlate.getDescription());
  }

}
