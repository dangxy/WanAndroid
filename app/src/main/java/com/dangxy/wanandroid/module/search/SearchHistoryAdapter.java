package com.dangxy.wanandroid.module.search;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.module.room.SearchEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2017/12/14
 */

public class SearchHistoryAdapter extends RecyclerView.Adapter<SearchHistoryAdapter.ViewHolder> {

    private List<SearchEntity> listEntities = new ArrayList<>();
    private SearchClickListener mSearchClickListener;

    public SearchHistoryAdapter( List<SearchEntity> listEntities) {
        this.listEntities = listEntities;
    }

    public interface SearchClickListener {

        void onDetailClickListener(SearchEntity entity);

    }

    public void setOnDetailClickListener(SearchClickListener searchClickListener) {

        this.mSearchClickListener = searchClickListener;
    }

    @Override
    public SearchHistoryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_item_layout, parent, false);
        return new ViewHolder(layout);
    }


    @Override
    public void onBindViewHolder(SearchHistoryAdapter.ViewHolder holder, final int position) {
        if(!TextUtils.isEmpty(listEntities.get(position).getName())){
            holder.searchName.setText(listEntities.get(position).getName());
        }
        holder.llSearchItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSearchClickListener.onDetailClickListener(listEntities.get(position));
            }
        });

    }


    @Override
    public int getItemCount() {
        return listEntities.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView searchName;
        private RelativeLayout llSearchItem;

        public ViewHolder(View convertView) {
            super(convertView);

            searchName = (TextView) convertView.findViewById(R.id.tv_search_name);
            llSearchItem = (RelativeLayout) convertView.findViewById(R.id.rl_search_item);
        }
    }

    
}
