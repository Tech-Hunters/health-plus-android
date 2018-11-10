package com.testing.oeshi.healthplus_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FrameMetricsAggregator;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText("Health Tips");
                    Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_explore:
                    ExploreActivity ea = new ExploreActivity();
                    FragmentManager fm = getSupportFragmentManager();
                    fm.beginTransaction().replace(R.id.fragment, ea). commit();
                    return true;
                case R.id.navigation_contact:

                    return true;
                case R.id.navigation_notification:

                    return true;
                case R.id.navigation_setting:

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void HTSeeAll (View view){
        Intent intent = new Intent(this, HealthTipAllActivity.class);
        startActivity(intent);
    }

    public void DSeeAll (View view){
        Intent intent = new Intent(this, HealthTipAllActivity.class);
        startActivity(intent);
    }

    public void HSeeAll (View view){
        Intent intent = new Intent(this, HealthTipAllActivity.class);
        startActivity(intent);
    }
}
