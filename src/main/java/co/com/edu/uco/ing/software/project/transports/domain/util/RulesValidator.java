package co.com.edu.uco.ing.software.project.transports.domain.util;

import static org.springframework.util.ObjectUtils.isEmpty;

public class RulesValidator {

  public static void validateObjectRequired(Object object, String message) {
    if (isEmpty(object)) throw new IllegalArgumentException(message);
  }

}
