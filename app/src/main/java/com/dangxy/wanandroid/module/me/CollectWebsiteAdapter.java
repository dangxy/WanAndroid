package com.dangxy.wanandroid.module.me;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dangxy.wanandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2017/12/14
 */

public class CollectWebsiteAdapter extends RecyclerView.Adapter<CollectWebsiteAdapter.ViewHolder> {

    private List<CollectWebsiteEntity.DataBean> listEntities = new ArrayList<>();
    private CollectWebsiteClickListener mCollectWebsiteClickListener;

    public CollectWebsiteAdapter(Context context, List<CollectWebsiteEntity.DataBean> listEntities) {
        this.listEntities = listEntities;
    }

    public interface CollectWebsiteClickListener {

        void onDetailClickListener(String url);

    }

    public void setOnDetailClickListener(CollectWebsiteClickListener detailClickListener) {

        this.mCollectWebsiteClickListener = detailClickListener;
    }


    @Override
    public CollectWebsiteAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.collect_websites_layout, parent, false);
        return new ViewHolder(layout);
    }


    @Override
    public void onBindViewHolder(CollectWebsiteAdapter.ViewHolder holder, final int position) {

        holder.title.setText(listEntities.get(position).getName());
        holder.link.setText(listEntities.get(position ).getLink());
       holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               mCollectWebsiteClickListener.onDetailClickListener(listEntities.get(position).getLink());
           }
       });
    }


    @Override
    public int getItemCount() {
        return listEntities.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title, link;
        public LinearLayout relativeLayout;

        public ViewHolder(View convertView) {
            super(convertView);

            title = (TextView) convertView.findViewById(R.id.title);
            link = (TextView) convertView.findViewById(R.id.link);
            relativeLayout = (LinearLayout) convertView.findViewById(R.id.ll_detail);
        }
    }

}
