package co.com.edu.uco.ing.software.project.transports.domain.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static co.com.edu.uco.ing.software.project.transports.domain.model.util.Message.REQUIRED_FIELD_NULL_EMPTY;

public class OwnerTest {

  @Test
  void validateSuccessfulCreation() {
    //arrange
    int document = 12345;
    String documentType = "2";
    String firstName = "Jorge";
    String lastName = "Lima";
    String email = "ldjorge1988@gmail.com";
    String city = "Medellín";
    String rut = "1233248";
    String phone = "3217187437";
    String licensePlate = "HOT435";

    Owner owner = Owner.of(document, documentType, firstName, lastName, email, city, rut, phone, licensePlate);

    Assertions.assertEquals(12345, owner.getDocument());
    Assertions.assertEquals("2", owner.getDocumentType());
    Assertions.assertEquals("Jorge", owner.getFirstName());
    Assertions.assertEquals("Lima", owner.getLastName());
    Assertions.assertEquals("ldjorge1988@gmail.com", owner.getEmail());
    Assertions.assertEquals("Medellín", owner.getCity());
    Assertions.assertEquals("1233248", owner.getRut());
    Assertions.assertEquals("3217187437", owner.getPhone());
    Assertions.assertEquals("HOT435", owner.getLicensePlate());

  }

  @Test
  void validateNullFields() {
    //arrange
    int document = 12345;
    String documentType = null;

    Assertions.assertEquals(REQUIRED_FIELD_NULL_EMPTY,Assertions.assertThrows(IllegalArgumentException.class, () ->
        Owner.of(document, documentType)
    ).getMessage());

  }

  @Test
  void validateEmptyFields() {
    //arrange
    int document = 12345;
    String documentType = "";

    Assertions.assertEquals(REQUIRED_FIELD_NULL_EMPTY,Assertions.assertThrows(IllegalArgumentException.class, () ->
        Owner.of(document, documentType)
    ).getMessage());

  }

}
