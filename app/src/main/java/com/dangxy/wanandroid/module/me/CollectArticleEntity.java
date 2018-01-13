package com.dangxy.wanandroid.module.me;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/13
 */

public class CollectArticleEntity {


    /**
     * errorCode : 0
     * errorMsg : null
     * data : {"datas":[{"id":1452,"originId":1593,"title":"Android自定义View\u2014\u2014从零开始实现书籍翻页效果（一）","chapterId":99,"chapterName":"具体案例","envelopePic":null,"link":"https://juejin.im/post/5a3215c96fb9a045186ac0fe","author":"Anlia","origin":null,"publishTime":1513821407000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1450,"originId":1591,"title":"【资源下载】2017阿里技术年度精选集","chapterId":249,"chapterName":"干货资源","envelopePic":null,"link":"http://www.wanandroid.com/blog/5","author":"站内文","origin":null,"publishTime":1513821405000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1448,"originId":1589,"title":"Android截屏方案","chapterId":263,"chapterName":"截屏","envelopePic":null,"link":"https://juejin.im/post/5a33403b6fb9a045132abdb6","author":"MissMyDearBear","origin":null,"publishTime":1513821404000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1449,"originId":1588,"title":"Android WebView独立进程解决方案","chapterId":98,"chapterName":"WebView","envelopePic":null,"link":"http://www.jianshu.com/p/b66c225c19e2","author":"浪淘沙xud","origin":null,"publishTime":1513821404000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1447,"originId":1590,"title":"免费获得《2017阿里技术年度精选》","chapterId":249,"chapterName":"干货资源","envelopePic":null,"link":"https://mp.weixin.qq.com/s/XpbXHUjI6k3WUvvE826_jw","author":"阿里技术","origin":null,"publishTime":1513821403000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1446,"originId":1596,"title":"Android逆向之路---为什么从后台切换回app又显示广告了","chapterId":79,"chapterName":"黑科技","envelopePic":null,"link":"https://juejin.im/post/5a373a275188254b8b353ec5","author":"MartinHan","origin":null,"publishTime":1513821399000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1445,"originId":1597,"title":"Android组件框架：Android组件管理者ActivityManager","chapterId":233,"chapterName":"framework-四大组件","envelopePic":null,"link":"https://juejin.im/post/5a38eef3f265da430e4f4959","author":"郭孝星","origin":null,"publishTime":1513821397000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1444,"originId":1598,"title":"怎么用Kotlin去提高生产力：Kotlin Tips","chapterId":232,"chapterName":"入门及知识点","envelopePic":null,"link":"https://github.com/heimashi/kotlin_tips","author":"heimashi","origin":null,"publishTime":1513821395000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1443,"originId":1599,"title":"如何使用Android Studio开发Gradle插件","chapterId":169,"chapterName":"gradle","envelopePic":null,"link":"http://blog.csdn.net/sbsujjbcy/article/details/50782830","author":"_区长","origin":null,"publishTime":1513821394000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1441,"originId":1601,"title":"Java反射以及在Android中的特殊应用","chapterId":265,"chapterName":"反射","envelopePic":null,"link":"https://mp.weixin.qq.com/s/bDe-6KiTbazC5FhUi-Z65A","author":"stormWen","origin":null,"publishTime":1513821393000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1442,"originId":1600,"title":"android插件自定义之多渠道打包插件（支持微信资源混淆andResGuard）","chapterId":230,"chapterName":"打包","envelopePic":null,"link":"http://www.jianshu.com/p/3e56303fb375","author":"君莫醉","origin":null,"publishTime":1513821393000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299}],"offset":20,"size":20,"total":31,"pageCount":2,"curPage":2,"over":true}
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
         * datas : [{"id":1452,"originId":1593,"title":"Android自定义View\u2014\u2014从零开始实现书籍翻页效果（一）","chapterId":99,"chapterName":"具体案例","envelopePic":null,"link":"https://juejin.im/post/5a3215c96fb9a045186ac0fe","author":"Anlia","origin":null,"publishTime":1513821407000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1450,"originId":1591,"title":"【资源下载】2017阿里技术年度精选集","chapterId":249,"chapterName":"干货资源","envelopePic":null,"link":"http://www.wanandroid.com/blog/5","author":"站内文","origin":null,"publishTime":1513821405000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1448,"originId":1589,"title":"Android截屏方案","chapterId":263,"chapterName":"截屏","envelopePic":null,"link":"https://juejin.im/post/5a33403b6fb9a045132abdb6","author":"MissMyDearBear","origin":null,"publishTime":1513821404000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1449,"originId":1588,"title":"Android WebView独立进程解决方案","chapterId":98,"chapterName":"WebView","envelopePic":null,"link":"http://www.jianshu.com/p/b66c225c19e2","author":"浪淘沙xud","origin":null,"publishTime":1513821404000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1447,"originId":1590,"title":"免费获得《2017阿里技术年度精选》","chapterId":249,"chapterName":"干货资源","envelopePic":null,"link":"https://mp.weixin.qq.com/s/XpbXHUjI6k3WUvvE826_jw","author":"阿里技术","origin":null,"publishTime":1513821403000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1446,"originId":1596,"title":"Android逆向之路---为什么从后台切换回app又显示广告了","chapterId":79,"chapterName":"黑科技","envelopePic":null,"link":"https://juejin.im/post/5a373a275188254b8b353ec5","author":"MartinHan","origin":null,"publishTime":1513821399000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1445,"originId":1597,"title":"Android组件框架：Android组件管理者ActivityManager","chapterId":233,"chapterName":"framework-四大组件","envelopePic":null,"link":"https://juejin.im/post/5a38eef3f265da430e4f4959","author":"郭孝星","origin":null,"publishTime":1513821397000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1444,"originId":1598,"title":"怎么用Kotlin去提高生产力：Kotlin Tips","chapterId":232,"chapterName":"入门及知识点","envelopePic":null,"link":"https://github.com/heimashi/kotlin_tips","author":"heimashi","origin":null,"publishTime":1513821395000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1443,"originId":1599,"title":"如何使用Android Studio开发Gradle插件","chapterId":169,"chapterName":"gradle","envelopePic":null,"link":"http://blog.csdn.net/sbsujjbcy/article/details/50782830","author":"_区长","origin":null,"publishTime":1513821394000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1441,"originId":1601,"title":"Java反射以及在Android中的特殊应用","chapterId":265,"chapterName":"反射","envelopePic":null,"link":"https://mp.weixin.qq.com/s/bDe-6KiTbazC5FhUi-Z65A","author":"stormWen","origin":null,"publishTime":1513821393000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299},{"id":1442,"originId":1600,"title":"android插件自定义之多渠道打包插件（支持微信资源混淆andResGuard）","chapterId":230,"chapterName":"打包","envelopePic":null,"link":"http://www.jianshu.com/p/3e56303fb375","author":"君莫醉","origin":null,"publishTime":1513821393000,"zan":0,"desc":null,"visible":0,"niceDate":"刚刚","courseId":13,"userId":1299}]
         * offset : 20
         * size : 20
         * total : 31
         * pageCount : 2
         * curPage : 2
         * over : true
         */

