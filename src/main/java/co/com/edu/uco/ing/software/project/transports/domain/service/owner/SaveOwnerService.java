package co.com.edu.uco.ing.software.project.transports.domain.service.owner;

import co.com.edu.uco.ing.software.project.transports.domain.model.Owner;
import co.com.edu.uco.ing.software.project.transports.domain.port.OwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class SaveOwnerService {

  private static final String EXISTS_MESSAGE = "existing record with the parameters entered";
  private final OwnerRepository ownerRepository;

  public SaveOwnerService(OwnerRepository ownerRepository) {
    this.ownerRepository = ownerRepository;
  }

  public long execute(Owner owner) {
    if (this.ownerRepository.exists(owner)) {
      throw new IllegalStateException(EXISTS_MESSAGE);
    }
    return this.ownerRepository.save(owner);
  }

}
