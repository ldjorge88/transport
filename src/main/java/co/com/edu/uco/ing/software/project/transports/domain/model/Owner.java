package co.com.edu.uco.ing.software.project.transports.domain.model;

import static co.com.edu.uco.ing.software.project.transports.domain.util.Message.REQUIRED_FIELD_NULL_EMPTY;
import static co.com.edu.uco.ing.software.project.transports.domain.util.RulesValidator.*;

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
  private String dateOfBirth;

  private Owner(int document, String documentType) {
    setDocument(document);
    setDocumentType(documentType);
  }

  public static void validateOwner(Owner owner) {

    validateObjectRequired(owner.document, REQUIRED_FIELD_NULL_EMPTY);
    validateObjectRequired(owner.documentType, REQUIRED_FIELD_NULL_EMPTY);
    validateObjectRequired(owner.firstName, REQUIRED_FIELD_NULL_EMPTY);
    validateObjectRequired(owner.lastName, REQUIRED_FIELD_NULL_EMPTY);
    validateObjectRequired(owner.email, REQUIRED_FIELD_NULL_EMPTY);
    emailValidator(owner.email);
    stringValidator(owner.dateOfBirth);
    ofLegalAge(owner.dateOfBirth);
    validateObjectRequired(owner.city, REQUIRED_FIELD_NULL_EMPTY);
    validateObjectRequired(owner.rut, REQUIRED_FIELD_NULL_EMPTY);
    validateObjectRequired(owner.phone, REQUIRED_FIELD_NULL_EMPTY);
    validateObjectRequired(owner.licensePlate, REQUIRED_FIELD_NULL_EMPTY);

  }

  public static Owner ownerBuilder(int document, String documentType) {

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
    emailValidator(email);
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

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public Owner setDateOfBirth(String dateOfBirth) {
    stringValidator(dateOfBirth);
    ofLegalAge(dateOfBirth);
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  public Owner build() {
    validateOwner(this);
    return this;
  }
}
