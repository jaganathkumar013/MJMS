package moulana_jamali_matriculation_school.mjms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);

        Thread thread=new Thread(){
            @Override
            public void run() {
                try{
                   sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {

                    startActivity(new Intent(Splash_Activity.this,WebView.class));
                    finish();
                }
            }
        };thread.start();
    }
}
