package com.example.xiongpeng.traditionalviewpager;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button weixin = null;
    Button pengyou = null;
    Button tongxunlu = null;
    Button shezhi = null;
    List<View> listViews = null;
    ViewPager viewPager = null;
    ViewPagerAdapter viewPagerAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        LayoutInflater inflater = LayoutInflater.from(this);
        weixin = (Button)findViewById(R.id.weixin);
        pengyou = (Button)findViewById(R.id.pengyou);
        tongxunlu = (Button)findViewById(R.id.tongxunlu);
        shezhi = (Button)findViewById(R.id.shezhi);
        weixin.setOnClickListener(this);
        pengyou.setOnClickListener(this);
        tongxunlu.setOnClickListener(this);
        shezhi.setOnClickListener(this);

        View weiXinView = inflater.inflate(R.layout.viewpager_weixing, null);
        View pengYouView = inflater.inflate(R.layout.viewpager_weixing, null);
        View tongXunLuView = inflater.inflate(R.layout.viewpager_weixing, null);
        View sheZhiView = inflater.inflate(R.layout.viewpager_weixing, null);
        listViews = new ArrayList<View>();
        listViews.add(weiXinView);
        listViews.add(pengYouView);
        listViews.add(tongXunLuView);
        listViews.add(sheZhiView);

        viewPagerAdapter = new ViewPagerAdapter(listViews);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPager.setAdapter(viewPagerAdapter);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        weixin.setBackgroundColor(Color.YELLOW);
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
    public void resetBacjColor(){
       // weixin.setBackgroundColor(Integer.parseInt(3aaaaaa));
    }

    @Override
    public void onClick(View view) {
        //resetBacjColor()
        switch (view.getId()){
            case R.id.weixin:
                weixin.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.pengyou:
                break;
            case R.id.tongxunlu:
                break;
            case R.id.shezhi:
                break;
        }
    }
}
