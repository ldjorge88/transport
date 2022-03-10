package co.com.edu.uco.ing.software.project.transports.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class DocumentTypeDTO implements Serializable {

  private String code;
  private String name;
  private String description;

}
