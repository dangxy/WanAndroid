package com.dangxy.wanandroid.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/6
 */

public class CommonListEntity {


    /**
     * errorCode : 0
     * errorMsg : null
     * data : {"datas":[{"id":1841,"title":"必知必会 | Android 性能优化的方面方面都在这儿","chapterId":78,"chapterName":"性能优化","envelopePic":null,"link":"http://mp.weixin.qq.com/s/QVOYF2nfoWMCbM5YsxQgRQ","author":"鸿洋","origin":null,"publishTime":1515156977000,"zan":null,"desc":null,"visible":0,"niceDate":"1天前","courseId":13,"collect":false},{"id":1840,"title":"得到Android团队无埋点方案","chapterId":191,"chapterName":"数据采集与埋点","envelopePic":null,"link":"http://www.wanandroid.com/blog/show/8","author":"小编","origin":null,"publishTime":1515121574000,"zan":null,"desc":null,"visible":0,"niceDate":"1天前","courseId":13,"collect":false},{"id":1839,"title":"如何让你的app在后台被干掉后优雅的重新启动","chapterId":228,"chapterName":"辅助 or 工具类","envelopePic":null,"link":"https://www.jianshu.com/p/1946bd4f3bb5","author":"Me豪","origin":null,"publishTime":1515119001000,"zan":null,"desc":null,"visible":0,"niceDate":"1天前","courseId":13,"collect":false},{"id":1838,"title":"鸿洋公众号文章大合集","chapterId":249,"chapterName":"干货资源","envelopePic":null,"link":"http://www.wanandroid.com/blog/show/6","author":"鸿洋","origin":null,"publishTime":1515073786000,"zan":null,"desc":null,"visible":0,"niceDate":"2天前","courseId":13,"collect":false},{"id":1837,"title":"Android8.0 新SupportLibrary26、27功能及变化介绍","chapterId":269,"chapterName":"官方发布","envelopePic":null,"link":"https://juejin.im/post/5a3b9de2f265da43085e336b","author":"一只有交流障碍的丑程序猿","origin":null,"publishTime":1515037605000,"zan":null,"desc":null,"visible":0,"niceDate":"2天前","courseId":13,"collect":false},{"id":1836,"title":"Emoji 让你这么头疼，那 EmojiCompat 是如何解决它的？","chapterId":26,"chapterName":"基础UI控件","envelopePic":null,"link":"https://juejin.im/post/5a4d7fc2518825697078636f","author":"承香墨影","origin":null,"publishTime":1515037560000,"zan":null,"desc":null,"visible":0,"niceDate":"2天前","courseId":13,"collect":false},{"id":1835,"title":"滚动截屏，RecyclerView截屏，ScrollView截屏，ListView截屏","chapterId":228,"chapterName":"辅助 or 工具类","envelopePic":null,"link":"https://mp.weixin.qq.com/s/JPVZtErFTzJ5PDuTAPk0DA","author":"BoBoMEe","origin":null,"publishTime":1515037503000,"zan":null,"desc":null,"visible":0,"niceDate":"2天前","courseId":13,"collect":false},{"id":1834,"title":"教你如何一套源码编译多个APP，不同的签名，包名，界面，字段...","chapterId":169,"chapterName":"gradle","envelopePic":null,"link":"https://mp.weixin.qq.com/s/cjvPVG6ifry6VsLkAu6JEQ","author":"隔壁王较瘦","origin":null,"publishTime":1515037455000,"zan":null,"desc":null,"visible":0,"niceDate":"2天前","courseId":13,"collect":false},{"id":1833,"title":"教你用Python来玩微信跳一跳","chapterId":249,"chapterName":"干货资源","envelopePic":null,"link":"https://zhuanlan.zhihu.com/p/32452473","author":"神奇的战士","origin":null,"publishTime":1514946784000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-03","courseId":13,"collect":false},{"id":1832,"title":"【开源项目】python 微信《跳一跳》辅助","chapterId":249,"chapterName":"干货资源","envelopePic":null,"link":"https://github.com/wangshub/wechat_jump_game","author":"wangshub","origin":null,"publishTime":1514946766000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-03","courseId":13,"collect":false},{"id":1831,"title":"Kotlin实战（三）: 动手撸个玩Android客户端","chapterId":254,"chapterName":"新闻资讯","envelopePic":null,"link":"https://www.jianshu.com/p/955065556a5a","author":"叫我旺仔","origin":null,"publishTime":1514906817000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-02","courseId":13,"collect":false},{"id":1830,"title":"如何避免使用onActivityResult，以提高代码可读性","chapterId":268,"chapterName":"优秀的设计","envelopePic":null,"link":"https://juejin.im/post/5a4611786fb9a0451a76b565","author":" asAnotherJack","origin":null,"publishTime":1514906664000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-02","courseId":13,"collect":false},{"id":1829,"title":"Xposed了解以及在Android中的应用","chapterId":239,"chapterName":"Xposed","envelopePic":null,"link":"https://juejin.im/post/5a47e0d9f265da4315243f7a","author":"stormWen","origin":null,"publishTime":1514906570000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-02","courseId":13,"collect":false},{"id":1828,"title":"一起看一下主流应用使用了哪些三方库","chapterId":249,"chapterName":"干货资源","envelopePic":null,"link":"https://juejin.im/post/5a45f4def265da43195698e2","author":" dmx","origin":null,"publishTime":1514906537000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-02","courseId":13,"collect":false},{"id":1827,"title":"随手记Android JS与Native交互实践","chapterId":98,"chapterName":"WebView","envelopePic":null,"link":"https://mp.weixin.qq.com/s?__biz=MzUyNzMwMTAwNw==&mid=2247483719&idx=1&sn=0bd0a69bbd7189bf41cd62c9a4826c01&chksm=fa00e1a7cd7768b1646b181bffa2b55edb2bbf38cc4596af12121ee857a758380c270db09cf4&scene=38#wechat_redirect","author":" 随手记技术团队","origin":null,"publishTime":1514906447000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-02","courseId":13,"collect":false},{"id":1825,"title":"Android 开发，你遇上 Emoji 头疼吗？","chapterId":26,"chapterName":"基础UI控件","envelopePic":null,"link":"https://juejin.im/post/5a45b38451882512d823076a","author":"承香墨影","origin":null,"publishTime":1514804168000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-01","courseId":13,"collect":false},{"id":1824,"title":"公众号 「code小生」 2017推文记录(年终)","chapterId":249,"chapterName":"干货资源","envelopePic":null,"link":"http://www.wanandroid.com/blog/show/7","author":"code小生","origin":null,"publishTime":1514802732000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-01","courseId":13,"collect":false},{"id":1823,"title":"Android开发：XML简介及DOM、SAX、PULL解析对比","chapterId":71,"chapterName":"数据解析","envelopePic":null,"link":"http://www.jianshu.com/p/e636f4f8487b","author":"Carson_Ho","origin":null,"publishTime":1514802491000,"zan":null,"desc":null,"visible":1,"niceDate":"2018-01-01","courseId":13,"collect":false},{"id":1820,"title":"Java：详解 抽象类（abstract class） &amp; 接口（Interface）的区别","chapterId":198,"chapterName":"基础概念","envelopePic":null,"link":"http://www.jianshu.com/p/d8f06ad45135","author":"Carson_Ho","origin":null,"publishTime":1514802490000,"zan":null,"desc":null,"visible":1,"niceDate":"2018-01-01","courseId":13,"collect":false},{"id":1821,"title":"Android开发：5分钟解析Activity&amp;Fragment生命周期","chapterId":10,"chapterName":"Activity","envelopePic":null,"link":"http://www.jianshu.com/p/b1ff03a7bb1f","author":"Carson_Ho","origin":null,"publishTime":1514802490000,"zan":null,"desc":null,"visible":1,"niceDate":"2018-01-01","courseId":13,"collect":false}],"offset":0,"size":20,"total":1112,"pageCount":56,"curPage":1,"over":false}
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
         * datas : [{"id":1841,"title":"必知必会 | Android 性能优化的方面方面都在这儿","chapterId":78,"chapterName":"性能优化","envelopePic":null,"link":"http://mp.weixin.qq.com/s/QVOYF2nfoWMCbM5YsxQgRQ","author":"鸿洋","origin":null,"publishTime":1515156977000,"zan":null,"desc":null,"visible":0,"niceDate":"1天前","courseId":13,"collect":false},{"id":1840,"title":"得到Android团队无埋点方案","chapterId":191,"chapterName":"数据采集与埋点","envelopePic":null,"link":"http://www.wanandroid.com/blog/show/8","author":"小编","origin":null,"publishTime":1515121574000,"zan":null,"desc":null,"visible":0,"niceDate":"1天前","courseId":13,"collect":false},{"id":1839,"title":"如何让你的app在后台被干掉后优雅的重新启动","chapterId":228,"chapterName":"辅助 or 工具类","envelopePic":null,"link":"https://www.jianshu.com/p/1946bd4f3bb5","author":"Me豪","origin":null,"publishTime":1515119001000,"zan":null,"desc":null,"visible":0,"niceDate":"1天前","courseId":13,"collect":false},{"id":1838,"title":"鸿洋公众号文章大合集","chapterId":249,"chapterName":"干货资源","envelopePic":null,"link":"http://www.wanandroid.com/blog/show/6","author":"鸿洋","origin":null,"publishTime":1515073786000,"zan":null,"desc":null,"visible":0,"niceDate":"2天前","courseId":13,"collect":false},{"id":1837,"title":"Android8.0 新SupportLibrary26、27功能及变化介绍","chapterId":269,"chapterName":"官方发布","envelopePic":null,"link":"https://juejin.im/post/5a3b9de2f265da43085e336b","author":"一只有交流障碍的丑程序猿","origin":null,"publishTime":1515037605000,"zan":null,"desc":null,"visible":0,"niceDate":"2天前","courseId":13,"collect":false},{"id":1836,"title":"Emoji 让你这么头疼，那 EmojiCompat 是如何解决它的？","chapterId":26,"chapterName":"基础UI控件","envelopePic":null,"link":"https://juejin.im/post/5a4d7fc2518825697078636f","author":"承香墨影","origin":null,"publishTime":1515037560000,"zan":null,"desc":null,"visible":0,"niceDate":"2天前","courseId":13,"collect":false},{"id":1835,"title":"滚动截屏，RecyclerView截屏，ScrollView截屏，ListView截屏","chapterId":228,"chapterName":"辅助 or 工具类","envelopePic":null,"link":"https://mp.weixin.qq.com/s/JPVZtErFTzJ5PDuTAPk0DA","author":"BoBoMEe","origin":null,"publishTime":1515037503000,"zan":null,"desc":null,"visible":0,"niceDate":"2天前","courseId":13,"collect":false},{"id":1834,"title":"教你如何一套源码编译多个APP，不同的签名，包名，界面，字段...","chapterId":169,"chapterName":"gradle","envelopePic":null,"link":"https://mp.weixin.qq.com/s/cjvPVG6ifry6VsLkAu6JEQ","author":"隔壁王较瘦","origin":null,"publishTime":1515037455000,"zan":null,"desc":null,"visible":0,"niceDate":"2天前","courseId":13,"collect":false},{"id":1833,"title":"教你用Python来玩微信跳一跳","chapterId":249,"chapterName":"干货资源","envelopePic":null,"link":"https://zhuanlan.zhihu.com/p/32452473","author":"神奇的战士","origin":null,"publishTime":1514946784000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-03","courseId":13,"collect":false},{"id":1832,"title":"【开源项目】python 微信《跳一跳》辅助","chapterId":249,"chapterName":"干货资源","envelopePic":null,"link":"https://github.com/wangshub/wechat_jump_game","author":"wangshub","origin":null,"publishTime":1514946766000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-03","courseId":13,"collect":false},{"id":1831,"title":"Kotlin实战（三）: 动手撸个玩Android客户端","chapterId":254,"chapterName":"新闻资讯","envelopePic":null,"link":"https://www.jianshu.com/p/955065556a5a","author":"叫我旺仔","origin":null,"publishTime":1514906817000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-02","courseId":13,"collect":false},{"id":1830,"title":"如何避免使用onActivityResult，以提高代码可读性","chapterId":268,"chapterName":"优秀的设计","envelopePic":null,"link":"https://juejin.im/post/5a4611786fb9a0451a76b565","author":" asAnotherJack","origin":null,"publishTime":1514906664000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-02","courseId":13,"collect":false},{"id":1829,"title":"Xposed了解以及在Android中的应用","chapterId":239,"chapterName":"Xposed","envelopePic":null,"link":"https://juejin.im/post/5a47e0d9f265da4315243f7a","author":"stormWen","origin":null,"publishTime":1514906570000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-02","courseId":13,"collect":false},{"id":1828,"title":"一起看一下主流应用使用了哪些三方库","chapterId":249,"chapterName":"干货资源","envelopePic":null,"link":"https://juejin.im/post/5a45f4def265da43195698e2","author":" dmx","origin":null,"publishTime":1514906537000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-02","courseId":13,"collect":false},{"id":1827,"title":"随手记Android JS与Native交互实践","chapterId":98,"chapterName":"WebView","envelopePic":null,"link":"https://mp.weixin.qq.com/s?__biz=MzUyNzMwMTAwNw==&mid=2247483719&idx=1&sn=0bd0a69bbd7189bf41cd62c9a4826c01&chksm=fa00e1a7cd7768b1646b181bffa2b55edb2bbf38cc4596af12121ee857a758380c270db09cf4&scene=38#wechat_redirect","author":" 随手记技术团队","origin":null,"publishTime":1514906447000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-02","courseId":13,"collect":false},{"id":1825,"title":"Android 开发，你遇上 Emoji 头疼吗？","chapterId":26,"chapterName":"基础UI控件","envelopePic":null,"link":"https://juejin.im/post/5a45b38451882512d823076a","author":"承香墨影","origin":null,"publishTime":1514804168000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-01","courseId":13,"collect":false},{"id":1824,"title":"公众号 「code小生」 2017推文记录(年终)","chapterId":249,"chapterName":"干货资源","envelopePic":null,"link":"http://www.wanandroid.com/blog/show/7","author":"code小生","origin":null,"publishTime":1514802732000,"zan":null,"desc":null,"visible":0,"niceDate":"2018-01-01","courseId":13,"collect":false},{"id":1823,"title":"Android开发：XML简介及DOM、SAX、PULL解析对比","chapterId":71,"chapterName":"数据解析","envelopePic":null,"link":"http://www.jianshu.com/p/e636f4f8487b","author":"Carson_Ho","origin":null,"publishTime":1514802491000,"zan":null,"desc":null,"visible":1,"niceDate":"2018-01-01","courseId":13,"collect":false},{"id":1820,"title":"Java：详解 抽象类（abstract class） &amp; 接口（Interface）的区别","chapterId":198,"chapterName":"基础概念","envelopePic":null,"link":"http://www.jianshu.com/p/d8f06ad45135","author":"Carson_Ho","origin":null,"publishTime":1514802490000,"zan":null,"desc":null,"visible":1,"niceDate":"2018-01-01","courseId":13,"collect":false},{"id":1821,"title":"Android开发：5分钟解析Activity&amp;Fragment生命周期","chapterId":10,"chapterName":"Activity","envelopePic":null,"link":"http://www.jianshu.com/p/b1ff03a7bb1f","author":"Carson_Ho","origin":null,"publishTime":1514802490000,"zan":null,"desc":null,"visible":1,"niceDate":"2018-01-01","courseId":13,"collect":false}]
         * offset : 0
         * size : 20
         * total : 1112
         * pageCount : 56
         * curPage : 1
         * over : false
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
             * id : 1841
             * title : 必知必会 | Android 性能优化的方面方面都在这儿
             * chapterId : 78
             * chapterName : 性能优化
             * envelopePic : null
             * link : http://mp.weixin.qq.com/s/QVOYF2nfoWMCbM5YsxQgRQ
             * author : 鸿洋
             * origin : null
             * publishTime : 1515156977000
             * zan : null
             * desc : null
             * visible : 0
             * niceDate : 1天前
             * courseId : 13
             * collect : false
             */

            @SerializedName("id")
            private int id;
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
            private Object zan;
            @SerializedName("desc")
            private Object desc;
            @SerializedName("visible")
            private int visible;
            @SerializedName("niceDate")
            private String niceDate;
            @SerializedName("courseId")
            private int courseId;
            @SerializedName("collect")
            private boolean collect;

            public void setId(int id) {
                this.id = id;
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

            public void setZan(Object zan) {
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

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getId() {
                return id;
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

            public Object getZan() {
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

            public boolean getCollect() {
                return collect;
            }
        }
    }
}
