package sayitahmin.dersuygulama.uygulama.com.sayitahmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class oyunBasla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun_basla);
    }

    public void basla(View view){
        Intent intent=new Intent(this,oyun.class);
        startActivity(intent);
    }
}
