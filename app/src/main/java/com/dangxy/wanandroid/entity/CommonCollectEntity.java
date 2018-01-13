package com.dangxy.wanandroid.entity;

import com.google.gson.annotations.SerializedName;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/13
 */

public class CommonCollectEntity {


    /**
     * errorCode : 0
     * errorMsg : null
     * data : null
     */

    @SerializedName("errorCode")
    private int errorCode;
    @SerializedName("errorMsg")
    private Object errorMsg;
    @SerializedName("data")
    private Object data;

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMsg(Object errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public Object getErrorMsg() {
        return errorMsg;
    }

    public Object getData() {
        return data;
    }
}
