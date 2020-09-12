package com.doublew.exception;

import org.apache.commons.lang.StringUtils;

/**
 * @author fanghui
 * @date 2020-07-28 23:23:23
 */
public enum ErrorCodeEnum implements IErrorCode {
    /**
     * success
     */
    SUCCESS(0, "success"),
    /**
     * failed
     */
    FAILED(10000, "failed"),
    /**
     * token is empty
     */
    TOKEN_IS_EMPTY(10001, "token is empty"),
    /**
     * token is invalid
     */
    TOKEN_IS_INVALID(10002, "token is invalid"),
    /**
     * token is expired
     */
    TOKEN_IS_EXPIRED(10003, "token is expired"),
    /**
     * 列字段超长
     */
    DB_DATA_TOO_LONG(10004, "column is to long"),
    /**
     * KMS环境执行失败
     */
    KMS_EXECUTE_ERROR(10005, "KMS environment execution failed"),
    /**
     * 用户登录信息缺失，请重新登录
     */
    USER_LOGIN_ERROR(10006, "user login information is missing, please login again"),
    /**
     * 请求参数为空
     */
    REQUEST_PARAM_ERROR(10007, "request parameter exception"),
    /**
     * 查询结果为空
     */
    QUERY_RESULT_NULL(10008, "query result is empty"),
    /**
     * 状态异常
     */
    STATUS_ERROR(10009, "status error"),
    /**
     * 参数转化异常
     */
    PARAM_CONVERT_ERROR(10010, "parameter conversion error"),
    /**
     * 参数不合法
     */
    PARAM_INVALID_ERROR(10011, "parameter invalid error"),
    /**
     * excel导出异常
     */
    EXPORT_EXCEL_FAILED(10012, "export excel error"),
    /**
     * oss url获取异常
     */
    OSS_OPERATION_FAILED(10013, "oss operation error"),
    /**
     * es 操作异常
     */
    ES_OPERATION_FAILED(10014, "es operation error"),
    /**
     * 日期 操作异常
     */
    DATE_OPERATION_FAILED(10015, "date operation error"),
    /**
     * 没有权限 操作异常
     */
    NO_PERMISSION_FAILED(10016, "no permission error");

    private final int code;

    private final String msg;

    ErrorCodeEnum(int code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }

    public static String getMsgByCode(int code) {
        ErrorCodeEnum[] values = ErrorCodeEnum.values();
        for (ErrorCodeEnum value : values) {
            if (value.code == code) {
                return value.msg;
            }
        }
        return StringUtils.EMPTY;
    }
}