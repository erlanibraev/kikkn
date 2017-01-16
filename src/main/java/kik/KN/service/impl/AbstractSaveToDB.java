package kik.KN.service.impl;

import kik.KN.service.ISaveToDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Создал Ибраев Ерлан 16.01.17.
 */
public abstract class AbstractSaveToDB<E,T> implements ISaveToDB<E,T> {

    private JpaRepository<E, Long> repository;
    private Long sourceId;

    @Override
    public E save(T data) {
        E entity = getEntity(data);
        return repository.save(entity);
    }

    @Override
    public List<E> save(List<T> list) {
        List<E> result = new ArrayList<E>();
        list.forEach(t -> result.add(getEntity(t)));
        repository.save(result);
        return result;
    }

    protected abstract E getEntity(T data);

    @Autowired
    public void setRepository(JpaRepository<E, Long> repository) {
        this.repository = repository;
    }

    public JpaRepository<E, Long> getRepository() {
        return repository;
    }

    public Long getSourceId() {
        return sourceId;
    }

    @Value("${kn.source.id}")
    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }
}
