package co.com.edu.uco.ing.software.project.transports.application.exception;

import co.com.edu.uco.ing.software.project.transports.application.enums.ErrorMessage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TransportRuntimeException extends RuntimeException {
  @NonNull
  private final ErrorMessage userMessage;
}
