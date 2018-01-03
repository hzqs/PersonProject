package org.student.service;

import java.util.List;

/**
 * Create by lorenzo on 17-12-28.
 */
public interface BeanQueryService<T> {

    T find(T t);

    List<T> getBeanList();
}
