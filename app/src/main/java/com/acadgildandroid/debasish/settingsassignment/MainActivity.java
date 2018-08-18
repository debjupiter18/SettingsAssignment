package com.acadgildandroid.debasish.settingsassignment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment preference=new SettingScreen();
        FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
        if(savedInstanceState==null){
            fragmentTransaction.add(R.id.relative_layout,preference,"settings_screen");
            fragmentTransaction.commit();
        }
        else{

            preference=getFragmentManager().findFragmentByTag("settings_screen");
        }


    }
    public static class SettingScreen extends PreferenceFragment{

        @Override
        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.settings_screen);

        }
    }
}
