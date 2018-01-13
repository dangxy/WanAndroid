package com.dangxy.wanandroid.module.login;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/13
 */

public class LoginEntity {


    /**
     * errorCode : 0
     * errorMsg : null
     * data : {"id":368,"username":"dangxy99","password":"022336","icon":null,"type":0,"collectIds":[97,1257,1458]}
     */

    @SerializedName("errorCode")
    private int errorCode;
    @SerializedName("errorMsg")
    private Object errorMsg;
    @SerializedName("data")
    private DataBean data;

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMsg(Object errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public Object getErrorMsg() {
        return errorMsg;
    }

    public DataBean getData() {
        return data;
    }

    public static class DataBean {
        /**
         * id : 368
         * username : dangxy99
         * password : 022336
         * icon : null
         * type : 0
         * collectIds : [97,1257,1458]
         */

        @SerializedName("id")
        private int id;
        @SerializedName("username")
        private String username;
        @SerializedName("password")
        private String password;
        @SerializedName("icon")
        private Object icon;
        @SerializedName("type")
        private int type;
        @SerializedName("collectIds")
        private List<Integer> collectIds;

        public void setId(int id) {
            this.id = id;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setIcon(Object icon) {
            this.icon = icon;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setCollectIds(List<Integer> collectIds) {
            this.collectIds = collectIds;
        }

        public int getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public Object getIcon() {
            return icon;
        }

        public int getType() {
            return type;
        }

        public List<Integer> getCollectIds() {
            return collectIds;
        }
    }
}
