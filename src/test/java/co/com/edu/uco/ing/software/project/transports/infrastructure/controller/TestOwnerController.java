package co.com.edu.uco.ing.software.project.transports.infrastructure.controller;

import co.com.edu.uco.ing.software.project.transports.application.dto.OwnerDTO;
import co.com.edu.uco.ing.software.project.transports.application.dto.OwnerResponseDTO;
import co.com.edu.uco.ing.software.project.transports.domain.port.OwnerRepository;
import co.com.edu.uco.ing.software.project.transports.infrastructure.ApplicationMock;
import co.com.edu.uco.ing.software.project.transports.infrastructure.ownertestdatabuilder.TestOwnerDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = ApplicationMock.class)
@ActiveProfiles("test")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class TestOwnerController {

  @Autowired
  OwnerRepository ownerRepository;
  @Autowired
  private ObjectMapper objectMapper;
  @Autowired
  private MockMvc mocMvc;

  //@Test
  //@DisplayName("crear y validar")
  void testCreate() throws Exception {
    //arragne
    var dto = new TestOwnerDataBuilder().build();
    create(dto);
  }

  public void create(OwnerDTO ownerDTO) throws Exception{

    // act
    var result = mocMvc.perform(MockMvcRequestBuilders.post("/api-owner")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(ownerDTO))
        )
        .andExpect(status().isOk())
        .andReturn();

    //assert
    var jsonResult = result.getResponse().getContentAsString();
    OwnerResponseDTO<Integer> response = objectMapper.readValue(jsonResult, OwnerResponseDTO.class);

    Long id = response.getValue().longValue();
    Assertions.assertNotNull(id);

    var owner = ownerRepository.findByDocument(ownerDTO.getDocument());

    Assertions.assertEquals(ownerDTO.getFirstName(), owner.getFirstName());
    Assertions.assertEquals(ownerDTO.getLastName(), owner.getLastName());
  }

  //@Test
  //@DisplayName("Debe listar las personas luego de crearlas")
  void testList() throws Exception {

    var dto = new TestOwnerDataBuilder().build();

    create(dto);

    mocMvc.perform(get("/api-owners")
            .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        //.andReturn().getResponse().getContentAsString()
        .andExpect(jsonPath("$[0].firstName", is(dto.getFirstName())))
        .andExpect(jsonPath("$[0].lastName", is(dto.getLastName())));
  }
}
