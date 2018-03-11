package com.example.hasee.sdkdemo.ui.ui.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.example.hasee.sdkdemo.R;
import com.example.hasee.sdkdemo.ui.ui.ui.constant.FragmentFactory;

/**
 * 工厂模式还有点问题
 */
public class FactoryActivity extends AppCompatActivity {
    private FragmentManager mFragmentManager;
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
//获取FragmentManager
        mFragmentManager = getSupportFragmentManager();

        //获取radioGroup控件
        radioGroup = (RadioGroup) findViewById(R.id.rg_tab);

        //监听点击按钮事件,实现不同Fragment之间的切换
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentTransaction transaction = mFragmentManager.beginTransaction();
                Fragment fragment = FragmentFactory.getInstanceByIndex(checkedId);
                transaction.replace(R.id.fl_content, fragment);
                transaction.commit();
            }
        });
    }
}
