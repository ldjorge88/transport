package co.com.edu.uco.ing.software.project.transports.application.converter;

import co.com.edu.uco.ing.software.project.transports.application.dto.DocumentTypeDTO;
import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DocumentTypeMapper {

  DocumentTypeMapper INSTANCE = Mappers.getMapper(DocumentTypeMapper.class);

  DocumentType documentTypeDTOToDocumentType(DocumentTypeDTO documentTypeDTO);
  DocumentTypeDTO documentTypeToDocumentTypeDTO(DocumentType documentType);

  List<DocumentType> documentTypeDTOToDocumentTypeList(List<DocumentTypeDTO> documentTypeDTO);
  List<DocumentTypeDTO> documentTypeToDocumentTypeDTOList(List<DocumentType> documentType);
}
