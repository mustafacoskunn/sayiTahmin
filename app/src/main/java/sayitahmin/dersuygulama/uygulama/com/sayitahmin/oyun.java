package sayitahmin.dersuygulama.uygulama.com.sayitahmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class oyun extends AppCompatActivity {

    EditText editText;
    TextView kalanHakText;
    Button tahminEt;
    Random random=new Random();
    int rastgeleSayi;
    int kalanHak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun);
        editText=findViewById(R.id.editText);
        tahminEt=findViewById(R.id.tahminEt);
        kalanHakText=findViewById(R.id.kalanHakText);

        rastgeleSayi=random.nextInt(100);
        kalanHak=5;
        System.out.println("Rastgele sayi:"+rastgeleSayi);
        kalanHakText.setText("Kalan Hak:"+kalanHak);

    }

    public void tahminEtClick(View view){
        System.out.println("edittext"+editText.length());
        kalanHakText.setText("Kalan Hak:"+kalanHak);

        if(editText.getText().length()>0) {

            int editTextSayi=Integer.valueOf(editText.getText().toString());


            if (editTextSayi == rastgeleSayi && kalanHak>=0) {
                Intent intent = new Intent(this, kazandiniz.class);
                finish();
                startActivity(intent);

            }

            if (editTextSayi<rastgeleSayi && kalanHak>0){

                kalanHak--;
                Toast.makeText(getApplicationContext(),"Tahmin değerini artırınız",Toast.LENGTH_LONG).show();
                kalanHakText.setText("Kalan Hak:"+kalanHak);

            }
            if (editTextSayi>rastgeleSayi && kalanHak>0){
                kalanHak--;
                Toast.makeText(getApplicationContext(),"Tahmin değerini azaltınız",Toast.LENGTH_LONG).show();
                kalanHakText.setText("Kalan Hak:"+kalanHak);

            }
            if(kalanHak==0){
                Intent intent = new Intent(this, kaybettiniz.class);
                finish();
                startActivity(intent);
            }
        }

         if(editText.getText().length()==0) {

            Toast.makeText(getApplicationContext(),"Lütfen sayı giriniz",Toast.LENGTH_LONG).show();
        }

    }
}
