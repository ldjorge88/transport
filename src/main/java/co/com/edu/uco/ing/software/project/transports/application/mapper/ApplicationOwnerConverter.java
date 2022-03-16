package co.com.edu.uco.ing.software.project.transports.application.mapper;

import co.com.edu.uco.ing.software.project.transports.application.dto.OwnerDTO;
import co.com.edu.uco.ing.software.project.transports.domain.model.Owner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ApplicationOwnerConverter {

  public OwnerDTO getOwnerDTO(Owner owner) {
    OwnerDTO ownerDTO = new OwnerDTO();
    ownerDTO.setDocument(owner.getDocument());
    ownerDTO.setDocumentType(owner.getDocumentType());
    ownerDTO.setFirstName(owner.getFirstName());
    ownerDTO.setLastName(owner.getLastName());
    ownerDTO.setEmail(owner.getEmail());
    ownerDTO.setCity(owner.getCity());
    ownerDTO.setPhone(owner.getPhone());
    ownerDTO.setRut(owner.getRut());
    ownerDTO.setLicensePlate(owner.getLicensePlate());
    return ownerDTO;
  }

  public List<OwnerDTO> getOwnerDTOList(List<Owner> ownerList) {
    List<OwnerDTO> ownerDTOList = new ArrayList<>();
    ownerList.forEach(owner -> {
      OwnerDTO ownerDTO = getOwnerDTO(owner);
      ownerDTOList.add(ownerDTO);
    });
    return ownerDTOList;
  }

}
