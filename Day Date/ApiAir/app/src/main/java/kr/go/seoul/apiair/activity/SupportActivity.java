package kr.go.seoul.apiair.activity;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import kr.go.seoul.apiair.R;

public class SupportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        getSupportActionBar().hide();

        this.setTitle("ViewFlipper");

        int cnt = 0;
        Button btn1, btn2;
        ImageView image1, image2, image3;
        final ViewFlipper vFlipper;

        btn1 = (Button) findViewById(R.id.btn1); // 이전
        btn2 = (Button) findViewById(R.id.btn2); // 다음

        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        image3 = (ImageView) findViewById(R.id.image3);
        vFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);
//
//        if (cnt == 0)
//            btn1.setVisibility(View.GONE);
//        else
//            btn1.setVisibility(View.VISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showPrevious();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showNext();
            }
        });

    }
}
