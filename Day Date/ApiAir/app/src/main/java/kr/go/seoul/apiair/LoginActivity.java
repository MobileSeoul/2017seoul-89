package kr.go.seoul.apiair;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.btn_log).setOnClickListener(this);
        findViewById(R.id.btn_back).setOnClickListener(this);
    }

    public void onClick(View v) {
        EditText editId= (EditText)findViewById(R.id.edit_id);
        EditText editPw= (EditText)findViewById(R.id.edit_pw);

        String AdminId = new String("ksie456");
        String AdminPw = new String("111111");

        switch (v.getId()) {
            case R.id.btn_log:
                if(editId.getText().toString().equals(AdminId)) {
                    if(editPw.getText().toString().equals(AdminPw)){
                        this.finish();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "로그인 실패!", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "로그인 실패!", Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.btn_back:
                this.finish();
                break;
        }
    }
}
