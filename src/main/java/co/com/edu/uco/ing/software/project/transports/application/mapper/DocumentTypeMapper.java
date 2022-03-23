package co.com.edu.uco.ing.software.project.transports.application.mapper;

import co.com.edu.uco.ing.software.project.transports.application.dto.DocumentTypeDTO;
import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;
import co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.entity.DocumentTypeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DocumentTypeMapper {

  DocumentTypeMapper DOCUMENT_TYPE_MAPPER = Mappers.getMapper(DocumentTypeMapper.class);

  DocumentType documentTypeDTOToDocumentType(DocumentTypeDTO documentTypeDTO);

  DocumentTypeDTO documentTypeToDocumentTypeDTO(DocumentType documentType);

  List<DocumentTypeDTO> documentTypeDTOToListDocumentTypeList(List<DocumentType> documentType);

  // TODO profe esto debería de estar en la capa de infraestrucctura por visibilidad de capas ?
  DocumentTypeEntity documentTypeToDocumentTypeEntity(DocumentType documentType);

  DocumentType documentTypeEntityToDocumentType(DocumentTypeEntity documentTypeEntity);

  List<DocumentType> documentTypeEntityListToDocumentTypeList(List<DocumentTypeEntity> documentTypeEntities);

  List<DocumentTypeDTO> documentTypeListToDocumentTypeDTOList(List<DocumentType> documentTypeEntity);
}
