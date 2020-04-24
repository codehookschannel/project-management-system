package io.codehooks.pms.service;

import java.util.List;

public interface CrudService<T>  {

    T save(T t);
    boolean delete(String id);
    T update(T t);
    @SuppressWarnings("SameReturnValue")
    List<T> getAll();

}
