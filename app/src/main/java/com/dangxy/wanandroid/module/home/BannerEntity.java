package com.dangxy.wanandroid.module.home;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/6
 */

public class BannerEntity {

    /**
     * errorCode : 0
     * errorMsg : null
     * data : [{"id":3,"url":"http://www.wanandroid.com/article/list/0?cid=254","imagePath":"http://www.wanandroid.com/blogimgs/fb0ea461-e00a-482b-814f-4faca5761427.png","title":"兄弟，要不要挑个项目学习下?","desc":"","isVisible":1,"order":1,"type":0},{"id":4,"url":"http://www.wanandroid.com/article/list/0?cid=73","imagePath":"http://www.wanandroid.com/blogimgs/ab17e8f9-6b79-450b-8079-0f2287eb6f0f.png","title":"看看别人的面经，搞定面试~","desc":"","isVisible":1,"order":2,"type":0},{"id":2,"url":"http://www.wanandroid.com/tools/bejson","imagePath":"http://www.wanandroid.com/blogimgs/90cf8c40-9489-4f9d-8936-02c9ebae31f0.png","title":"JSON工具","desc":"","isVisible":1,"order":2,"type":1},{"id":5,"url":"http://www.wanandroid.com/blog/show/6","imagePath":"http://www.wanandroid.com/blogimgs/acc23063-1884-4925-bdf8-0b0364a7243e.png","title":"微信文章合集","desc":"","isVisible":1,"order":3,"type":1}]
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
         * id : 3
         * url : http://www.wanandroid.com/article/list/0?cid=254
         * imagePath : http://www.wanandroid.com/blogimgs/fb0ea461-e00a-482b-814f-4faca5761427.png
         * title : 兄弟，要不要挑个项目学习下?
         * desc :
         * isVisible : 1
         * order : 1
         * type : 0
         */

        @SerializedName("id")
        private int id;
        @SerializedName("url")
        private String url;
        @SerializedName("imagePath")
        private String imagePath;
        @SerializedName("title")
        private String title;
        @SerializedName("desc")
        private String desc;
        @SerializedName("isVisible")
        private int isVisible;
        @SerializedName("order")
        private int order;
        @SerializedName("type")
        private int type;

        public void setId(int id) {
            this.id = id;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setIsVisible(int isVisible) {
            this.isVisible = isVisible;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public String getUrl() {
            return url;
        }

        public String getImagePath() {
            return imagePath;
        }

        public String getTitle() {
            return title;
        }

        public String getDesc() {
            return desc;
        }

        public int getIsVisible() {
            return isVisible;
        }

        public int getOrder() {
            return order;
        }

        public int getType() {
            return type;
        }
    }
}
