package kik.KN.repository;

import kik.KN.repository.entities.LandOwnershipTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Repository
public interface ILandOwnershipTypeRepository extends JpaRepository<LandOwnershipTypeEntity, Long>, JpaSpecificationExecutor<LandOwnershipTypeEntity> {
}
