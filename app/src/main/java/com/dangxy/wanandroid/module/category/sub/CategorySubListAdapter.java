package com.dangxy.wanandroid.module.category.sub;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.module.category.TreeEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2017/12/14
 */

public class CategorySubListAdapter extends RecyclerView.Adapter<CategorySubListAdapter.ViewHolder> {

    private List<TreeEntity> listEntities = new ArrayList<>();
    private DetailClickListener mDetailClickListener;

    public CategorySubListAdapter(List<TreeEntity> listEntities) {
        this.listEntities = listEntities;
    }

    public interface DetailClickListener {

        void onDetailClickListener(String title, String id);

    }

    public void setOnDetailClickListener(DetailClickListener detailClickListener) {

        this.mDetailClickListener = detailClickListener;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sub_item_layout, null);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {


        holder.title.setText(listEntities.get(position).getName());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDetailClickListener.onDetailClickListener(listEntities.get(position).getName(), listEntities.get(position).getId() + "");
            }
        });
    }


    @Override
    public int getItemCount() {
        return listEntities.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public RelativeLayout relativeLayout;


        public ViewHolder(View convertView) {
            super(convertView);
            title = (TextView) convertView.findViewById(R.id.title);
            relativeLayout = convertView.findViewById(R.id.rl_sub_list);
        }
    }

}
