package conuhacks3.helpmylineup;

import android.content.Intent;
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;


public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu_myTeam:
                                break;
                            case R.id.menu_leaders:
                                startActivity(new Intent(Home.this, LeadersActivity.class));
                                finish();
                                break;
                            case R.id.menu_whosHot:
                                startActivity(new Intent(Home.this, WhosHot.class));
                                finish();
                                break;
                            case R.id.menu_settings:
                                startActivity(new Intent(Home.this, SettingsActivity.class));
                                finish();
                                break;
                        }
                        return true;
                    }
                });

    }

    public void updateTeam(View view)
    {
        ArrayList<String> players = new ArrayList();

        EditText nameField = (EditText) findViewById(R.id.Player1);
        players.add(nameField.getText().toString());
        nameField = (EditText) findViewById(R.id.Player2);
        players.add(nameField.getText().toString());
        nameField = (EditText) findViewById(R.id.Player3);
        players.add(nameField.getText().toString());
        nameField = (EditText) findViewById(R.id.Player4);
        players.add(nameField.getText().toString());
        nameField = (EditText) findViewById(R.id.Player5);
        players.add(nameField.getText().toString());
        nameField = (EditText) findViewById(R.id.Player6);
        players.add(nameField.getText().toString());
        nameField = (EditText) findViewById(R.id.Player7);
        players.add(nameField.getText().toString());
        nameField = (EditText) findViewById(R.id.Player8);
        players.add(nameField.getText().toString());
        nameField = (EditText) findViewById(R.id.Player9);
        players.add(nameField.getText().toString());
        nameField = (EditText) findViewById(R.id.Player10);
        players.add(nameField.getText().toString());
        nameField = (EditText) findViewById(R.id.Player11);
        players.add(nameField.getText().toString());
        nameField = (EditText) findViewById(R.id.Player12);
        players.add(nameField.getText().toString());
    }
}
