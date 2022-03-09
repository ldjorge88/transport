package co.com.edu.uco.ing.software.project.transports.domain.service.owner;

import co.com.edu.uco.ing.software.project.transports.domain.model.Owner;
import co.com.edu.uco.ing.software.project.transports.domain.port.OwnerRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class FindOwnerService {

  private static final String ERROR_MESSAGE = "El propietario con los datos ingresados no existe en la la fuente de información";
  private final OwnerRepository ownerRepository;

  public FindOwnerService(OwnerRepository ownerRepository) {
    this.ownerRepository = ownerRepository;
  }

  public Owner execute(int documentId) {
    Owner owner = this.ownerRepository.findByDocument(documentId);
    if (ObjectUtils.isEmpty(owner)){
      throw new IllegalStateException(ERROR_MESSAGE);
    }
    return owner;
  }

}
