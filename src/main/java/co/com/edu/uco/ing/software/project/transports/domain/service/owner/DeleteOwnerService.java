package co.com.edu.uco.ing.software.project.transports.domain.service.owner;

import co.com.edu.uco.ing.software.project.transports.domain.model.Owner;
import co.com.edu.uco.ing.software.project.transports.domain.port.OwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteOwnerService {

  private static final String ERROR_MESSAGE = "El propietario con los datos ingresados no existe en la la fuente de información";
  private final OwnerRepository ownerRepository;

  public DeleteOwnerService(OwnerRepository ownerRepository) {
    this.ownerRepository = ownerRepository;
  }

  public long execute(Owner owner) {
    if (!this.ownerRepository.exists(owner)) {
      throw new IllegalStateException(ERROR_MESSAGE);
    }
    return this.ownerRepository.delete(owner);
  }

}
