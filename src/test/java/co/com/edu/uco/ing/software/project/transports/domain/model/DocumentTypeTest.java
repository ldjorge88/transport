package co.com.edu.uco.ing.software.project.transports.domain.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DocumentTypeTest {

  @Test
  void validateSuccesfulCreation() {
    //arrange
    String code = "CC";
    String name = "Cédula de ciudadania";
    String description = "tipo de documento de identificación Colombiana";

    //act
    DocumentType documentType = new DocumentType();
    documentType.setCode(code);
    documentType.setName(name);
    documentType.setDescription(description);

    //assert
    Assertions.assertEquals("CC", documentType.getCode());
    Assertions.assertEquals("Cédula de ciudadania", documentType.getName());
    Assertions.assertEquals("tipo de documento de identificación Colombiana", documentType.getDescription());
  }

  @Test
  void validateNullCodeRequiredFields() {
    //arrange
    String code = null;
    String name = "Cédula de ciudadania";
    String description = "tipo de documento de identificación Colombiana";

    //act - assert
    Assertions.assertEquals("code is marked non-null but is null", Assertions.assertThrows(NullPointerException.class, () ->
        DocumentType.builder()
            .code(code)
            .name(name)
            .description(description)
            .build()
    ).getMessage());
  }

  @Test
  void validateNullNameRequiredFields() {
    //arrange
    String code = "CC";
    String name = null;
    String description = "tipo de documento de identificación Colombiana";

    //act - assert
    Assertions.assertEquals("name is marked non-null but is null", Assertions.assertThrows(NullPointerException.class, () ->
        DocumentType.builder()
            .code(code)
            .name(name)
            .description(description)
            .build()
    ).getMessage());
  }
}
