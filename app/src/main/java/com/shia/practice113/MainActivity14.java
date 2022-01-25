package com.shia.practice113;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class MainActivity14 extends AppCompatActivity {

    ImageView imageView1, imageView2, imageView3, imageView4, imageView5;
    ExtendedFloatingActionButton fab1, fab2, fab3, fab4, fab5, fab6;

    LottieAnimationView lottie1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        //animation 1
        imageView1 = findViewById(R.id.imageView1);
        fab1 = findViewById(R.id.fab1);

        //showing animation with alpha
        AlphaAnimation alphaAnimation = new AlphaAnimation(1, 0);
        alphaAnimation.setDuration(3000);
        //don't turn to the first mood
        alphaAnimation.setFillAfter(true);
        //how many time my animation should repeat
        alphaAnimation.setRepeatCount(2);
        //alphaAnimation.setRepeatCount(Animation.INFINITE);
        //reversing to the first mood will be with animate
        alphaAnimation.setRepeatMode(Animation.REVERSE);
        //for knowing about ending and listening animation
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Toast.makeText(getApplicationContext(), "Started 1", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(getApplicationContext(), "Ended 1", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                Toast.makeText(getApplicationContext(), "Repeated 1", Toast.LENGTH_SHORT).show();
            }
        });

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.startAnimation(alphaAnimation);
            }
        });

        //animation 2
        imageView2 = findViewById(R.id.imageView2);
        fab2 = findViewById(R.id.fab2);

        //zoom in and zoom out with scale
        //width (X) will zoom from 1 to 2. height (Y) will zoom from 1 to 2. and relative to the self of pic we should choose the pivot of that. and value of our pic should be half of main value that was 1.
        ScaleAnimation scaleAnimation = new ScaleAnimation(1, 2, 1, 2, AlphaAnimation.RELATIVE_TO_SELF, 0.5f, AlphaAnimation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(2000);
        //other methods of Animation class can implement here

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.startAnimation(scaleAnimation);
            }
        });

        //animation3
        imageView3 = findViewById(R.id.imageView3);
        fab3 = findViewById(R.id.fab3);

        //from X Delta to X Delta, and Y as well.
        //TranslateAnimation translateAnimation = new TranslateAnimation(0, -200, 0, -500);
        //Relative of self will change the position, from X to X and from Y to Y.
        TranslateAnimation translateAnimation = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, -1, Animation.RELATIVE_TO_PARENT, 0, Animation.RELATIVE_TO_PARENT, 0);
        translateAnimation.setDuration(1000);
        //for getting speed to do animate
        //translateAnimation.setInterpolator(new AccelerateInterpolator());
        //for more speed
        //translateAnimation.setInterpolator(new DecelerateInterpolator());
        //dropping with shaping
        //translateAnimation.setInterpolator(new BounceInterpolator());
        //going to the place with a law speed
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());

        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView3.startAnimation(translateAnimation);
            }
        });

        //animation 4
        imageView4 = findViewById(R.id.imageView4);
        fab4 = findViewById(R.id.fab4);

        //rotation from 0 degree to 360 degree and setting pivot X and Y as value to 0.5 float
        RotateAnimation rotateAnimation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(1000);

        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView4.startAnimation(rotateAnimation);
            }
        });

        //animation 5
        imageView5 = findViewById(R.id.imageView5);
        fab5 = findViewById(R.id.fab5);

        //implementation of alpha and rotate
        AlphaAnimation alphaAnimation1 = new AlphaAnimation(1, 0);
        RotateAnimation rotateAnimation1 = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        TranslateAnimation translateAnimation1 = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_SELF, -1, Animation.ABSOLUTE, 0, Animation.ABSOLUTE, 0);

        AnimationSet animationSet = new AnimationSet(true);
        //all methods should be here not before this class
        animationSet.setDuration(2000);
        animationSet.addAnimation(alphaAnimation1);
        animationSet.addAnimation(rotateAnimation1);
        animationSet.addAnimation(translateAnimation1);

        fab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView5.startAnimation(animationSet);
            }
        });

        //Lottie Animation View
        lottie1 = findViewById(R.id.lottie1);
        fab6 = findViewById(R.id.fab6);

        fab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //stopping at this place
                lottie1.setProgress(0.5f);
                //when autoPlay in xml wasn't true, we can play our animation here
                //lottie1.playAnimation();
            }
        });
        //the listener for different situations
        lottie1.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {

            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        //for knowing about when animation update and it has a parameter that give a value for getting that
        lottie1.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getAnimatedValue();
            }
        });
    }
}