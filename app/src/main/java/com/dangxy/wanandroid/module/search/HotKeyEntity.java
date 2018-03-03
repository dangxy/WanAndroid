package com.dangxy.wanandroid.module.search;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/14
 */

public class HotKeyEntity {

    /**
     * errorCode : 0
     * errorMsg : null
     * data : [{"id":6,"name":"面试","link":null,"visible":1,"order":1},{"id":9,"name":"Studio3","link":null,"visible":1,"order":1},{"id":5,"name":"动画","link":null,"visible":1,"order":2},{"id":1,"name":"自定义View","link":null,"visible":1,"order":3},{"id":2,"name":"性能优化 速度","link":null,"visible":1,"order":4},{"id":3,"name":"gradle","link":null,"visible":1,"order":5},{"id":4,"name":"Camera 相机","link":null,"visible":1,"order":6},{"id":7,"name":"代码混淆 安全","link":null,"visible":1,"order":7},{"id":8,"name":"逆向 加固","link":null,"visible":1,"order":8}]
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
         * id : 6
         * name : 面试
         * link : null
         * visible : 1
         * order : 1
         */

        @SerializedName("id")
        private String id;
        @SerializedName("name")
        private String name;
        @SerializedName("link")
        private String link;
        @SerializedName("visible")
        private int visible;
        @SerializedName("order")
        private int order;

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
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

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
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
    }
}
