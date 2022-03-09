package co.com.edu.uco.ing.software.project.transports.domain.util;

import java.util.regex.Pattern;

public class Constant {

  //email validator pattern
  public static final Pattern EMAIL_PATTERN = Pattern
      .compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");

}
