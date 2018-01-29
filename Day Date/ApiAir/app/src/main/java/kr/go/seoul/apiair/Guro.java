package kr.go.seoul.apiair;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import kr.go.seoul.culturalevents.CulturalEventTypeMini;

public class Guro extends Activity implements View.OnClickListener {

    private String key = "4c5057687673796338397974505555";
    private CulturalEventTypeMini typeMini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_sheet);

        typeMini = (CulturalEventTypeMini) findViewById(R.id.type_mini);
        typeMini.setOpenAPIKey(key);

        Intent intent = getIntent();
        String Extra =  intent.getExtras().getString("Extra");
        String Gu = Extra.split(";")[1];
        String Scale = Extra.split(";")[2];
        String No2 = Extra.split(";")[3];
        String O3 = Extra.split(";")[4];
        String Co = Extra.split(";")[5];
        String So2 = Extra.split(";")[6];
        String Fp = Extra.split(";")[7];
        String Ufp = Extra.split(";")[8];

        TextView textNo2 = (TextView) findViewById(R.id.txt_no2);
        textNo2.setText("이산화질소");
        TextView numNo2 = (TextView) findViewById(R.id.num_no2);
        numNo2.setText(No2 + "ppm");
        TextView textO3 = (TextView) findViewById(R.id.txt_o3);
        textO3.setText("오존");
        TextView numO3 = (TextView) findViewById(R.id.num_o3);
        numO3.setText(O3 + "ppm");
        TextView textCo = (TextView) findViewById(R.id.txt_co);
        textCo.setText("일산화탄소");
        TextView numCo = (TextView) findViewById(R.id.num_co);
        numCo.setText(Co + "ppm");
        TextView textSo2 = (TextView) findViewById(R.id.txt_so2);
        textSo2.setText("아황산가스");
        TextView numSo2 = (TextView) findViewById(R.id.num_so2);
        numSo2.setText(So2 + "ppm");
        TextView textFp = (TextView) findViewById(R.id.txt_fp);
        textFp.setText("미세먼지");
        TextView numFp = (TextView) findViewById(R.id.num_fp);
        numFp.setText(Fp + "㎍/㎥");
        TextView textUfp = (TextView) findViewById(R.id.txt_ufp);
        textUfp.setText("초미세먼지");
        TextView numUfp = (TextView) findViewById(R.id.num_ufp);
        numUfp.setText(Ufp + "㎍/㎥");
        TextView textAvg = (TextView) findViewById(R.id.avg) ;
        textAvg.setText(Gu + " : " + Scale) ;

        findViewById(R.id.btnClose).setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnClose:
                this.finish();
                break;
        }
    }
}