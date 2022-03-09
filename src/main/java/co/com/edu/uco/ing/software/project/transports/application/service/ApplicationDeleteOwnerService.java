package co.com.edu.uco.ing.software.project.transports.application.service;

import co.com.edu.uco.ing.software.project.transports.application.dto.OwnerDTO;
import co.com.edu.uco.ing.software.project.transports.application.dto.OwnerResponseDTO;
import co.com.edu.uco.ing.software.project.transports.domain.model.Owner;
import co.com.edu.uco.ing.software.project.transports.domain.service.owner.DeleteOwnerService;
import org.springframework.stereotype.Component;

@Component
public class ApplicationDeleteOwnerService {

  private final DeleteOwnerService deleteOwnerService;

  public ApplicationDeleteOwnerService(DeleteOwnerService deleteOwnerService) {
    this.deleteOwnerService = deleteOwnerService;
  }

  public OwnerResponseDTO execute(OwnerDTO ownerDTO) {

    Owner owner = Owner.ownerBuilder(ownerDTO.getDocument(), ownerDTO.getDocumentType(), ownerDTO.getFirstName(), ownerDTO.getLastName(), ownerDTO.getEmail(),
        ownerDTO.getCity(), ownerDTO.getRut(), ownerDTO.getPhone(), ownerDTO.getLicensePlate(), false);

    return new OwnerResponseDTO<>(deleteOwnerService.execute(owner));
  }

}
