package com.xiaxl.md;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * 主题颜色更改在style文件中
 * <style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">
 * <!--TextInputLayout主题颜色-->
 * <item name="colorAccent">#ff0000</item>
 * </style>
 */
public class TextInputLayoutActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textinputlayout_activity);


    }
}
