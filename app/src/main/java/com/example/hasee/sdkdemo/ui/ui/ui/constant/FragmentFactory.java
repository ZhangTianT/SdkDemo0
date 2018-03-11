package com.example.hasee.sdkdemo.ui.ui.ui.constant;

import android.support.v4.app.Fragment;

import com.example.hasee.sdkdemo.R;
import com.example.hasee.sdkdemo.ui.ui.ui.jpush.JpushFragment;
import com.example.hasee.sdkdemo.ui.ui.ui.map.MapFragment;

/**
 * @author Administrator
 * 定义一个工厂模式，
 * 来实现根据下标的位置返回相应的Fragment
 */
public class FragmentFactory {
    public static Fragment getInstanceByIndex(int index) {
        Fragment fragment = null;
        switch (index) {
            case R.id.rb_gamecenter:
                fragment = new MapFragment();
                break;
            case R.id.rb_giftcenter:
                fragment = new JpushFragment();
                break;
            case R.id.rb_tradecenter:
                fragment = new JpushFragment();
                break;
            case R.id.rb_accountscenter:
                fragment = new JpushFragment();
                break;
        }
        return fragment;
    }
}