package co.com.edu.uco.ing.software.project.transports.domain.util;

import java.util.regex.Pattern;

public class Constant {

  //email validator pattern
  public static final Pattern EMAIL_PATTERN = Pattern
      .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
          + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

}
