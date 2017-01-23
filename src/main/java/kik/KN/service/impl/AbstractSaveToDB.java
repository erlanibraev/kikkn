package kik.KN.service.impl;

import kik.KN.service.IParser;
import kik.KN.service.ISaveToDB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;

import javax.ejb.AsyncResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/**
 * Создал Ибраев Ерлан 16.01.17.
 */
public abstract class AbstractSaveToDB<E,T> implements ISaveToDB<E,T> {

    protected Logger log = LoggerFactory.getLogger(AbstractSaveToDB.class);

    private JpaRepository<E, Long> repository;
    private Long sourceId;

    @Override
    public E save(T data) {
        E entity = getEntity(data);
        return repository.save(entity);
    }

    @Override
    @Transactional
    public List<E> save(List<T> list) {
        List<E> result = new ArrayList<E>();
        list.forEach(t -> result.add(getEntity(t)));
        repository.save(result);
        return result;
    }

    @Override
    @Async
    public Future<List<E>> save(IParser iParser) {
        log.info("Сохраняем "+iParser.getClass().getName());
        List<E> result = save(iParser.scan());
        log.info("Сохранили"+iParser.getClass().getName());
        return new AsyncResult<List<E>>(result);
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
