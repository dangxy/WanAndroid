package com.dangxy.wanandroid.module.category;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/7
 */

public class TreeEntity implements Parcelable {
        /**
         * id : 150
         * name : 开发环境
         * courseId : 13
         * parentChapterId : 0
         * order : 1
         * visible : 1
         * children : [{"id":60,"name":"Android Studio相关","courseId":13,"parentChapterId":150,"order":1000,"visible":1,"children":[]},{"id":169,"name":"gradle","courseId":13,"parentChapterId":150,"order":1001,"visible":1,"children":[]}]
         */

        private int id;
        private String name;
        private int courseId;
        private int parentChapterId;
        private int order;
        private int visible;
        private List<TreeEntity> children;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }

        public int getParentChapterId() {
            return parentChapterId;
        }

        public void setParentChapterId(int parentChapterId) {
            this.parentChapterId = parentChapterId;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getVisible() {
            return visible;
        }

        public void setVisible(int visible) {
            this.visible = visible;
        }

        public List<TreeEntity> getChildren() {
            return children;
        }

        public void setChildren(List<TreeEntity> children) {
            this.children = children;
        }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeInt(this.courseId);
        dest.writeInt(this.parentChapterId);
        dest.writeInt(this.order);
        dest.writeInt(this.visible);
        dest.writeList(this.children);
    }

    public TreeEntity() {
    }

    protected TreeEntity(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.courseId = in.readInt();
        this.parentChapterId = in.readInt();
        this.order = in.readInt();
        this.visible = in.readInt();
        this.children = new ArrayList<TreeEntity>();
        in.readList(this.children, List.class.getClassLoader());
    }

    public static final Parcelable.Creator<TreeEntity> CREATOR = new Parcelable.Creator<TreeEntity>() {
            @Override
        public TreeEntity createFromParcel(Parcel source) {
            return new TreeEntity(source);
        }
        @Override
        public TreeEntity[] newArray(int size) {
            return new TreeEntity[size];
        }
    };


}

