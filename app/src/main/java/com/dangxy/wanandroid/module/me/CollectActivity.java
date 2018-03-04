package com.dangxy.wanandroid.module.me;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.dangxy.wanandroid.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/1/13
 */
public class CollectActivity extends AppCompatActivity {

    @BindView(R.id.tl_collect_list)
    TabLayout tlCollectList;
    @BindView(R.id.app_bar)
    AppBarLayout appBar;
    @BindView(R.id.vp_collect)
    ViewPager vpCollect;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.iv_back)
    ImageView imageView;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        mContext= this;
        setSupportActionBar(toolbar);
        CollectAdapter collectAdapter = new CollectAdapter(getSupportFragmentManager());
        vpCollect.setOffscreenPageLimit(1);
        vpCollect.setAdapter(collectAdapter);
        tlCollectList.setupWithViewPager(vpCollect);
        fab.setVisibility(View.GONE);
        vpCollect.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position==1){
                    fab.setVisibility(View.VISIBLE);
                }else {
                    fab.setVisibility(View.GONE);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(mContext,AddCollectActivity.class);
                startActivity(intent);
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
