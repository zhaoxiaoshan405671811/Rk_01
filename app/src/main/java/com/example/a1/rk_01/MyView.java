package com.example.a1.rk_01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 *
 * Created by 1 on 2017/7/5.
 *   自定义view 画正方形  并填充成黑色
 */

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 创建画笔
        Paint p = new Paint();
        p.setColor(Color.RED);// 设置红色
        canvas.drawText("画矩形：", 10, 80, p);
        p.setColor(Color.BLACK);// 设置黑色
        p.setStyle(Paint.Style.FILL);//设置填满
//canvas.drawRect(60, 60, 80, 80, p);// 正方形
// canvas.drawRect(160, 190, 260, 200, p);// 长方形
        canvas.drawRect(new Rect(110,110,450,450),p);// 长宽
    }
}
