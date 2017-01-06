package kik.KN.repository;

import kik.KN.repository.entities.BathroomWallFacingTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Repository
public interface IBathroomWallFacingTypeRepository extends JpaRepository<BathroomWallFacingTypeEntity, Long>, JpaSpecificationExecutor<BathroomWallFacingTypeEntity> {
}