        @SerializedName("offset")
        private int offset;
        @SerializedName("size")
        private int size;
        @SerializedName("total")
        private int total;
        @SerializedName("pageCount")
        private int pageCount;
        @SerializedName("curPage")
        private int curPage;
        @SerializedName("over")
        private boolean over;
        @SerializedName("datas")
        private List<DatasBean> datas;

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public int getOffset() {
            return offset;
        }

        public int getSize() {
            return size;
        }

        public int getTotal() {
            return total;
        }

        public int getPageCount() {
            return pageCount;
        }

        public int getCurPage() {
            return curPage;
        }

        public boolean getOver() {
            return over;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public static class DatasBean {
            /**
             * id : 1452
             * originId : 1593
             * title : Android自定义View——从零开始实现书籍翻页效果（一）
             * chapterId : 99
             * chapterName : 具体案例
             * envelopePic : null
             * link : https://juejin.im/post/5a3215c96fb9a045186ac0fe
             * author : Anlia
             * origin : null
             * publishTime : 1513821407000
             * zan : 0
             * desc : null
             * visible : 0
             * niceDate : 刚刚
             * courseId : 13
             * userId : 1299
             */

            @SerializedName("id")
            private int id;
            @SerializedName("originId")
            private int originId;
            @SerializedName("title")
            private String title;
            @SerializedName("chapterId")
            private int chapterId;
            @SerializedName("chapterName")
            private String chapterName;
            @SerializedName("envelopePic")
            private Object envelopePic;
            @SerializedName("link")
            private String link;
            @SerializedName("author")
            private String author;
            @SerializedName("origin")
            private Object origin;
            @SerializedName("publishTime")
            private long publishTime;
            @SerializedName("zan")
            private int zan;
            @SerializedName("desc")
            private Object desc;
            @SerializedName("visible")
            private int visible;
            @SerializedName("niceDate")
            private String niceDate;
            @SerializedName("courseId")
            private int courseId;
            @SerializedName("userId")
            private int userId;

            public void setId(int id) {
                this.id = id;
            }

            public void setOriginId(int originId) {
                this.originId = originId;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public void setEnvelopePic(Object envelopePic) {
                this.envelopePic = envelopePic;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public void setOrigin(Object origin) {
                this.origin = origin;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public void setDesc(Object desc) {
                this.desc = desc;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getId() {
                return id;
            }

            public int getOriginId() {
                return originId;
            }

            public String getTitle() {
                return title;
            }

            public int getChapterId() {
                return chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public Object getEnvelopePic() {
                return envelopePic;
            }

            public String getLink() {
                return link;
            }

            public String getAuthor() {
                return author;
            }

            public Object getOrigin() {
                return origin;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public int getZan() {
                return zan;
            }

            public Object getDesc() {
                return desc;
            }

            public int getVisible() {
                return visible;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public int getCourseId() {
                return courseId;
            }

            public int getUserId() {
                return userId;
            }
        }
    }
}
