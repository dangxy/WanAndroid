package com.dangxy.wanandroid.module.me;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dangxy.wanandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2017/12/14
 */

public class CollectArticleAdapter extends RecyclerView.Adapter<CollectArticleAdapter.ViewHolder> {

    private List<CollectArticleEntity.DataBean.DatasBean> listEntities = new ArrayList<>();

    public CollectArticleAdapter(Context context, List<CollectArticleEntity.DataBean.DatasBean> listEntities) {
        this.listEntities = listEntities;
    }


    @Override
    public CollectArticleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.common_item_layout, parent, false);
        return new ViewHolder(layout);
    }


    @Override
    public void onBindViewHolder(CollectArticleAdapter.ViewHolder holder, int position) {

        holder.title.setText(listEntities.get(position).getTitle());
        holder.summary.setText(listEntities.get(position ).getAuthor());
        holder.more.setText(listEntities.get(position).getNiceDate());
        holder.imageView.setImageResource(R.drawable.icon_collected);

    }


    @Override
    public int getItemCount() {
        return listEntities.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title, summary, more;
        public ImageView imageView;

        public ViewHolder(View convertView) {
            super(convertView);

            title = (TextView) convertView.findViewById(R.id.title);
            summary = (TextView) convertView.findViewById(R.id.summary);
            more = (TextView) convertView.findViewById(R.id.more);
            imageView = (ImageView) convertView.findViewById(R.id.iv_collect);
        }
    }


    public void addAll(List<CollectArticleEntity.DataBean.DatasBean> newsList) {
        listEntities.addAll(newsList);
        notifyDataSetChanged();
    }

    public void refresh(List<CollectArticleEntity.DataBean.DatasBean> newsList) {
        listEntities.clear();
        listEntities.addAll(newsList);
        notifyDataSetChanged();
    }
}
