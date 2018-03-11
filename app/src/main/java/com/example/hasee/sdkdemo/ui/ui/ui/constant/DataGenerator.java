package com.example.hasee.sdkdemo.ui.ui.ui.constant;

import android.support.v4.app.Fragment;
import com.example.hasee.sdkdemo.ui.ui.ui.jpush.JpushFragment;
import com.example.hasee.sdkdemo.ui.ui.ui.map.MapFragment;

/**
 * Created by hasee on 2018/3/10.
 */

public class DataGenerator {
    public static Fragment[] getFragments(){
        Fragment fragments[] = new Fragment[4];
        fragments[0] = new MapFragment();
        fragments[1] = new JpushFragment();
        fragments[2] = new MapFragment();
        fragments[3] = new MapFragment();
        return fragments;
    }
}