package co.com.edu.uco.ing.software.project.transports.domain.service;

import co.com.edu.uco.ing.software.project.transports.application.exception.TransportBadRequestException;
import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;
import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentTypeBuilder;
import co.com.edu.uco.ing.software.project.transports.domain.port.DocumentTypeRepository;
import co.com.edu.uco.ing.software.project.transports.domain.service.documenttype.FindAllDocumentTypeService;
import co.com.edu.uco.ing.software.project.transports.domain.service.documenttype.SaveDocumentTypeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static co.com.edu.uco.ing.software.project.transports.application.enums.ErrorMessage.U_EXISTING_RECORD;

public class DocumentTypeServiceTest {

  @Test
  void successfulDocumentTypeCreation() {

    //arrange
    var documentType = new DocumentTypeBuilder().build();

    var documentTypeRepository = Mockito.mock(DocumentTypeRepository.class);
    var documentTypeService = new SaveDocumentTypeService(documentTypeRepository);

    Mockito.when(documentTypeRepository.save(Mockito.any(DocumentType.class))).thenReturn(1L);

    //act
    var id = documentTypeService.create(documentType);

    //assert
    Mockito.verify(documentTypeRepository, Mockito.times(1)).save(documentType);
    Assertions.assertEquals(1L, id);

  }

  @Test
  void errorCreationIdentityDocumentExists() {

    //arrange
    var documentType = new DocumentTypeBuilder().build();

    var documentTypeRepository = Mockito.mock(DocumentTypeRepository.class);
    var documentTypeService = new SaveDocumentTypeService(documentTypeRepository);

    Mockito.when(documentTypeRepository.exists(Mockito.any())).thenReturn(true);

    //act - assert
    Assertions.assertEquals(U_EXISTING_RECORD.getMessage(),
        Assertions.assertThrows(TransportBadRequestException.class, () ->
                documentTypeService.create(documentType))
            .getMessage());
  }

  @Test
  void successfulDocumentTypeFindAll() {

    //arrange
    var documentTypeRepository = Mockito.mock(DocumentTypeRepository.class);
    var documentTypeService = new FindAllDocumentTypeService(documentTypeRepository);

    DocumentType documentType1 = new DocumentTypeBuilder()
        .setCode("CC1")
        .setName("Cedula 1")
        .setDescription("Tipo de documento de prueba 1")
        .build();

    DocumentType documentType2 = new DocumentTypeBuilder()
        .setCode("CC2")
        .setName("Cedula 2")
        .setDescription("Tipo de documento de prueba 2")
        .build();

    DocumentType documentType3 = new DocumentTypeBuilder()
        .setCode("CC3")
        .setName("Cedula 3")
        .setDescription("Tipo de documento de prueba 3")
        .build();

    List<DocumentType> documentTypeListExpected = new ArrayList<>();
    documentTypeListExpected.add(documentType1);
    documentTypeListExpected.add(documentType2);
    documentTypeListExpected.add(documentType3);

    Mockito.when(documentTypeRepository.findAll()).thenReturn(Arrays.asList(documentType1, documentType2, documentType3));
    List<DocumentType> documentTypeListResponse = documentTypeService.geList();

    Assertions.assertEquals(documentTypeListExpected, documentTypeListResponse);
  }

}
