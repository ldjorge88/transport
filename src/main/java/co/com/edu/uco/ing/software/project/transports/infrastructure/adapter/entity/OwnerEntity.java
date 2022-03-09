package co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.entity;

import javax.persistence.*;

@Entity
@Table(name = "owner_test_two")
public class OwnerEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private int document;
  private String documentType;
  private String firstName;
  private String lastName;
  private String email;
  private String city;
  private String rut;
  private String phone;
  private String licensePlate;

  public OwnerEntity() {
  }

  public OwnerEntity(int document, String documentType, String firstName, String lastName,
                     String email, String city, String rut, String phone, String licensePlate) {
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

  public Long getId() {
    return id;
  }

  public int getDocument() {
    return document;
  }

  public String getDocumentType() {
    return documentType;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public String getCity() {
    return city;
  }

  public String getRut() {
    return rut;
  }

  public String getPhone() {
    return phone;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setDocument(int document) {
    this.document = document;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
}
