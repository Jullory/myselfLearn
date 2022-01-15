package com.learn.mall.common.api;


public class CommonResponse<T> {
    private long code;

    private String message;

    private T data;

    protected CommonResponse(){}

    protected CommonResponse(long code, String message, T data){
        this.code = code;
        this.data = data;
        this.message = message;
    }

    /**
     *  成功返回结果
     *
     * @param data 获取的数据
     * @return 响应结果
     */
    public static <T> CommonResponse<T> success(T data){
        return new CommonResponse<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     * @param message 提示信息
     * @return 响应结果
     */
    public static <T> CommonResponse<T> success(T data, String message){
        return new CommonResponse<>(ResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     *  失败返回结果
     *
     * @param errorCode 错误码
     * @return 失败响应结果
     */
    public static <T> CommonResponse<T> failed(IErrorCode errorCode){
        return new CommonResponse<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     *  失败返回结果
     *
     * @param message 错误提示信息
     * @return 失败响应结果
     */
    public static <T> CommonResponse<T> failed(String message){
        return new CommonResponse<T>(ResultCode.FAILED.getCode(), message, null);
    }

    /**
     *  失败返回结果
     */
    public static <T> CommonResponse<T> failed(){
        return failed(ResultCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> CommonResponse<T> validateFailed() {
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     */
    public static <T> CommonResponse<T> validateFailed(String message) {
        return new CommonResponse<T>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 未登录返回结果
     */
    public static <T> CommonResponse<T> unauthorized(T data) {
        return new CommonResponse<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未授权返回结果
     */
    public static <T> CommonResponse<T> forbidden(T data) {
        return new CommonResponse<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
