package co.com.edu.uco.ing.software.project.transports.application.exception;

import co.com.edu.uco.ing.software.project.transports.application.enums.ErrorMessage;
import lombok.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NO_CONTENT)
public class TransportNoContentException extends TransportRuntimeException {
  public TransportNoContentException(@NonNull ErrorMessage userMessage) {
    super(userMessage);
  }
}
