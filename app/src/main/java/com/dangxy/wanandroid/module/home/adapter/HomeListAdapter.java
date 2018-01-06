package com.dangxy.wanandroid.module.home.adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.entity.CommonListEntity;
import com.dangxy.wanandroid.module.home.BannerEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2017/12/14
 */

public class HomeListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final HomeBannerAdapter homeBannerAdapter;
    private List<CommonListEntity.DataBean.DatasBean> listEntities = new ArrayList<>();
    public static final int ITEM_TYPE_HEADER = 0;
    public static final int ITEM_TYPE_CONTENT = 1;
    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private int mHeaderCount = 1;//头部View个数
    public HomeListAdapter(Context context, List<CommonListEntity.DataBean.DatasBean> listEntities,BannerEntity bannerEntity) {
        this.listEntities = listEntities;
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        homeBannerAdapter = new HomeBannerAdapter(mContext, bannerEntity.getData());
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == ITEM_TYPE_HEADER) {
            return new HeaderViewHolder(mLayoutInflater.inflate(R.layout.home_header_layout, parent, false));
        } else if (viewType == ITEM_TYPE_CONTENT) {
            View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.common_item_layout, parent, false);
            return new BodyViewHolder(layout);
        }
        return null;
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof HeaderViewHolder) {
            ((HeaderViewHolder) holder).viewPager.setAdapter(homeBannerAdapter);
        } else if (holder instanceof BodyViewHolder) {
            ((BodyViewHolder) holder).title.setText(listEntities.get(position-1).getTitle());
            ((BodyViewHolder) holder).summary.setText(listEntities.get(position-1).getAuthor());
            ((BodyViewHolder) holder).more.setText(listEntities.get(position-1).getNiceDate());
        }


    }

    @Override
    public int getItemViewType(int position) {
        if (mHeaderCount != 0 && position < mHeaderCount) {
            return ITEM_TYPE_HEADER;
        } else {
            return ITEM_TYPE_CONTENT;
        }
    }

    @Override
    public int getItemCount() {
        return listEntities.size()+1;
    }


    public class BodyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, summary, more;

        public BodyViewHolder(View convertView) {
            super(convertView);

            title = (TextView) convertView.findViewById(R.id.title);
            summary = (TextView) convertView.findViewById(R.id.summary);
            more = (TextView) convertView.findViewById(R.id.more);
        }
    }

    public class HeaderViewHolder extends RecyclerView.ViewHolder {

        private ViewPager viewPager;

        public HeaderViewHolder(View convertView) {
            super(convertView);

            viewPager = convertView.findViewById(R.id.vp_home);
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
