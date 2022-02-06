package gdsc.healthchecklist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class splash extends AppCompatActivity {

    private final int splash_TIME = 3000; //Splash view time

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplication(),MainActivity.class)); //splash activity run
                splash.this.finish();
            }
        },splash_TIME);
    }
    public void splash_trans(View view){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash_trans);
    }
}