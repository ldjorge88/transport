package co.com.edu.uco.ing.software.project.transports.application.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DocumentTypeDTO implements Serializable {

  @NonNull
  private String code;
  @NonNull
  private String name;
  private String description;

}
