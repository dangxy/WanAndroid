package com.dangxy.wanandroid.module.me;

import com.google.gson.annotations.SerializedName;

/**
 * @author dangxueyi
 * @description
 * @date 2018/3/4
 */

public class AddCollectEntity {


    /**
     * data : {"desc":"","icon":"","id":250,"link":"http://wanandroid.com","name":"WanAndroid","order":0,"userId":368,"visible":1}
     * errorCode : 0
     * errorMsg :
     */

    @SerializedName("data" )
    private DataBean data;
    @SerializedName("errorCode" )
    private int errorCode;
    @SerializedName("errorMsg" )
    private String errorMsg;

    public void setData(DataBean data) {
        this.data = data;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public DataBean getData() {
        return data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public static class DataBean {
        /**
         * desc :
         * icon :
         * id : 250
         * link : http://wanandroid.com
         * name : WanAndroid
         * order : 0
         * userId : 368
         * visible : 1
         */

        @SerializedName("desc" )
        private String desc;
        @SerializedName("icon" )
        private String icon;
        @SerializedName("id" )
        private int id;
        @SerializedName("link" )
        private String link;
        @SerializedName("name" )
        private String name;
        @SerializedName("order" )
        private int order;
        @SerializedName("userId" )
        private int userId;
        @SerializedName("visible" )
        private int visible;

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public void setVisible(int visible) {
            this.visible = visible;
        }

        public String getDesc() {
            return desc;
        }

        public String getIcon() {
            return icon;
        }

        public int getId() {
            return id;
        }

        public String getLink() {
            return link;
        }

        public String getName() {
            return name;
        }

        public int getOrder() {
            return order;
        }

        public int getUserId() {
            return userId;
        }

        public int getVisible() {
            return visible;
        }
    }
}
