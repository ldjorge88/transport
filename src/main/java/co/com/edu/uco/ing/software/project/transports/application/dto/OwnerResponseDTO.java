package co.com.edu.uco.ing.software.project.transports.application.dto;

public class OwnerResponseDTO<T> {
  private T value;

  public OwnerResponseDTO() {

  }

  public OwnerResponseDTO(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }
}
