package kr.go.seoul.apiair;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    String[] Gu = new String[25];
    String S1 = "좋음";   //blue
    String S2 = "보통";   //green
    String S3 = "나쁨";   //red

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Intent intent = getIntent();
        Gu[0] = intent.getExtras().getString("jor");    String JorScale = Gu[0].split(";")[2];
        if (!JorScale.equals(S1)) {
            if(!JorScale.equals(S2)) {
                if(!JorScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_jor)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_jor)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_jor)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_jor)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[1] = intent.getExtras().getString("jg");    String JgScale = Gu[1].split(";")[2];
        if (!JgScale.equals(S1)) {
            if(!JgScale.equals(S2)) {
                if(!JgScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_jg)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_jg)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_jg)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_jg)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[2] = intent.getExtras().getString("ys");        String YsScale = Gu[2].split(";")[2];
        if (!YsScale.equals(S1)) {
            if(!YsScale.equals(S2)) {
                if(!YsScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_ys)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_ys)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_ys)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_ys)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[3] = intent.getExtras().getString("sd");        String SdScale = Gu[3].split(";")[2];
        if (!SdScale.equals(S1)) {
            if(!SdScale.equals(S2)) {
                if(!SdScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_sd)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_sd)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_sd)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_sd)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[4] = intent.getExtras().getString("gj");        String GjScale = Gu[4].split(";")[2];
        if (!GjScale.equals(S1)) {
            if(!GjScale.equals(S2)) {
                if(!GjScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_gj)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_gj)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_gj)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_gj)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[5] = intent.getExtras().getString("ddm");        String DdmScale = Gu[5].split(";")[2];
        if (!DdmScale.equals(S1)) {
            if(!DdmScale.equals(S2)) {
                if(!DdmScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_ddm)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_ddm)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_ddm)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_ddm)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[6] = intent.getExtras().getString("jr");        String JrScale = Gu[6].split(";")[2];
        if (!JrScale.equals(S1)) {
            if(!JrScale.equals(S2)) {
                if(!JrScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_jr)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_jr)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_jr)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_jr)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[7] = intent.getExtras().getString("sb");        String SbScale = Gu[7].split(";")[2];
        if (!SbScale.equals(S1)) {
            if(!SbScale.equals(S2)) {
                if(!SbScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_sb)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_sb)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_sb)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_sb)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[8] = intent.getExtras().getString("gb");     String GbScale = Gu[8].split(";")[2];
        if (!GbScale.equals(S1)) {
            if(!GbScale.equals(S2)) {
                if(!GbScale.equals(S3)) {   ((TextView)findViewById(R.id.txt_gb)).setTextColor(Color.parseColor("#000000"));   }
                else {  ((TextView)findViewById(R.id.txt_gb)).setTextColor(Color.parseColor("#FF0000"));   }
            }
            else {  ((TextView)findViewById(R.id.txt_gb)).setTextColor(Color.parseColor("#FFA500")); }
        }
        else {  ((TextView)findViewById(R.id.txt_gb)).setTextColor(Color.parseColor("#32CD32"));   }

        Gu[9] = intent.getExtras().getString("db");        String DbScale = Gu[9].split(";")[2];
        if (!DbScale.equals(S1)) {
            if(!DbScale.equals(S2)) {
                if(!DbScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_db)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_db)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_db)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_db)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[10] = intent.getExtras().getString("nw");        String NwScale = Gu[10].split(";")[2];
        if (!NwScale.equals(S1)) {
            if(!NwScale.equals(S2)) {
                if(!NwScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_nw)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_nw)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_nw)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_nw)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[11] = intent.getExtras().getString("ep");        String EpScale = Gu[11].split(";")[2];
        if (!EpScale.equals(S1)) {
            if(!EpScale.equals(S2)) {
                if(!EpScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_ep)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_ep)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_ep)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_ep)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[12] = intent.getExtras().getString("sdm");        String SdmScale = Gu[12].split(";")[2];
        if (!SdmScale.equals(S1)) {
            if(!SdmScale.equals(S2)) {
                if(!SdmScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_sdm)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_sdm)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_sdm)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_sdm)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[13] = intent.getExtras().getString("mp");        String MpScale = Gu[13].split(";")[2];
        if (!MpScale.equals(S1)) {
            if(!MpScale.equals(S2)) {
                if(!MpScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_mp)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_mp)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_mp)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_mp)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[14] = intent.getExtras().getString("yc");        String YcScale = Gu[14].split(";")[2];
        if (!YcScale.equals(S1)) {
            if(!YcScale.equals(S2)) {
                if(!YcScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_yc)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_yc)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_yc)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_yc)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[15] = intent.getExtras().getString("gs");        String GsScale = Gu[15].split(";")[2];
        if (!GsScale.equals(S1)) {
            if(!GsScale.equals(S2)) {
                if(!GsScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_gs)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_gs)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_gs)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_gs)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[16] = intent.getExtras().getString("gr");        String GrScale = Gu[16].split(";")[2];
        if (!GrScale.equals(S1)) {
            if(!GrScale.equals(S2)) {
                if(!GrScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_gr)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_gr)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_gr)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_gr)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[17] = intent.getExtras().getString("gc");        String GcScale = Gu[17].split(";")[2];
        if (!GcScale.equals(S1)) {
            if(!GcScale.equals(S2)) {
                if(!GcScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_gc)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_gc)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_gc)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_gc)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[18] = intent.getExtras().getString("ydp");        String YdpScale = Gu[18].split(";")[2];
        if (!YdpScale.equals(S1)) {
            if(!YdpScale.equals(S2)) {
                if(!YdpScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_ydp)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_ydp)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_ydp)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_ydp)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[19] = intent.getExtras().getString("dj");        String DjScale = Gu[19].split(";")[2];
        if (!DjScale.equals(S1)) {
            if(!DjScale.equals(S2)) {
                if(!DjScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_dj)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_dj)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_dj)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_dj)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[20] = intent.getExtras().getString("gw");        String GwScale = Gu[20].split(";")[2];
        if (!GwScale.equals(S1)) {
            if(!GwScale.equals(S2)) {
                if(!GwScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_gw)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_gw)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_gw)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_gw)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[21] = intent.getExtras().getString("sc");        String ScScale = Gu[21].split(";")[2];
        if (!ScScale.equals(S1)) {
            if(!ScScale.equals(S2)) {
                if(!ScScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_sc)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_sc)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_sc)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_sc)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[22] = intent.getExtras().getString("gn");        String GnScale = Gu[22].split(";")[2];
        if (!GnScale.equals(S1)) {
            if(!GnScale.equals(S2)) {
                if(!GnScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_gn)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_gn)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_gn)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_gn)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[23] = intent.getExtras().getString("sp");        String SpScale = Gu[23].split(";")[2];
        if (!SpScale.equals(S1)) {
            if(!SpScale.equals(S2)) {
                if(!SpScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_sp)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_sp)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_sp)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_sp)).setTextColor(Color.parseColor("#32CD32"));  }

        Gu[24] = intent.getExtras().getString("gd");        String GdScale = Gu[24].split(";")[2];
        if (!GdScale.equals(S1)) {
            if(!GdScale.equals(S2)) {
                if(!GdScale.equals(S3)) {  ((TextView)findViewById(R.id.txt_gd)).setTextColor(Color.parseColor("#000000"));  }
                else {  ((TextView)findViewById(R.id.txt_gd)).setTextColor(Color.parseColor("#FF0000"));  }
            }
            else {  ((TextView)findViewById(R.id.txt_gd)).setTextColor(Color.parseColor("#FFA500"));    }
        }
        else {  ((TextView)findViewById(R.id.txt_gd)).setTextColor(Color.parseColor("#32CD32"));  }

        TextView textView1 = (TextView) findViewById(R.id.textView) ;
        textView1.setText("서울특별시 실시간 대기 오염 정보") ;
        TextView textView2 = (TextView) findViewById(R.id.sub_inform1) ;
        textView2.setText("최근 갱신 시간 : ") ;
        TextView textView3 = (TextView) findViewById(R.id.renew);
        String renew_time = intent.getExtras().getString("time");
        textView3.setText(renew_time.substring(0,4) + "-" + renew_time.substring(4,6) + "-" + renew_time.substring(6,8) + " " + renew_time.substring(8,10) + "시");

        findViewById(R.id.btn_login).setOnClickListener(this);
        findViewById(R.id.txt_db).setOnClickListener(this);
        findViewById(R.id.txt_ddm).setOnClickListener(this);
        findViewById(R.id.txt_dj).setOnClickListener(this);
        findViewById(R.id.txt_ep).setOnClickListener(this);
        findViewById(R.id.txt_gb).setOnClickListener(this);
        findViewById(R.id.txt_gc).setOnClickListener(this);
        findViewById(R.id.txt_gd).setOnClickListener(this);
        findViewById(R.id.txt_gj).setOnClickListener(this);
        findViewById(R.id.txt_gn).setOnClickListener(this);
        findViewById(R.id.txt_gr).setOnClickListener(this);
        findViewById(R.id.txt_gs).setOnClickListener(this);
        findViewById(R.id.txt_gw).setOnClickListener(this);
        findViewById(R.id.txt_jg).setOnClickListener(this);
        findViewById(R.id.txt_jor).setOnClickListener(this);
        findViewById(R.id.txt_jr).setOnClickListener(this);
        findViewById(R.id.txt_mp).setOnClickListener(this);
        findViewById(R.id.txt_nw).setOnClickListener(this);
        findViewById(R.id.txt_sb).setOnClickListener(this);
        findViewById(R.id.txt_sc).setOnClickListener(this);
        findViewById(R.id.txt_sd).setOnClickListener(this);
        findViewById(R.id.txt_sdm).setOnClickListener(this);
        findViewById(R.id.txt_sp).setOnClickListener(this);
        findViewById(R.id.txt_yc).setOnClickListener(this);
        findViewById(R.id.txt_ydp).setOnClickListener(this);
        findViewById(R.id.txt_ys).setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                startActivity(new Intent(this, LoginActivity.class));   break;
            case R.id.txt_db:
                startActivity(new Intent(this, DoBong.class).putExtra("Extra", Gu[9]));          break;
            case R.id.txt_ddm:
                startActivity(new Intent(this, DongDae.class).putExtra("Extra", Gu[5]));         break;
            case R.id.txt_dj:
                startActivity(new Intent(this, DongJak.class).putExtra("Extra", Gu[19]));         break;
            case R.id.txt_ep:
                startActivity(new Intent(this, EunPyeong.class).putExtra("Extra", Gu[11]));       break;
            case R.id.txt_gb:
                startActivity(new Intent(this, GangBook.class).putExtra("Extra", Gu[8]));        break;
            case R.id.txt_gc:
                startActivity(new Intent(this, GummCheon.class).putExtra("Extra", Gu[17]));       break;
            case R.id.txt_gd:
                startActivity(new Intent(this, GangDong.class).putExtra("Extra", Gu[24]));        break;
            case R.id.txt_gj:
                startActivity(new Intent(this, GwangJin.class).putExtra("Extra", Gu[4]));        break;
            case R.id.txt_gn:
                startActivity(new Intent(this, GangNam.class).putExtra("Extra", Gu[22]));         break;
            case R.id.txt_gr:
                startActivity(new Intent(this, Guro.class).putExtra("Extra", Gu[16]));            break;
            case R.id.txt_gs:
                startActivity(new Intent(this, GangSeo.class).putExtra("Extra", Gu[15]));         break;
            case R.id.txt_gw:
                startActivity(new Intent(this, GwanAk.class).putExtra("Extra", Gu[20]));          break;
            case R.id.txt_jg:
                startActivity(new Intent(this, JoongGu.class).putExtra("Extra", Gu[1]));         break;
            case R.id.txt_jor:
                startActivity(new Intent(this, JongRo.class).putExtra("Extra", Gu[0]));          break;
            case R.id.txt_jr:
                startActivity(new Intent(this, JoongRang.class).putExtra("Extra", Gu[6]));       break;
            case R.id.txt_mp:
                startActivity(new Intent(this, Mapo.class).putExtra("Extra", Gu[13]));            break;
            case R.id.txt_nw:
                startActivity(new Intent(this, NoWon.class).putExtra("Extra", Gu[10]));           break;
            case R.id.txt_sb:
                startActivity(new Intent(this, SeongBook.class).putExtra("Extra", Gu[7]));       break;
            case R.id.txt_sc:
                startActivity(new Intent(this, SeoCho.class).putExtra("Extra", Gu[21]));          break;
            case R.id.txt_sd:
                startActivity(new Intent(this, SeongDong.class).putExtra("Extra", Gu[3]));       break;
            case R.id.txt_sdm:
                startActivity(new Intent(this, SeoDae.class).putExtra("Extra", Gu[12]));          break;
            case R.id.txt_sp:
                startActivity(new Intent(this, SongPa.class).putExtra("Extra", Gu[23]));          break;
            case R.id.txt_yc:
                startActivity(new Intent(this, YangCheon.class).putExtra("Extra", Gu[14]));       break;
            case R.id.txt_ydp:
                startActivity(new Intent(this, YeongDeung.class).putExtra("Extra", Gu[18]));      break;
            case R.id.txt_ys:
                startActivity(new Intent(this, YongSan.class).putExtra("Extra", Gu[2]));         break;
        }
    }
}
