package co.com.edu.uco.ing.software.project.transports.domain.model;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
public class DocumentType {

  private int id;
  @NonNull
  private String code;
  @NonNull
  private String name;
  private String description;

}
