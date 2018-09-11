package com.supadata.utils;

/**
 * @ClassName: MsgJson
 * @Description:
 * @Auther: pxx
 * @Date: 2018/8/21 11:48
 * @Description:
 */
public class MsgJson<T> {


    private static final Integer CODE_SUCCESS = 0;

    private static final Integer CODE_FAIL = 1;

    private Integer code;

    private T data;

    private String msg;



    public MsgJson(){

    }

    public MsgJson(Integer code){
        this.code = code;
    }

    public MsgJson(Integer code, T data){
        this.code = code;
        this.data = data;
    }

    public MsgJson(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }


    public static MsgJson success(){
        return new MsgJson(CODE_SUCCESS);
    }

    public static MsgJson success(Object data){
        return new MsgJson(CODE_SUCCESS, data);
    }

    public static MsgJson fail(String msg){
        return new MsgJson(CODE_FAIL, msg);
    }

    public static MsgJson widthCode(Integer errorCode) {
        return new MsgJson(errorCode);
    }



    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
