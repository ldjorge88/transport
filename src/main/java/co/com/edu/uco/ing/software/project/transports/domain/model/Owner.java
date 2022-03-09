package co.com.edu.uco.ing.software.project.transports.domain.model;

import static co.com.edu.uco.ing.software.project.transports.domain.util.Message.REQUIRED_FIELD_NULL_EMPTY;
import static co.com.edu.uco.ing.software.project.transports.domain.util.RulesValidator.validateObjectRequired;

public class Owner {

  private String lastName;
  private String email;
  private String city;
  private String rut;
  private String phone;
  private String licensePlate;
  private int document;
  private String documentType;
  private String firstName;

  private Owner(int document, String documentType) {
    this.document = document;
    this.documentType = documentType;
  }

  private Owner(int document, String documentType, String firstName, String lastName, String email,
                String city, String rut, String phone, String licensePlate) {
    this.document = document;
    this.documentType = documentType;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.city = city;
    this.rut = rut;
    this.phone = phone;
    this.licensePlate = licensePlate;
  }

  public static Owner of(int document, String documentType, String firstName, String lastName, String email,
                         String city, String rut, String phone, String licensePlate) {

      validateObjectRequired(document, REQUIRED_FIELD_NULL_EMPTY);
      validateObjectRequired(documentType, REQUIRED_FIELD_NULL_EMPTY);
      validateObjectRequired(firstName, REQUIRED_FIELD_NULL_EMPTY);
      validateObjectRequired(lastName, REQUIRED_FIELD_NULL_EMPTY);
      validateObjectRequired(email, REQUIRED_FIELD_NULL_EMPTY);
      validateObjectRequired(city, REQUIRED_FIELD_NULL_EMPTY);
      validateObjectRequired(rut, REQUIRED_FIELD_NULL_EMPTY);
      validateObjectRequired(phone, REQUIRED_FIELD_NULL_EMPTY);
      validateObjectRequired(licensePlate, REQUIRED_FIELD_NULL_EMPTY);

    return new Owner(document, documentType, firstName, lastName, email, city, rut, phone, licensePlate);
  }

  public static Owner of(int document, String documentType) {

    validateObjectRequired(document, REQUIRED_FIELD_NULL_EMPTY);
    validateObjectRequired(documentType, REQUIRED_FIELD_NULL_EMPTY);

    return new Owner(document, documentType);
  }

  public int getDocument() {
    return document;
  }

  public Owner setDocument(int document) {
    validateObjectRequired(document, REQUIRED_FIELD_NULL_EMPTY);
    this.document = document;
    return this;
  }

  public String getDocumentType() {
    return documentType;
  }

  public Owner setDocumentType(String documentType) {
    validateObjectRequired(documentType, REQUIRED_FIELD_NULL_EMPTY);
    this.documentType = documentType;
    return this;
  }

  public String getFirstName() {
    return firstName;
  }

  public Owner setFirstName(String firstName) {
    validateObjectRequired(firstName, REQUIRED_FIELD_NULL_EMPTY);
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public Owner setLastName(String lastName) {
    validateObjectRequired(lastName, REQUIRED_FIELD_NULL_EMPTY);
    this.lastName = lastName;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public Owner setEmail(String email) {
    validateObjectRequired(email, REQUIRED_FIELD_NULL_EMPTY);
    this.email = email;
    return this;
  }

  public String getCity() {
    return city;
  }

  public Owner setCity(String city) {
    validateObjectRequired(city, REQUIRED_FIELD_NULL_EMPTY);
    this.city = city;
    return this;
  }

  public String getRut() {
    return rut;
  }

  public Owner setRut(String rut) {
    validateObjectRequired(rut, REQUIRED_FIELD_NULL_EMPTY);
    this.rut = rut;
    return this;
  }

  public String getPhone() {
    return phone;
  }

  public Owner setPhone(String phone) {
    validateObjectRequired(phone, REQUIRED_FIELD_NULL_EMPTY);
    this.phone = phone;
    return this;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public Owner setLicensePlate(String licensePlate) {
    validateObjectRequired(licensePlate, REQUIRED_FIELD_NULL_EMPTY);
    this.licensePlate = licensePlate;
    return this;
  }
}
