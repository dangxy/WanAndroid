package com.dangxy.wanandroid.module.me;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/13
 */

public class CollectWebsiteEntity {


    /**
     * errorCode : 0
     * errorMsg : null
     * data : [{"id":108,"name":"百度","icon":null,"desc":null,"link":"http:www.baidu.com","visible":1,"order":0,"userId":368},{"id":131,"name":"sina","icon":null,"desc":null,"link":"https:www.sina.com","visible":1,"order":0,"userId":368},{"id":132,"name":"google","icon":null,"desc":null,"link":"https:www.google.com","visible":1,"order":0,"userId":368},{"id":133,"name":"youtube","icon":null,"desc":null,"link":"https:www.youtube.com","visible":1,"order":0,"userId":368},{"id":134,"name":"facebook","icon":null,"desc":null,"link":"https:www.facebook.com","visible":1,"order":0,"userId":368},{"id":135,"name":"简书-组件化开发","icon":null,"desc":null,"link":"https://www.jianshu.com/p/186fa07fc48a","visible":1,"order":0,"userId":368}]
     */

    @SerializedName("errorCode")
    private int errorCode;
    @SerializedName("errorMsg")
    private Object errorMsg;
    @SerializedName("data")
    private List<DataBean> data;

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMsg(Object errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public Object getErrorMsg() {
        return errorMsg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public static class DataBean {
        /**
         * id : 108
         * name : 百度
         * icon : null
         * desc : null
         * link : http:www.baidu.com
         * visible : 1
         * order : 0
         * userId : 368
         */

        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;
        @SerializedName("icon")
        private Object icon;
        @SerializedName("desc")
        private Object desc;
        @SerializedName("link")
        private String link;
        @SerializedName("visible")
        private int visible;
        @SerializedName("order")
        private int order;
        @SerializedName("userId")
        private int userId;

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setIcon(Object icon) {
            this.icon = icon;
        }

        public void setDesc(Object desc) {
            this.desc = desc;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public void setVisible(int visible) {
            this.visible = visible;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Object getIcon() {
            return icon;
        }

        public Object getDesc() {
            return desc;
        }

        public String getLink() {
            return link;
        }

        public int getVisible() {
            return visible;
        }

        public int getOrder() {
            return order;
        }

        public int getUserId() {
            return userId;
        }
    }
}
