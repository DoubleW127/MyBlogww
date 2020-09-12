package com.doublew.exception;

/**
 * @author zhaojun
 **/

public interface IErrorCode {

    /**
     * @return code
     * @see ErrorCodeEnum
     */
    int getCode();

    /**
     * @return msg
     * @see ErrorCodeEnum
     */
    String getMsg();

}
