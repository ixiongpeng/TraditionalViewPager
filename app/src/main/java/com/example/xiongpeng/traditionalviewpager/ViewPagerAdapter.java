package com.example.xiongpeng.traditionalviewpager;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by xiongpeng on 2017/9/12.
 */

public class ViewPagerAdapter extends PagerAdapter {

    List<View> listViews = null;
    public ViewPagerAdapter(List<View> list){
        listViews = list;
    }

    @Override
    public int getCount() {
        return listViews.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(listViews.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = listViews.get(position);
        container.addView(view);
        return view;
    }


}
