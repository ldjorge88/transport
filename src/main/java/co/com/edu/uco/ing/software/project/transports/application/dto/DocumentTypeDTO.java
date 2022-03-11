package co.com.edu.uco.ing.software.project.transports.application.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DocumentTypeDTO implements Serializable {

  private String code;
  private String name;
  private String description;

}
