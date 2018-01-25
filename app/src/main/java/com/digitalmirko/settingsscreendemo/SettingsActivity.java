package com.digitalmirko.settingsscreendemo;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {

    SwitchCompat switch_1, switch_2, switch_3, switch_4;

    boolean stateSwitch_1, stateSwitch_2, stateSwitch_3, stateSwitch_4;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        preferences = getSharedPreferences("PREFS", 0);
        stateSwitch_1 = preferences.getBoolean("switch1", false);
        stateSwitch_2 = preferences.getBoolean("switch2", false);
        stateSwitch_3 = preferences.getBoolean("switch3", false);
        stateSwitch_4 = preferences.getBoolean("switch4", false);

        switch_1 = (SwitchCompat) findViewById(R.id.switch_1);
        switch_2 = (SwitchCompat) findViewById(R.id.switch_2);
        switch_3 = (SwitchCompat) findViewById(R.id.switch_3);
        switch_4 = (SwitchCompat) findViewById(R.id.switch_4);

        switch_1.setChecked(stateSwitch_1);
        switch_2.setChecked(stateSwitch_2);
        switch_3.setChecked(stateSwitch_3);
        switch_4.setChecked(stateSwitch_4);

        switch_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stateSwitch_1 = !stateSwitch_1;
                switch_1.setChecked(stateSwitch_1);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("switch1", stateSwitch_1);
                editor.apply();
            }
        });

        switch_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stateSwitch_2 = !stateSwitch_2;
                switch_2.setChecked(stateSwitch_2);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("switch2", stateSwitch_2);
                editor.apply();
            }
        });

        switch_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stateSwitch_3 = !stateSwitch_3;
                switch_3.setChecked(stateSwitch_3);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("switch3", stateSwitch_3);
                editor.apply();
            }
        });

        switch_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stateSwitch_4 = !stateSwitch_4;
                switch_4.setChecked(stateSwitch_4);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("switch4", stateSwitch_4);
                editor.apply();
            }
        });
    }
}
