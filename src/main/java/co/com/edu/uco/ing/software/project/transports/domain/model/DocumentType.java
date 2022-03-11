package co.com.edu.uco.ing.software.project.transports.domain.model;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DocumentType {

  private String code;
  private String name;
  private String description;

}
