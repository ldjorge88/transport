package co.com.edu.uco.ing.software.project.transports.infrastructure.ownertestdatabuilder;

import co.com.edu.uco.ing.software.project.transports.application.dto.OwnerDTO;

public class TestOwnerDataBuilder {

  private int document;
  private String documentType;
  private String firstName = "Jorge";
  private String lastName = "Lima";
  private String email = "ldjorge1988@gmail.com";
  private String city = "Medellín";
  private String rut = "1233248";
  private String phone = "3217187437";
  private String licensePlate = "HOT435";

  public TestOwnerDataBuilder() {
    this.document = 41342;
    this.documentType = "2";
  }

  public int getDocument() {
    return document;
  }

  public TestOwnerDataBuilder setDocument(int document) {
    this.document = document;
    return this;
  }

  public String getDocumentType() {
    return documentType;
  }

  public TestOwnerDataBuilder setDocumentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

  public String getFirstName() {
    return firstName;
  }

  public TestOwnerDataBuilder setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public TestOwnerDataBuilder setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public TestOwnerDataBuilder setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getCity() {
    return city;
  }

  public TestOwnerDataBuilder setCity(String city) {
    this.city = city;
    return this;
  }

  public String getRut() {
    return rut;
  }

  public TestOwnerDataBuilder setRut(String rut) {
    this.rut = rut;
    return this;
  }

  public String getPhone() {
    return phone;
  }

  public TestOwnerDataBuilder setPhone(String phone) {
    this.phone = phone;
    return this;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public TestOwnerDataBuilder setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
    return this;
  }

  public OwnerDTO build() {
    return new OwnerDTO(document, documentType, firstName, lastName,
        email, city, rut, phone, licensePlate);
  }
}
