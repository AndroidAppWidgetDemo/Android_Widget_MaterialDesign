package com.xiaxl.md.coordinatorlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2017/4/18 0018.
 */

public class TempView extends View {
    public TempView(Context context) {
        super(context, null);
    }

    public TempView(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    private float preX = 0;
    private float preY = 0;
    //
    private float viewX = 0;
    private float viewY = 0;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean flag = super.onTouchEvent(event);
        int action = event.getAction();
        //
        viewX = this.getX();
        viewY = this.getY();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                preX = event.getX();
                preY = event.getY();

                return true;
            case MotionEvent.ACTION_MOVE:
                float movX = event.getX() - preX;
                float movY = event.getY() - preY;
                //
                setX(viewX + movX);
                setY(viewY + movY);
                return true;

        }
        return flag;
    }
}
