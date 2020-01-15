package com.example.graphic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

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

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        Paint p = new Paint();
        int height = getHeight();
        int width = getWidth();
        System.out.println(height + " " + width);
        p.setColor(Color.parseColor("#ffffff"));
        p.setStrokeWidth(10);
        p.setAntiAlias(true); //сглаживание
        p.setStyle(Paint.Style.FILL);
        canvas.drawPaint(p);
        p.setColor(Color.YELLOW);
        canvas.drawCircle(150, 150, 100, p);
        // Здесь будет цикл, который рисует лучи солнца
        //canvas.drawLine(300, 300, 600, 300, p);
        p.setColor(Color.GREEN);
        canvas.drawRect(0, height / 2 + height / 3, width, height, p);
        p.setColor(Color.parseColor("#964b00"));
        canvas.drawRect(width / 6, height / 2, width / 6 + width / 2,
                height / 2 + height / 3, p);
        //p.setTextSize(64);
        //p.setStyle(Paint.Style.STROKE);
        //canvas.drawText("IT School", 40, 40, p);

        Path path = new Path();
        path.moveTo(width / 6, height / 2);
        path.lineTo((width / 6 + width / 2) / 2, height / 3);
        path.lineTo(width / 6 + width / 2, height / 2);
        path.close();
        canvas.drawPath(path, p);

        p.setStyle(Paint.Style.STROKE);
        p.setColor(Color.BLACK);
        path.moveTo(width / 6, height / 2);
        path.lineTo((width / 6 + width / 2) / 2, height / 3);
        path.lineTo(width / 6 + width / 2, height / 2);
        path.close();
        canvas.drawPath(path, p);

        p.setStyle(Paint.Style.FILL);
        //canvas.drawRect(width / 2 + height / 4 + height / 2, );
    }
}
