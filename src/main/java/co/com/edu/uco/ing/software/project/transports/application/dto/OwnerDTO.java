package co.com.edu.uco.ing.software.project.transports.application.dto;

public class OwnerDTO {

  private int document;
  private String documentType;
  private String firstName;
  private String lastName;
  private String email;
  private String city;
  private String rut;
  private String phone;
  private String licensePlate;
  private String dateOfBirth;

  public OwnerDTO() {
  }

  public OwnerDTO(int document, String documentType, String firstName, String lastName, String email, String city, String rut, String phone, String licensePlate, String dateOfBirth) {
    this.document = document;
    this.documentType = documentType;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.city = city;
    this.rut = rut;
    this.phone = phone;
    this.licensePlate = licensePlate;
    this.dateOfBirth = dateOfBirth;
  }

  public int getDocument() {
    return document;
  }

  public void setDocument(int document) {
    this.document = document;
  }

  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getRut() {
    return rut;
  }

  public void setRut(String rut) {
    this.rut = rut;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

}
