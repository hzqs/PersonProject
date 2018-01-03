package org.student.exception;

import org.aten.mvc.exception.ActionException;

/**
 * Create by lorenzo on 17-12-28.
 */
public class StudentException extends ActionException{
    public StudentException(String exception, int responseStatus) {
        super(exception, responseStatus);
    }
}
