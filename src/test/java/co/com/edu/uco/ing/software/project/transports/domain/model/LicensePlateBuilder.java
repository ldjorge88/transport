package co.com.edu.uco.ing.software.project.transports.domain.model;

public class LicensePlateBuilder {

  private String codePlate = "ABC123";
  private String description = "placa de automovil de ejemplo";

  public LicensePlateBuilder() {

  }

  public LicensePlateBuilder setCodePlate(String codePlate) {
    this.codePlate = codePlate;
    return this;
  }

  public LicensePlateBuilder setDescription(String description) {
    this.description = description;
    return this;
  }

  public LicensePlate build() {
    return LicensePlate.builder()
        .codePlate(codePlate)
        .description(description)
        .build();
  }
}
