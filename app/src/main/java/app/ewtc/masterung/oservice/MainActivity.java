package app.ewtc.masterung.oservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add Fragment to Activity
        if (savedInstanceState == null) {
            MainFragment mainFragment = new MainFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.mainContent, mainFragment)
                    .commit();
        }


    }   // Main Method

}   // Main Class
