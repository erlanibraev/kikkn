package kik.KN.service;

import java.util.List;

/**
 * Создал Ибраев Ерлан 09.01.17.
 */
public interface ISaveToDB<E, T> {

    public E save(T data);

    public List<E> save(List<T> list);

}
