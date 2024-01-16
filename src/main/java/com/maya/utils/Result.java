package com.maya.utils;

import lombok.Data;

@Data
public class Result<T> {
  private Boolean success;
  private Integer code;
  private String message;
  private T data;

  private Result() {}

  /**
   *
   * @return
   * @param <T>
   */
  public static <T> Result<T> ok() {
    Result<T> r = new Result<T>();
    r.setSuccess(true);
    r.setCode(ResultCode.SUCCESS);
    r.setMessage("success");
    return r;
  }

  /**
   * 成功返回结果
   * @param data
   * @return
   * @param <T>
   */
  public static <T> Result<T> ok(T data) {
    Result<T> r = new Result<T>();
    r.setSuccess(true);
    r.setCode(ResultCode.SUCCESS);
    r.setMessage("success");
    r.setData(data);
    return r;
  }

  /**
   * 失败
   * @return
   */
  public static <T> Result<T> error() {
    Result<T> r = new Result<T>();
    r.setSuccess(false);
    r.setCode(ResultCode.ERROR);
    r.setMessage("error");
    return r;
  }

  /**
   * 设置是否成功
   * @param success
   * @return
   */
  public Result<T> success(Boolean success) {
    this.setSuccess(success);
    return this;
  }

  /**
   * 设置返回码
   * @param code
   * @return
   */
  public Result<T> code(Integer code) {
    this.setCode(code);
    return this;
  }

  /**
   * 设置返回消息
   * @param message
   * @return
   */
  public Result<T> message(String message) {
    this.setMessage(message);
    return this;
  }

}
