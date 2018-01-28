package conuhacks3.helpmylineup;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

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
                                System.out.println("hi");

                            case R.id.menu_whosHot:
                                System.out.println("hi");

                            case R.id.menu_settings:

                        }
                        return true;
                    }
                });
    }
}
