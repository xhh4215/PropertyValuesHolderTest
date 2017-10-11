package com.example.xiaoheihei;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by xhh on 2017/10/10.
 */

public class MyTextView extends android.support.v7.widget.AppCompatTextView {

    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setCharacter(Character character){
        setText(String.valueOf(character));
    }
}
