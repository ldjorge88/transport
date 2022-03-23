package co.com.edu.uco.ing.software.project.transports.domain.model;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LicensePlate {

  @NonNull
  private String codePlate;
  private String description;

}
