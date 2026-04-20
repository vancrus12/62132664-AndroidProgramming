package thigk2.lebavan.baithigk2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNav  = findViewById(R.id.bottomNavigationView);
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                int itemId = item.getItemId();
                if (itemId == R.id.navigation_chucnang1) {
                    selectedFragment = new ChucNang1();
                } else if (itemId == R.id.navigation_chucnang2) {
                    selectedFragment = new ChucNang2();
                } else if (itemId == R.id.navigation_chucnang3) {
                    selectedFragment = new ChucNang3();
                } else if (itemId == R.id.navigation_chucnang4) {
                    selectedFragment = new ChucNang4();
                    // It will help to replace the
                    // one fragment to other.
                    if (selectedFragment != null) {
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentSpace, selectedFragment).commit();
                    }
                    return true;
                }
            });
        }
    }