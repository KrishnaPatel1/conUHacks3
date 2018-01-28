package conuhacks3.helpmylineup;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class LeadersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaders);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu_myTeam:
                                startActivity(new Intent(LeadersActivity.this, Home.class));
                                break;
                            case R.id.menu_leaders:
                                break;
                            case R.id.menu_whosHot:
                                startActivity(new Intent(LeadersActivity.this, WhosHot.class));
                                break;
                            case R.id.menu_settings:
                                startActivity(new Intent(LeadersActivity.this, SettingsActivity.class));
                                break;
                        }
                        return true;
                    }
                });
    }
}
