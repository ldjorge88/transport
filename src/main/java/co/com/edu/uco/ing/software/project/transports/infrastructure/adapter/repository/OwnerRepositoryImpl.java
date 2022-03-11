package co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.repository;

import co.com.edu.uco.ing.software.project.transports.domain.model.Owner;
import co.com.edu.uco.ing.software.project.transports.domain.port.OwnerRepository;
import co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.entity.OwnerEntity;
import co.com.edu.uco.ing.software.project.transports.infrastructure.adapter.repository.jpa.OwnerJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Repository
public class OwnerRepositoryImpl implements OwnerRepository {

  private static final Logger log = LoggerFactory.getLogger(OwnerRepositoryImpl.class);
  private final OwnerJpaRepository ownerJpaRepository;

  public OwnerRepositoryImpl(OwnerJpaRepository ownerJpaRepository) {
    this.ownerJpaRepository = ownerJpaRepository;
  }

  @Override
  public List<Owner> getList() {
    List<OwnerEntity> owners = this.ownerJpaRepository.findAll();
    return owners.stream().
        map(ownerEntity -> {
          log.info("cargando info desde base de datos: document: [{}] - firstname: [{}]", ownerEntity.getDocument(), ownerEntity.getFirstName());

          return Owner.ownerBuilder(ownerEntity.getDocument(), ownerEntity.getDocumentType())
              .setFirstName(ownerEntity.getFirstName())
              .setLastName(ownerEntity.getLastName())
              .setEmail(ownerEntity.getEmail())
              .setCity(ownerEntity.getCity())
              .setRut(ownerEntity.getRut())
              .setPhone(ownerEntity.getPhone())
              .setLicensePlate(ownerEntity.getLicensePlate());

        }).toList();
  }

  @Override
  public Owner findByDocument(int id) {
    return ownerJpaRepository.findByDocument(id)
        .map(ownerEntity -> Owner.ownerBuilder(ownerEntity.getDocument(), ownerEntity.getDocumentType())
            .setFirstName(ownerEntity.getFirstName())
            .setLastName(ownerEntity.getLastName())
            .setEmail(ownerEntity.getEmail())
            .setCity(ownerEntity.getCity())
            .setPhone(ownerEntity.getPhone())
            .setLicensePlate(ownerEntity.getLicensePlate()))
        .orElse(null);
  }

  @Override
  public Long save(Owner owner) {
    OwnerEntity ownerEntity = new OwnerEntity(owner.getDocument(), owner.getDocumentType(), owner.getFirstName(), owner.getLastName(), owner.getEmail()
        , owner.getCity(), owner.getRut(), owner.getPhone(), owner.getLicensePlate());
    return this.ownerJpaRepository.save(ownerEntity).getId();
  }

  @Override
  public boolean exists(Owner owner) {
    return !ObjectUtils.isEmpty(this.ownerJpaRepository.findByDocumentAndDocumentType(owner.getDocument(), owner.getDocumentType()));
  }

  @Override
  public Long delete(Owner owner) {
    OwnerEntity ownerEntity = this.ownerJpaRepository.findByDocumentAndDocumentType(owner.getDocument(), owner.getDocumentType());
    if (!ObjectUtils.isEmpty(ownerEntity)) {
      ownerJpaRepository.delete(ownerEntity);
      return ownerEntity.getId();
    } else {
      return 0L;
    }
  }

}
