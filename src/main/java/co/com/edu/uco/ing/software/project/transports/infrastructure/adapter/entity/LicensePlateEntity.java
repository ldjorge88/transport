package co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "license_plate")
@NoArgsConstructor
@AllArgsConstructor
public class LicensePlateEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  @NonNull
  private String codePlate;
  private String description;

}
