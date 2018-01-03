package org.student.service;

import org.student.exception.LoginException;

/**
 * Create by lorenzo on 17-12-28.
 */
public interface LoginService<T> {

    T login(T t) throws LoginException;

}
