package com.dangxy.wanandroid.module.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.entity.CommonListEntity;
import com.dangxy.wanandroid.utils.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2017/12/14
 */

public class HomeListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<String> mImageUrllist;
    private ArrayList<String> mImageTitleList;
    private List<CommonListEntity.DataBean.DatasBean> listEntities = new ArrayList<>();
    public static final int ITEM_TYPE_HEADER = 0;
    public static final int ITEM_TYPE_CONTENT = 1;
    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private int mHeaderCount = 1;
    private CollectClickListener mCollectClickListener;

    public HomeListAdapter(Context context, List<CommonListEntity.DataBean.DatasBean> listEntities, ArrayList<String> imageUrlList, ArrayList<String> imageTitleList) {
        this.listEntities = listEntities;
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        this.mImageUrllist = imageUrlList;
        this.mImageTitleList = imageTitleList;
    }

    public interface CollectClickListener {

        void onCollectClickListener(boolean collect,String id,ImageView imageView);

    }

    public void setOnDetailClickListener(HomeListAdapter.CollectClickListener detailClickListener) {

        this.mCollectClickListener = detailClickListener;
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
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof HeaderViewHolder) {
            ((HeaderViewHolder) holder).viewPager.setImages(mImageUrllist);
            ((HeaderViewHolder) holder).viewPager.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
            ((HeaderViewHolder) holder).viewPager.setImageLoader(new GlideImageLoader());
            ((HeaderViewHolder) holder).viewPager.setBannerTitles(mImageTitleList);
            ((HeaderViewHolder) holder).viewPager.isAutoPlay(true);
            ((HeaderViewHolder) holder).viewPager.setDelayTime(2500);
            ((HeaderViewHolder) holder).viewPager.setIndicatorGravity(BannerConfig.CENTER);
            ((HeaderViewHolder) holder).viewPager.start();
        } else if (holder instanceof BodyViewHolder) {
            ((BodyViewHolder) holder).title.setText(listEntities.get(position - 1).getTitle());
            ((BodyViewHolder) holder).summary.setText(listEntities.get(position - 1).getAuthor());
            ((BodyViewHolder) holder).more.setText(listEntities.get(position - 1).getNiceDate());
            if(listEntities.get(position-1).getCollect()){
                ((BodyViewHolder) holder).imageView.setImageResource(R.drawable.icon_collected);

            }else {
                ((BodyViewHolder) holder).imageView.setImageResource(R.drawable.icon_collect);

            }

            ((BodyViewHolder) holder).relativeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mCollectClickListener.onCollectClickListener(listEntities.get(position-1).getCollect(),listEntities.get(position-1).getId()+"",((BodyViewHolder) holder).imageView);
                }
            });
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
        return listEntities.size() + 1;
    }


    public class BodyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, summary, more;
        public ImageView imageView;
        public RelativeLayout relativeLayout;

        public BodyViewHolder(View convertView) {
            super(convertView);

            title = (TextView) convertView.findViewById(R.id.title);
            summary = (TextView) convertView.findViewById(R.id.summary);
            more = (TextView) convertView.findViewById(R.id.more);
            imageView = (ImageView) convertView.findViewById(R.id.iv_collect);
            relativeLayout = (RelativeLayout) convertView.findViewById(R.id.ll_collect);
        }
    }

    public class HeaderViewHolder extends RecyclerView.ViewHolder {

        private Banner viewPager;

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
