package co.com.edu.uco.ing.software.project.transports.domain.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DocumentType {

  @NonNull
  private String code;
  @NonNull
  private String name;
  private String description;

}
