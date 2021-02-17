package com.example.vshare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

import com.example.vshare.Fragments.HomeFragment;
import com.genonbeta.android.framework.widget.PowerfulActionMode;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private HomeFragment mHomeFragment;
    private NavigationView mNavigationView;
    private DrawerLayout mDrawerLayout;
    private PowerfulActionMode mActionMode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mHomeFragment = (HomeFragment) getSupportFragmentManager().findFragmentById(R.id.activitiy_home_fragment);
        mActionMode = findViewById(R.id.content_powerful_action_mode);
        mNavigationView = findViewById(R.id.nav_view);
        mDrawerLayout = findViewById(R.id.drawer_layout);


    }
}