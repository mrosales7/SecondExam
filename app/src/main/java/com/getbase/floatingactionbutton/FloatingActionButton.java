package com.getbase.floatingactionbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

class FloatingActionButton extends View {
    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
