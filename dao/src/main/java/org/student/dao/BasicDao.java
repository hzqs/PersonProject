package org.student.dao;

/**
 * Create by lorenzo on 17-12-28.
 */
public interface BasicDao<T> {

    void add(T t);

    void del(T t);

    void update(T t);

}
