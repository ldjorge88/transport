package co.com.edu.uco.ing.software.project.transports.application.exception;

import co.com.edu.uco.ing.software.project.transports.application.enums.ErrorMessage;
import lombok.*;

public class TransportRuntimeException extends RuntimeException {
  private final ErrorMessage userMessage;

  public TransportRuntimeException(ErrorMessage userMessage) {
    super(userMessage.getMessage());
    this.userMessage = userMessage;
  }

  public ErrorMessage getUserMessage() {
    return userMessage;
  }
}