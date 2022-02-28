package gdsc.healthchecklist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class navigation extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();

    private fragment_main fragment_main = new fragment_main();
    private fragment_search fragment_search = new fragment_search();
    private fragment_video fragment_video = new fragment_video();
    private fragment_setting fragment_setting = new fragment_setting();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        FragmentTransaction transaction = fragmentManager.beginTransaction();


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                switch (item.getItemId()){
                    case R.id.navigation_menu1:{

                    }
                    case R.id.navigation_menu2:{
                        transaction.replace(R.id.frame_layout, fragment_search).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_menu3:{
                        transaction.replace(R.id.frame_layout, fragment_video).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_menu4:{
                        transaction.replace(R.id.frame_layout, fragment_setting).commitAllowingStateLoss();
                        break;
                    }
                }
                return false;
            }
        });
    }
}