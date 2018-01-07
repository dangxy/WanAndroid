package com.dangxy.wanandroid.module.category.sub;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.entity.CommonListEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2017/12/14
 */

public class CategorySubAdapter extends RecyclerView.Adapter<CategorySubAdapter.ViewHolder> {

    private List<CommonListEntity.DataBean.DatasBean> listEntities = new ArrayList<>();

    public CategorySubAdapter(Context context, List<CommonListEntity.DataBean.DatasBean> listEntities) {
        this.listEntities = listEntities;
    }


    @Override
    public CategorySubAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.common_item_layout, parent, false);
        return new ViewHolder(layout);
    }


    @Override
    public void onBindViewHolder(CategorySubAdapter.ViewHolder holder, int position) {

        holder.title.setText(listEntities.get(position).getTitle());
        holder.summary.setText(listEntities.get(position ).getAuthor());
        holder.more.setText(listEntities.get(position).getNiceDate());


    }


    @Override
    public int getItemCount() {
        return listEntities.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title, summary, more;

        public ViewHolder(View convertView) {
            super(convertView);

            title = (TextView) convertView.findViewById(R.id.title);
            summary = (TextView) convertView.findViewById(R.id.summary);
            more = (TextView) convertView.findViewById(R.id.more);
        }
    }


    public void addAll(List<CommonListEntity.DataBean.DatasBean> newsList) {
        listEntities.addAll(newsList);
        notifyDataSetChanged();
    }

    public void refresh(List<CommonListEntity.DataBean.DatasBean> newsList) {
        listEntities.clear();
        listEntities.addAll(newsList);
        notifyDataSetChanged();
    }
}
