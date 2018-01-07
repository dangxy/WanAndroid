package com.dangxy.wanandroid.module.category;

import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/7
 */

public class CategoryEntity {


    private int errorCode;
    private String errorMsg;
    private List<TreeEntity> data;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public List<TreeEntity> getData() {
        return data;
    }

    public void setData(List<TreeEntity> data) {
        this.data = data;
    }
}
