package kik.KN.repository;

import kik.KN.repository.entities.CommercialEstateAdsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Repository
public interface ICommercialEstateAdsRepository extends JpaRepository<CommercialEstateAdsEntity, Long>, JpaSpecificationExecutor<CommercialEstateAdsEntity> {
    public CommercialEstateAdsEntity findOneByPageId(@Param("pageId") Long pageId);

}
