package com.doublew.exception;

/**
 * 自定义异常
 *
 * @author fanghui
 */
public class RRException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private int code;

    public RRException(String msg) {
        super(msg);
    }

    public RRException(String msg, Throwable e) {
        super(msg, e);
    }

    public RRException(String msg, int code) {
        super(msg);
        this.code = code;
    }

    public RRException(String msg, int code, Throwable e) {
        super(msg, e);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}