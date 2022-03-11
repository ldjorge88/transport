package co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "document_type")
public class DocumentTypeEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  @NonNull
  private String code;
  @NonNull
  private String name;
  private String description;

}

