package conuhacks3.helpmylineup;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

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

}
