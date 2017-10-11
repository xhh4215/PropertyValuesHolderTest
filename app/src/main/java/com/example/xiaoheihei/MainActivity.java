package com.example.xiaoheihei;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private MyTextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.buttonid);
        myTextView = (MyTextView) findViewById(R.id.mytextVewid);
        PropertyValuesHolder colorholder = PropertyValuesHolder.ofInt("BackgroundColor", 0xffffffff, 0xffff00ff, 0xffffff00, 0xffffffff);
        PropertyValuesHolder rotateholder = PropertyValuesHolder.ofFloat("Rotation", 60f, -60f, 40f, -40f, -20f, 20f, 10f, -10f, 0f);
        final ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(button, colorholder, rotateholder);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animator.setDuration(3000);
                animator.setInterpolator(new AccelerateInterpolator());
                animator.start();
                doOfObjectAnim();
            }
        });


    }

    private void doOfObjectAnim() {
        PropertyValuesHolder pv = PropertyValuesHolder.ofObject("Character", new CharEvaluator(), new Character('A'), new Character('Z'));
        ObjectAnimator an = ObjectAnimator.ofPropertyValuesHolder(myTextView, pv);
        an.setDuration(3000);
        an.setInterpolator(new AccelerateInterpolator());
        an.start();
    }
}
