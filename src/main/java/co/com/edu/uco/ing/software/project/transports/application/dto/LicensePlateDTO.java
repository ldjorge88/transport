package co.com.edu.uco.ing.software.project.transports.application.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LicensePlateDTO implements Serializable {

  @NonNull
  private String codePlate;
  private String description;

}
