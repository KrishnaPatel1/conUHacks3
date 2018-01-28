package conuhacks3.helpmylineup;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import conuhacks3.helpmylineup.Backend.LeagueSettings;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu_myTeam:
                                startActivity(new Intent(SettingsActivity.this, Home.class));
                                break;
                            case R.id.menu_leaders:
                                startActivity(new Intent(SettingsActivity.this, LeadersActivity.class));
                                break;
                            case R.id.menu_whosHot:
                                startActivity(new Intent(SettingsActivity.this, WhosHot.class));
                                break;
                            case R.id.menu_settings:

                        }
                        return true;
                    }
                });
    }

    public void updateLeagueSettings(View view)
    {
        ArrayList<String> list = new ArrayList<>();

        EditText nameField = (EditText) findViewById(R.id.GOALS);
        list.add(nameField.getText().toString());

        nameField = (EditText) findViewById(R.id.ASSISTS);
            list.add(nameField.getText().toString());

        LeagueSettings.populateFields(list);

        TextView textView = (TextView) findViewById(R.id.CurrentStats);
        textView.setText(LeagueSettings.getData());
    }
}
