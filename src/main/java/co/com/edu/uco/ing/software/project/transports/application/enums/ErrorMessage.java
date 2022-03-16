package co.com.edu.uco.ing.software.project.transports.application.enums;

public enum ErrorMessage {

  // TODO crear repositorio centralizado para cambiar mensajes quemados en códigos
  //      por códigos como clave y el valor sea mapeado en repositorio donde se pueda
  //      consultar el valor a mostrar

  //user message
  U_ENTITY_NOT_FOUND("entity not found"),
  U_RUNTIME_ERROR("a new development occurred - consult with the technical area"),
  U_EXISTING_RECORD("existing record with the parameters entered"),
  U_NULL_OR_BLANK_PARAMETER("null or blank mandatory parameters"),

  // TODO crear repositorio centralizado para cambiar mensajes quemados en códigos
  //      por códigos como clave y el valor sea mapeado en repositorio donde se pueda
  //      consultar el valor a mostrar

  //technical message
  T_ENTITY_NOT_FOUND("entity not found -> "),
  T_RUNTIME_ERROR("runtime error in -> "),
  T_EXISTING_RECORD("existing record with parameters -> "),
  T_NULL_OR_BLANK_PARAMETER("null or blank mandatory parameters -> ");

  private String message;

  ErrorMessage(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

}
