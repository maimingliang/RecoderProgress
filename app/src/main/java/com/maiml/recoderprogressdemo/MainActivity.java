package com.maiml.recoderprogressdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.maiml.recoderprogressdemo.widget.RecoderProgress;

public class MainActivity extends AppCompatActivity {

    private RecoderProgress recoderProgress;

    private boolean isStart = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recoderProgress = (RecoderProgress) findViewById(R.id.recodrProgress);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(!isStart){
                    recoderProgress.startAnimation();
                }else{
                    recoderProgress.stopAnimation();

                }
                isStart = !isStart;
            }
        });
    }
}
