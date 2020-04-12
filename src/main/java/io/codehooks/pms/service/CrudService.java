package io.codehooks.pms.service;

import java.util.List;

public interface CrudService<T>  {

    public T save(T t);
    public boolean delete(String id);
    public T update(T t);
    public List<T> getAll();

}
