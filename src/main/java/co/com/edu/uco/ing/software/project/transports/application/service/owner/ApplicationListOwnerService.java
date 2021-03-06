package co.com.edu.uco.ing.software.project.transports.application.service.owner;

import co.com.edu.uco.ing.software.project.transports.application.mapper.ApplicationOwnerConverter;
import co.com.edu.uco.ing.software.project.transports.application.dto.OwnerDTO;
import co.com.edu.uco.ing.software.project.transports.application.enums.ErrorMessage;
import co.com.edu.uco.ing.software.project.transports.application.exception.TransportNoContentException;
import co.com.edu.uco.ing.software.project.transports.domain.model.Owner;
import co.com.edu.uco.ing.software.project.transports.domain.port.OwnerRepository;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Component
public class ApplicationListOwnerService {

  private final OwnerRepository ownerRepository;
  private final ApplicationOwnerConverter ownerConverter;

  public ApplicationListOwnerService(OwnerRepository ownerRepository, ApplicationOwnerConverter ownerConverter) {
    this.ownerRepository = ownerRepository;
    this.ownerConverter = ownerConverter;
  }

  public List<OwnerDTO> execute() {
    List<Owner> ownerList = ownerRepository.getList();

    if (ObjectUtils.isEmpty(ownerList)) {
      throw new TransportNoContentException(ErrorMessage.U_ENTITY_NOT_FOUND);
    }

    return ownerConverter.getOwnerDTOList(ownerList);
  }

}
