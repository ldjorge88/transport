package co.com.edu.uco.ing.software.project.transports.application.exception;

import co.com.edu.uco.ing.software.project.transports.application.enums.ErrorMessage;
import lombok.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class TransportBadRequestException extends TransportRuntimeException {
  public TransportBadRequestException(@NonNull ErrorMessage userMessage) {
    super(userMessage);
  }
}
