package com.kang.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @author kanseer
 * @create 2021-04-05 13:46
 */
@Data
public class Result implements Serializable {

    private int code;//200正常 非200错误
    private String msg;
    private Object data;

    public static  Result succ(Object data){
        return Result.succ(200,"操作成功",data);
    }

    public static Result succ(int code,String mess,Object data){
        Result r = new Result();
        r.setCode(code);
        r.setData(data);
        r.setMsg(mess);
        return r;
    }

    public static  Result fail(String mess){
        return Result.fail(mess,null);
    }

    public static  Result fail(String mess,Object data){
        return Result.fail(400,mess,data);
    }

    public static Result fail(int code, String mess, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setData(data);
        r.setMsg(mess);
        return r;
    }
}
