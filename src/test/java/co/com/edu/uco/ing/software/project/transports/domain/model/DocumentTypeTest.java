package co.com.edu.uco.ing.software.project.transports.domain.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static co.com.edu.uco.ing.software.project.transports.domain.util.Constant.*;

public class DocumentTypeTest {

  @Test
  void validateSuccesfulCreation() {
    //act
    DocumentType documentType = new DocumentTypeBuilder()
        .setDescription("Tipo de documento de prueba")
        .build();

    //assert
    Assertions.assertEquals(CODE_DOCUMENT_TYPE, documentType.getCode());
    Assertions.assertEquals(NAME_DOCUMENT_TYPE, documentType.getName());
    Assertions.assertNotNull(DESCRIPTION_DOCUMENT_TYPE, documentType.getDescription());
  }

  @Test
  void setDataAfterCreation() {
    //act
    DocumentType documentType = new DocumentType();
    documentType.setCode("TI");
    documentType.setName("Tarjeta de identidad");
    documentType.setDescription("Tipo de documento para prueba");

    //assert
    Assertions.assertNotNull(CODE_DOCUMENT_TYPE, documentType.getCode());
    Assertions.assertNotNull(NAME_DOCUMENT_TYPE, documentType.getName());
    Assertions.assertNotNull(DESCRIPTION_DOCUMENT_TYPE, documentType.getDescription());
  }

  @Test
  void validateNullCodeRequiredFields() {
    //act - assert
    Assertions.assertEquals(CODE_IS_NULL_VALUE, Assertions.assertThrows(NullPointerException.class, () ->
        new DocumentTypeBuilder()
            .setCode(null)
            .build()
    ).getMessage());
  }

  @Test
  void validateNullNameRequiredFields() {
    //act - assert
    Assertions.assertEquals(NAME_IS_NULL_VALUE, Assertions.assertThrows(NullPointerException.class, () ->
        new DocumentTypeBuilder()
            .setName(null)
            .build()
    ).getMessage());
  }
}
