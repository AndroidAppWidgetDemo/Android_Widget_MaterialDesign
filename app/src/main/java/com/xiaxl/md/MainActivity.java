package com.xiaxl.md;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.xiaxl.md.coordinatorlayout.CoordinatorLayoutBehavior01Activity;
import com.xiaxl.md.coordinatorlayout.CoordinatorLayoutBehavior02Activity;
import com.xiaxl.md.tablayout.TabLayoutActivity;

/**
 * Design Support Library包含8个控件，具体如下：
 * android.support.design.widget.TextInputLayout            强大带提示的MD风格的EditText
 * android.support.design.widget.FloatingActionButton       MD风格的圆形按钮，来自于ImageView
 * android.support.design.widget.Snackbar                   类似Toast，添加了简单的单个Action
 * android.support.design.widget.TabLayout                  选项卡
 * android.support.design.widget.NavigationView             DrawerLayout的SlideMenu
 * android.support.design.widget.CoordinatorLayout          超级FrameLayout
 * android.support.design.widget.AppBarLayout               MD风格的滑动Layout
 * android.support.design.widget.CollapsingToolbarLayout    可折叠MD风格ToolbarLayout
 */
public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.SnackbarActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SnackbarActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        findViewById(R.id.TextInputLayoutActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, TextInputLayoutActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        findViewById(R.id.FloatingActionButtonActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, FloatingActionButtonActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        findViewById(R.id.TabLayoutActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, TabLayoutActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        findViewById(R.id.NavigationViewActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, NavigationViewActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        findViewById(R.id.CoordinatorLayoutBehavior01Activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, CoordinatorLayoutBehavior01Activity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        findViewById(R.id.CoordinatorLayoutBehavior02Activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, CoordinatorLayoutBehavior02Activity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        findViewById(R.id.AppBarLayoutActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, AppBarLayoutActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });


    }
}
