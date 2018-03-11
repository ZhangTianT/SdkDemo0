package com.example.hasee.sdkdemo.ui.ui.ui.map;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hasee.sdkdemo.R;
import com.example.hasee.sdkdemo.ui.ui.ui.FactoryActivity;
import com.example.hasee.sdkdemo.ui.ui.ui.map.activity.LocationActivity;
import com.example.hasee.sdkdemo.ui.ui.ui.map.activity.Map3DActivity;
import com.example.hasee.sdkdemo.ui.ui.ui.map.activity.SearchActivity;

/**
 * Created by JOJO on 2017/9/18.
 */

public class MapFragment extends Fragment implements View.OnClickListener {
    private TextView tv1, tv2, tv3,tv4;
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.fragment_map, container, false);
        initView();
        return view;
    }

 private void initView(){
        tv1 = (TextView) view.findViewById(R.id.tv1);
        tv2 = (TextView) view.findViewById(R.id.tv2);
        tv3 = (TextView) view.findViewById(R.id.tv3);
     tv4 = (TextView) view.findViewById(R.id.tv4);

     tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
tv4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv1:
                startActivity(new Intent(getActivity(), LocationActivity.class));
                break;
            case R.id.tv2:
                startActivity(new Intent(getActivity(), Map3DActivity.class));

                break;
            case R.id.tv3:
                startActivity(new Intent(getActivity(), SearchActivity.class));

                break;
            case R.id.tv4:
                startActivity(new Intent(getActivity(), FactoryActivity.class));

                break;

        }
    }
}
