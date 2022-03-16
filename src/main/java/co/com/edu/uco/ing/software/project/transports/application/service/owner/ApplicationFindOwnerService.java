package co.com.edu.uco.ing.software.project.transports.application.service.owner;

import co.com.edu.uco.ing.software.project.transports.application.mapper.ApplicationOwnerConverter;
import co.com.edu.uco.ing.software.project.transports.application.dto.OwnerDTO;
import co.com.edu.uco.ing.software.project.transports.domain.model.Owner;
import co.com.edu.uco.ing.software.project.transports.domain.service.owner.FindOwnerService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class ApplicationFindOwnerService {
  private final FindOwnerService findOwnerService;
  private final ApplicationOwnerConverter ownerConverter;

  public ApplicationFindOwnerService(FindOwnerService findOwnerService, ApplicationOwnerConverter ownerConverter) {
    this.findOwnerService = findOwnerService;
    this.ownerConverter = ownerConverter;
  }

  public OwnerDTO execute(int documentId) {
    Owner owner = findOwnerService.execute(documentId);
    if (!ObjectUtils.isEmpty(owner)) {
      return ownerConverter.getOwnerDTO(owner);
    } else {
      return null;
    }
  }
}
