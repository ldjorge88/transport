package co.com.edu.uco.ing.software.project.transports.application.service.owner;

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

    Owner owner = Owner.ownerBuilder(ownerDTO.getDocument(), ownerDTO.getDocumentType());

    return new OwnerResponseDTO<>(deleteOwnerService.execute(owner));
  }

}
