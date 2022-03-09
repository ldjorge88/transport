package co.com.edu.uco.ing.software.project.transports.application.service;

import co.com.edu.uco.ing.software.project.transports.application.dto.OwnerDTO;
import co.com.edu.uco.ing.software.project.transports.application.dto.OwnerResponseDTO;
import co.com.edu.uco.ing.software.project.transports.domain.model.Owner;
import co.com.edu.uco.ing.software.project.transports.domain.service.owner.SaveOwnerService;
import org.springframework.stereotype.Component;

@Component
public class ApplicationSaveOwmerService {

  private final SaveOwnerService saveOwnerService;

  public ApplicationSaveOwmerService(SaveOwnerService saveOwnerService) {
    this.saveOwnerService = saveOwnerService;
  }

  public OwnerResponseDTO execute(OwnerDTO ownerDTO) {

    Owner owner = Owner.ownerBuilder(ownerDTO.getDocument(), ownerDTO.getDocumentType())
        .setFirstName(ownerDTO.getFirstName())
        .setLastName(ownerDTO.getLastName())
        .setEmail(ownerDTO.getEmail())
        .setCity(ownerDTO.getCity())
        .setRut(ownerDTO.getRut())
        .setPhone(ownerDTO.getPhone())
        .setLicensePlate(ownerDTO.getLicensePlate());
    
    return new OwnerResponseDTO<>(this.saveOwnerService.execute(owner));

  }
}
