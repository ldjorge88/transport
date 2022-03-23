package co.com.edu.uco.ing.software.project.transports.domain.model;

import static co.com.edu.uco.ing.software.project.transports.domain.util.Constant.*;

public class DocumentTypeBuilder {

  private String code = "CC";
  private String name = NAME_DOCUMENT_TYPE;
  private String description = DESCRIPTION_DOCUMENT_TYPE;

  public DocumentTypeBuilder() {

  }

  public DocumentTypeBuilder setCode(String code) {
    this.code = code;
    return this;
  }

  public DocumentTypeBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public DocumentTypeBuilder setDescription(String description) {
    this.description = description;
    return this;
  }

  public DocumentType build() {
    return DocumentType.builder()
        .code(code)
        .name(name)
        .description(description)
        .build();
  }

}
