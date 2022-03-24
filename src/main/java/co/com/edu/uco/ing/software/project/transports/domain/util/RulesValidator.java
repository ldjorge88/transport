package co.com.edu.uco.ing.software.project.transports.domain.util;

import co.com.edu.uco.ing.software.project.transports.application.enums.ErrorMessage;
import co.com.edu.uco.ing.software.project.transports.application.exception.TransportBadRequestException;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static co.com.edu.uco.ing.software.project.transports.domain.util.Message.ILEGAL_AGE;
import static co.com.edu.uco.ing.software.project.transports.domain.util.Message.INVALID_EMAIL;
import static org.springframework.util.ObjectUtils.isEmpty;
import static org.springframework.util.StringUtils.hasLength;

@Slf4j
public class RulesValidator {

  public static final Pattern EMAIL_PATTERN = Pattern
      .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
  public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  public static void validateObjectRequired(Object object, String message) {
    if (isEmpty(object)) throw new IllegalArgumentException(message);
  }

  public static void emailValidator(String email) {
    Matcher mather = EMAIL_PATTERN.matcher(email);
    if (!mather.find()) throw new IllegalArgumentException(INVALID_EMAIL);
  }

  public static void ofLegalAge(String dateIn) {
    LocalDate dateOfBirth = LocalDate.parse(dateIn, formatter);
    Period age = Period.between(dateOfBirth, LocalDate.now());
    if (age.getYears() < 18) throw new IllegalArgumentException(ILEGAL_AGE);
  }

  public static void stringValidator(String stringValue) {
    if (!hasLength(stringValue)) throw new TransportBadRequestException(ErrorMessage.T_NULL_OR_BLANK_PARAMETER);
  }

}
