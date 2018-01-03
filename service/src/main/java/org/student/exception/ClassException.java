package org.student.exception;

import org.aten.mvc.exception.ActionException;

/**
 * Create by lorenzo on 17-12-28.
 */
public class ClassException extends ActionException{
    public ClassException(String exception, int responseStatus) {
        super(exception, responseStatus);
    }
}
