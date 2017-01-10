package kik.KN.repository;

import kik.KN.repository.entities.RegionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Repository
public interface IRegionRepository extends JpaRepository<RegionEntity, Long>, JpaSpecificationExecutor<RegionEntity> {

    public RegionEntity findOneByKrishaLink(@Param("krishaLink") String krishaLink);
}
