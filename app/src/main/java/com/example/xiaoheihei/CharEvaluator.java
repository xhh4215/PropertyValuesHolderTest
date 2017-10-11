package com.example.xiaoheihei;

import android.animation.TypeEvaluator;

/**
 * Created by xhh on 2017/10/10.
 */

public class CharEvaluator implements TypeEvaluator<Character> {
    @Override
    public Character evaluate(float v, Character character1, Character character2) {
        int start = (int) character1;
        int end = (int) character2;
        int current = (int)(character1+(character2-character1)*v);
        char currentchar = (char) current;
        return currentchar;
    }
}
