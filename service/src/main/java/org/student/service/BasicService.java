package org.student.service;

import org.aten.mvc.exception.ActionException;

/**
 * Create by lorenzo on 17-12-28.
 */
public interface  BasicService<T> {

    void add(T t) throws ActionException;

    void update(T t) throws ActionException;

    void del(T t) throws ActionException;

}
