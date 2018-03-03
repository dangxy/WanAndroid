package com.dangxy.wanandroid.module.search;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2018/3/3
 */

public class SearchResultEntity {


    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","author":"工匠若水","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2105,"link":"http://blog.csdn.net/yanbober/article/details/50577855","niceDate":"2018-01-16","origin":"","projectLink":"","publishTime":1516095702000,"title":"Android应用<em class='highlight'>自定义View<\/em>绘制方法手册","visible":1,"zan":0},{"apkLink":"","author":"工匠若水","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2107,"link":"http://blog.csdn.net/yanbober/article/details/50411919","niceDate":"2018-01-16","origin":"","projectLink":"","publishTime":1516095702000,"title":"Android应用开发之<em class='highlight'>自定义View<\/em>触摸相关工具类全解","visible":1,"zan":0},{"apkLink":"","author":"依然范特稀西","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2009,"link":"http://www.jianshu.com/p/7833d8450405","niceDate":"2018-01-10","origin":"","projectLink":"","publishTime":1515577242000,"title":"Android<em class='highlight'>自定义View<\/em>之 实现一个多功能的IndicatorView","visible":1,"zan":0},{"apkLink":"","author":"看书的小蜗牛","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1985,"link":"http://www.jianshu.com/p/d16ec64181f2","niceDate":"2018-01-08","origin":"","projectLink":"","publishTime":1515422086000,"title":"Android<em class='highlight'>自定义View<\/em>：MeasureSpec的真正意义与View大小控制","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":93,"chapterName":"基础知识","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1781,"link":"http://www.jianshu.com/p/1dab927b2f36","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802445000,"title":"<em class='highlight'>自定义View<\/em> Measure过程 - 最易懂的<em class='highlight'>自定义View<\/em>原理系列（2）","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":93,"chapterName":"基础知识","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1782,"link":"http://www.jianshu.com/p/146e5cec4863","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802445000,"title":"<em class='highlight'>自定义View<\/em>基础 - 最易懂的<em class='highlight'>自定义View<\/em>原理系列（1）","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":99,"chapterName":"具体案例","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1777,"link":"http://www.jianshu.com/p/762b490403c3","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802444000,"title":"Canvas类的最全面详解 - <em class='highlight'>自定义View<\/em>应用系列","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":93,"chapterName":"基础知识","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1778,"link":"http://www.jianshu.com/p/2c19abde958c","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802444000,"title":"Path类的最全面详解 - <em class='highlight'>自定义View<\/em>应用系列","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":93,"chapterName":"基础知识","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1779,"link":"http://www.jianshu.com/p/95afeb7c8335","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802444000,"title":"<em class='highlight'>自定义View<\/em> Draw过程- 最易懂的<em class='highlight'>自定义View<\/em>原理系列（4）","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":93,"chapterName":"基础知识","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1780,"link":"http://www.jianshu.com/p/158736a2549d","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802444000,"title":"<em class='highlight'>自定义View<\/em> Layout过程 - 最易懂的<em class='highlight'>自定义View<\/em>原理系列（3）","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1775,"link":"http://www.jianshu.com/p/e9d8420b1b9c","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802443000,"title":"手把手教你写一个完整的<em class='highlight'>自定义View<\/em>","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1776,"link":"http://www.jianshu.com/p/ca118d704b5e","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802443000,"title":"为什么你的<em class='highlight'>自定义View<\/em> wrap_content不起作用？","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1753,"link":"http://www.jianshu.com/p/655ea359e3db","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802433000,"title":"Android <em class='highlight'>自定义View<\/em>实战系列 ：时间轴","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1745,"link":"http://www.jianshu.com/p/67b69fc8b63b","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802431000,"title":"Android：你也可以自己写一个可爱 & 小资风格的加载等待<em class='highlight'>自定义View<\/em>","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1746,"link":"http://www.jianshu.com/p/9a6cbb7aa54f","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802431000,"title":"Android开源控件：一款你不可错过的可爱 & 小资风格的加载等待<em class='highlight'>自定义View<\/em>","visible":1,"zan":0},{"apkLink":"","author":"鸿洋","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1714,"link":"http://blog.csdn.net/lmj623565791/article/details/37567907","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802106000,"title":"Android <em class='highlight'>自定义View<\/em>Group手把手教你实现ArcMenu","visible":1,"zan":0},{"apkLink":"","author":"鸿洋","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1704,"link":"http://blog.csdn.net/lmj623565791/article/details/38339817","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802067000,"title":"Android 手把手教您<em class='highlight'>自定义View<\/em>Group（一）","visible":1,"zan":0},{"apkLink":"","author":"鸿洋","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1703,"link":"http://blog.csdn.net/lmj623565791/article/details/38352503","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802065000,"title":"Android <em class='highlight'>自定义View<\/em>Group 实战篇 -> 实现FlowLayout","visible":1,"zan":0},{"apkLink":"","author":"鸿洋","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1676,"link":"http://blog.csdn.net/lmj623565791/article/details/46858663","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514801995000,"title":"Android ViewDragHelper完全解析 <em class='highlight'>自定义View<\/em>Group神器","visible":1,"zan":0},{"apkLink":"","author":"Anlia","chapterId":99,"chapterName":"具体案例","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1594,"link":"https://juejin.im/post/5a32177151882535cd4ad96a","niceDate":"2017-12-20","origin":"","projectLink":"","publishTime":1513749711000,"title":"Android<em class='highlight'>自定义View<\/em>\u2014\u2014从零开始实现书籍翻页效果（二）","visible":1,"zan":0}],"offset":0,"over":false,"pageCount":3,"size":20,"total":47}
     * errorCode : 0
     * errorMsg :
     */

    @SerializedName("data")
    private DataBean data;
    @SerializedName("errorCode")
    private int errorCode;
    @SerializedName("errorMsg")
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
         * curPage : 1
         * datas : [{"apkLink":"","author":"工匠若水","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2105,"link":"http://blog.csdn.net/yanbober/article/details/50577855","niceDate":"2018-01-16","origin":"","projectLink":"","publishTime":1516095702000,"title":"Android应用<em class='highlight'>自定义View<\/em>绘制方法手册","visible":1,"zan":0},{"apkLink":"","author":"工匠若水","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2107,"link":"http://blog.csdn.net/yanbober/article/details/50411919","niceDate":"2018-01-16","origin":"","projectLink":"","publishTime":1516095702000,"title":"Android应用开发之<em class='highlight'>自定义View<\/em>触摸相关工具类全解","visible":1,"zan":0},{"apkLink":"","author":"依然范特稀西","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":2009,"link":"http://www.jianshu.com/p/7833d8450405","niceDate":"2018-01-10","origin":"","projectLink":"","publishTime":1515577242000,"title":"Android<em class='highlight'>自定义View<\/em>之 实现一个多功能的IndicatorView","visible":1,"zan":0},{"apkLink":"","author":"看书的小蜗牛","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1985,"link":"http://www.jianshu.com/p/d16ec64181f2","niceDate":"2018-01-08","origin":"","projectLink":"","publishTime":1515422086000,"title":"Android<em class='highlight'>自定义View<\/em>：MeasureSpec的真正意义与View大小控制","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":93,"chapterName":"基础知识","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1781,"link":"http://www.jianshu.com/p/1dab927b2f36","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802445000,"title":"<em class='highlight'>自定义View<\/em> Measure过程 - 最易懂的<em class='highlight'>自定义View<\/em>原理系列（2）","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":93,"chapterName":"基础知识","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1782,"link":"http://www.jianshu.com/p/146e5cec4863","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802445000,"title":"<em class='highlight'>自定义View<\/em>基础 - 最易懂的<em class='highlight'>自定义View<\/em>原理系列（1）","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":99,"chapterName":"具体案例","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1777,"link":"http://www.jianshu.com/p/762b490403c3","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802444000,"title":"Canvas类的最全面详解 - <em class='highlight'>自定义View<\/em>应用系列","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":93,"chapterName":"基础知识","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1778,"link":"http://www.jianshu.com/p/2c19abde958c","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802444000,"title":"Path类的最全面详解 - <em class='highlight'>自定义View<\/em>应用系列","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":93,"chapterName":"基础知识","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1779,"link":"http://www.jianshu.com/p/95afeb7c8335","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802444000,"title":"<em class='highlight'>自定义View<\/em> Draw过程- 最易懂的<em class='highlight'>自定义View<\/em>原理系列（4）","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":93,"chapterName":"基础知识","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1780,"link":"http://www.jianshu.com/p/158736a2549d","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802444000,"title":"<em class='highlight'>自定义View<\/em> Layout过程 - 最易懂的<em class='highlight'>自定义View<\/em>原理系列（3）","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1775,"link":"http://www.jianshu.com/p/e9d8420b1b9c","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802443000,"title":"手把手教你写一个完整的<em class='highlight'>自定义View<\/em>","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1776,"link":"http://www.jianshu.com/p/ca118d704b5e","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802443000,"title":"为什么你的<em class='highlight'>自定义View<\/em> wrap_content不起作用？","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1753,"link":"http://www.jianshu.com/p/655ea359e3db","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802433000,"title":"Android <em class='highlight'>自定义View<\/em>实战系列 ：时间轴","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1745,"link":"http://www.jianshu.com/p/67b69fc8b63b","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802431000,"title":"Android：你也可以自己写一个可爱 & 小资风格的加载等待<em class='highlight'>自定义View<\/em>","visible":1,"zan":0},{"apkLink":"","author":"Carson_Ho","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1746,"link":"http://www.jianshu.com/p/9a6cbb7aa54f","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802431000,"title":"Android开源控件：一款你不可错过的可爱 & 小资风格的加载等待<em class='highlight'>自定义View<\/em>","visible":1,"zan":0},{"apkLink":"","author":"鸿洋","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1714,"link":"http://blog.csdn.net/lmj623565791/article/details/37567907","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802106000,"title":"Android <em class='highlight'>自定义View<\/em>Group手把手教你实现ArcMenu","visible":1,"zan":0},{"apkLink":"","author":"鸿洋","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1704,"link":"http://blog.csdn.net/lmj623565791/article/details/38339817","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802067000,"title":"Android 手把手教您<em class='highlight'>自定义View<\/em>Group（一）","visible":1,"zan":0},{"apkLink":"","author":"鸿洋","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1703,"link":"http://blog.csdn.net/lmj623565791/article/details/38352503","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514802065000,"title":"Android <em class='highlight'>自定义View<\/em>Group 实战篇 -> 实现FlowLayout","visible":1,"zan":0},{"apkLink":"","author":"鸿洋","chapterId":0,"chapterName":"","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1676,"link":"http://blog.csdn.net/lmj623565791/article/details/46858663","niceDate":"2018-01-01","origin":"","projectLink":"","publishTime":1514801995000,"title":"Android ViewDragHelper完全解析 <em class='highlight'>自定义View<\/em>Group神器","visible":1,"zan":0},{"apkLink":"","author":"Anlia","chapterId":99,"chapterName":"具体案例","collect":false,"courseId":13,"desc":"","envelopePic":"","id":1594,"link":"https://juejin.im/post/5a32177151882535cd4ad96a","niceDate":"2017-12-20","origin":"","projectLink":"","publishTime":1513749711000,"title":"Android<em class='highlight'>自定义View<\/em>\u2014\u2014从零开始实现书籍翻页效果（二）","visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 3
         * size : 20
         * total : 47
         */

        @SerializedName("curPage")
        private int curPage;
        @SerializedName("offset")
        private int offset;
        @SerializedName("over")
        private boolean over;
        @SerializedName("pageCount")
        private int pageCount;
        @SerializedName("size")
        private int size;
        @SerializedName("total")
        private int total;
        @SerializedName("datas")
        private List<DatasBean> datas;

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public int getCurPage() {
            return curPage;
        }

        public int getOffset() {
            return offset;
        }

        public boolean getOver() {
            return over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public int getSize() {
            return size;
        }

        public int getTotal() {
            return total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public static class DatasBean {
            /**
             * apkLink :
             * author : 工匠若水
             * chapterId : 0
             * chapterName :
             * collect : false
             * courseId : 13
             * desc :
             * envelopePic :
             * id : 2105
             * link : http://blog.csdn.net/yanbober/article/details/50577855
             * niceDate : 2018-01-16
             * origin :
             * projectLink :
             * publishTime : 1516095702000
             * title : Android应用<em class='highlight'>自定义View</em>绘制方法手册
             * visible : 1
             * zan : 0
             */

            @SerializedName("apkLink")
            private String apkLink;
            @SerializedName("author")
            private String author;
            @SerializedName("chapterId")
            private int chapterId;
            @SerializedName("chapterName")
            private String chapterName;
            @SerializedName("collect")
            private boolean collect;
            @SerializedName("courseId")
            private int courseId;
            @SerializedName("desc")
            private String desc;
            @SerializedName("envelopePic")
            private String envelopePic;
            @SerializedName("id")
            private int id;
            @SerializedName("link")
            private String link;
            @SerializedName("niceDate")
            private String niceDate;
            @SerializedName("origin")
            private String origin;
            @SerializedName("projectLink")
            private String projectLink;
            @SerializedName("publishTime")
            private long publishTime;
            @SerializedName("title")
            private String title;
            @SerializedName("visible")
            private int visible;
            @SerializedName("zan")
            private int zan;

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public String getApkLink() {
                return apkLink;
            }

            public String getAuthor() {
                return author;
            }

            public int getChapterId() {
                return chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public boolean getCollect() {
                return collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public String getDesc() {
                return desc;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public int getId() {
                return id;
            }

            public String getLink() {
                return link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public String getOrigin() {
                return origin;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public String getTitle() {
                return title;
            }

            public int getVisible() {
                return visible;
            }

            public int getZan() {
                return zan;
            }
        }
    }
}
