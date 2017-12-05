package com.xiaxl.md.tablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.xiaxl.md.R;

import java.util.ArrayList;
import java.util.List;

public class TabLayoutActivity extends FragmentActivity {

    /**
     * View
     */
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    /**
     * 数据
     */
    private List<Fragment> mFragmentList;
    private List<String> mTitleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablayout_activity);

        //
        initView();
    }


    /**
     * 初始化各控件
     */
    private void initView() {

        /**
         * 初始化数据
         */
        //将fragment装进列表中
        mFragmentList = new ArrayList<>();
        mFragmentList.add(new Fragment());
        mFragmentList.add(new Fragment());
        //----------------------
        //将名称加载tab名字列表，正常情况下，我们应该在values/arrays.xml中进行定义然后调用
        mTitleList = new ArrayList<>();
        mTitleList.add("最热");
        mTitleList.add("最新");
        //----------------------------
        /**
         * 初始化View
         */
        //-------------
        mTabLayout = (TabLayout) findViewById(R.id.TabLayout001);
        //设置TabLayout的模式
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        //为TabLayout添加tab名称
        mTabLayout.addTab(mTabLayout.newTab().setText(mTitleList.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(mTitleList.get(1)));
        //------------
        mViewPager = (ViewPager) findViewById(R.id.ViewPager001);
        //viewpager加载adapter
        mViewPager.setAdapter(new TabFragmentPagerAdapter(this.getSupportFragmentManager(), mFragmentList, mTitleList));
        //------------------
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
