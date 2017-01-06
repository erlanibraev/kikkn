package kik.KN.repository;

import kik.KN.repository.entities.CeilingTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Repository
public interface ICeilingTypeRepository extends JpaRepository<CeilingTypeEntity, Long>, JpaSpecificationExecutor<CeilingTypeEntity> {
}
