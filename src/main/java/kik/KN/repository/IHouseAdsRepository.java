package kik.KN.repository;

import kik.KN.repository.entities.HouseAdsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Repository
public interface IHouseAdsRepository extends JpaRepository<HouseAdsEntity, Long>, JpaSpecificationExecutor<HouseAdsEntity> {
    public List<HouseAdsEntity> findAllByPageIdAndSource(@Param("pageId") Long pageId, @Param("source") Long source);
}
