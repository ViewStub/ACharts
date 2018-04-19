package com.wooou.chart.line;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.wooou.chartbase.BaseChartView;

/**
 * Created by lenovo on 2018/4/19.
 */

public class BasicLineChart extends BaseChartView {
    public BasicLineChart(Context context) {
        super(context);
    }

    public BasicLineChart(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BasicLineChart(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BasicLineChart(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onAnimationStart() {
        super.onAnimationStart();


    }
}
