package com.example.backo_000.and_integrationapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * Created by backo_000 on 2017-06-13.
 */

public class AndroidAnimationActivity extends AppCompatActivity  {

    static Animation RectangleAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.androidanimation_activity);

        final ImageView rectimage = (ImageView)findViewById(R.id.rectimage);

        rectimage.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    RectangleAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation);
                    rectimage.startAnimation(RectangleAnim);
                    return true;
                }
                else if(event.getAction() == MotionEvent.ACTION_UP) {
                    RectangleAnim.cancel();
                    rectimage.clearAnimation();
                    RectangleAnim = null;
                }
                return false;
            }
        });
    }
}
