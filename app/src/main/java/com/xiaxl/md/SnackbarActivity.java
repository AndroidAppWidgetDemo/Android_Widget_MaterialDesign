package com.xiaxl.md;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SnackbarActivity extends Activity {


    CoordinatorLayout mCoordinatorLayout;
    //
    Button mShowBtn01 = null;
    Button mShowBtn02 = null;
    Button mShowBtn03 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snackbar_activity);

        mCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.CoordinatorLayout01);
        //
        mShowBtn01 = (Button) findViewById(R.id.ShowBtn01);
        mShowBtn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(mCoordinatorLayout, "SnackbarTest", Snackbar.LENGTH_LONG).show();
            }
        });
        //
        mShowBtn02 = (Button) findViewById(R.id.ShowBtn02);
        mShowBtn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(mCoordinatorLayout, "SnackbarTest", Snackbar.LENGTH_LONG).setAction("我是Snackbar按妞", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(mCoordinatorLayout, "Snackbar按妞被点击了", Snackbar.LENGTH_LONG).show();
                    }
                }).show();
            }
        });
        //
        mShowBtn03 = (Button) findViewById(R.id.ShowBtn03);
        mShowBtn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar =
                        Snackbar.make(mCoordinatorLayout, "SnackbarTest", Snackbar.LENGTH_LONG).setAction("Action", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Snackbar.make(mCoordinatorLayout, "ActionClick", Snackbar.LENGTH_LONG).show();
                            }
                        });
                ((TextView) snackbar.getView().findViewById(R.id.snackbar_text)).setTextColor(Color.parseColor("#FF0000"));
                snackbar.show();
            }
        });


    }
}
