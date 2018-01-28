package conuhacks3.helpmylineup;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class WhosHot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whos_hot);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu_myTeam:
                                startActivity(new Intent(WhosHot.this, Home.class));
                                break;
                            case R.id.menu_leaders:
                                startActivity(new Intent(WhosHot.this, LeadersActivity.class));
                                break;
                            case R.id.menu_whosHot:
                                break;
                            case R.id.menu_settings:
                                startActivity(new Intent(WhosHot.this, SettingsActivity.class));
                                break;
                        }
                        return true;
                    }
                });
    }
}
