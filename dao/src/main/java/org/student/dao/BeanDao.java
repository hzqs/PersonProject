package org.student.dao;

import java.util.List;

/**
 * Create by lorenzo on 17-12-28.
 */
public interface BeanDao<T> {

    T query(T t);

    List<T> queryList();
}
