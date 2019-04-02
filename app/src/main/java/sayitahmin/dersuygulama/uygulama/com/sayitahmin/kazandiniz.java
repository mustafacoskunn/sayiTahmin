package sayitahmin.dersuygulama.uygulama.com.sayitahmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class kazandiniz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kazandiniz);
    }
    public void tekrarOyna(View view){
        Intent intent = new Intent(this, oyunBasla.class);
        finish();
        startActivity(intent);
    }
}
