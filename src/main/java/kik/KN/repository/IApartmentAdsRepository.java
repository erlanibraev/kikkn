package kik.KN.repository;

import kik.KN.repository.entities.ApartmentAdsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Repository
public interface IApartmentAdsRepository extends JpaRepository<ApartmentAdsEntity, Long>, JpaSpecificationExecutor<ApartmentAdsEntity> {

    public ApartmentAdsEntity findOneByPageId(@Param("pageId") Long pageId);
}
