package org.student.dto;

/**
 * Create by lorenzo on 17-12-28.
 */
public class ValueDto {

    private int statusCode = 200;

    private String message ;

    private Object value;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
