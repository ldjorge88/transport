package co.com.edu.uco.ing.software.project.transports.domain.util;

import co.com.edu.uco.ing.software.project.transports.application.enums.ErrorMessage;
import co.com.edu.uco.ing.software.project.transports.application.exception.TransportBadRequestException;

import java.util.regex.Matcher;

import static co.com.edu.uco.ing.software.project.transports.domain.util.Constant.EMAIL_PATTERN;
import static co.com.edu.uco.ing.software.project.transports.domain.util.Message.INVALID_EMAIL;
import static org.springframework.util.ObjectUtils.isEmpty;
import static org.springframework.util.StringUtils.hasLength;

public class RulesValidator {

  public static void validateObjectRequired(Object object, String message) {
    if (isEmpty(object)) throw new IllegalArgumentException(message);
  }

  public static void emailValidator(String email) {
    Matcher mather = EMAIL_PATTERN.matcher(email);
    if (!mather.find()) throw new IllegalArgumentException(INVALID_EMAIL);
  }

  public static void stringValidator(String stringValue) {
    if (!hasLength(stringValue)) {
      throw new TransportBadRequestException(ErrorMessage.T_NULL_OR_BLANK_PARAMETER);
    }
  }

}
