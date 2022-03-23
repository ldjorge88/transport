package co.com.edu.uco.ing.software.project.transports.application.mapper;

import co.com.edu.uco.ing.software.project.transports.application.dto.LicensePlateDTO;
import co.com.edu.uco.ing.software.project.transports.domain.model.LicensePlate;
import co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.entity.LicensePlateEntity;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface LicensePlateMapper {

  LicensePlateMapper LICENSE_PLATE_MAPPER = Mappers.getMapper(LicensePlateMapper.class);

  LicensePlate licensePlateDTOToLicensePlate(LicensePlateDTO licensePlateDTO);

  LicensePlateDTO licensePlateTOLicensePlateDTO(LicensePlate licensePlate);

    // TODO esto debería de estar en la capa de infraestrucctura por visibilidad de capas ?
  LicensePlateEntity lincensePlateTOLicensePlateEntity(LicensePlate licensePlate);

  LicensePlate licensePlateEntityToLicensePlate(LicensePlateEntity licensePlateEntity);

  List<LicensePlate> licensePlateEntityListToLicensePlateList(List<LicensePlateEntity> licensePlateEntities);

  List<LicensePlateDTO> licensePlateListToLicensePlateDTOList(List<LicensePlate> licensePlates);
}
