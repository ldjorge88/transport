package co.com.edu.uco.ing.software.project.transports.domain.model;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DocumentType {

  @NonNull
  private String code;
  @NonNull
  private String name;
  private String description;

}
