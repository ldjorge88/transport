package co.com.edu.uco.ing.software.project.transports.application.service.documenttype;

import co.com.edu.uco.ing.software.project.transports.application.dto.DocumentTypeDTO;
import co.com.edu.uco.ing.software.project.transports.application.enums.ErrorMessage;
import co.com.edu.uco.ing.software.project.transports.application.exception.TransportNoContentException;
import co.com.edu.uco.ing.software.project.transports.domain.model.DocumentType;
import co.com.edu.uco.ing.software.project.transports.domain.service.documenttype.FindAllDocumentTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.List;

import static co.com.edu.uco.ing.software.project.transports.application.mapper.DocumentTypeMapper.DOCUMENT_TYPE_MAPPER;

@Component
@RequiredArgsConstructor
public class ApplicationListDocumentTypeService {

  private final FindAllDocumentTypeService findAllDocumentTypeService;

  public List<DocumentTypeDTO> execute() {

    List<DocumentType> documentTypeList = findAllDocumentTypeService.geList();

    if (ObjectUtils.isEmpty(documentTypeList)) {
      throw new TransportNoContentException(ErrorMessage.U_ENTITY_NOT_FOUND);
    }

    return DOCUMENT_TYPE_MAPPER.documentTypeListToDocumentTypeDTOList(documentTypeList);
  }

}
