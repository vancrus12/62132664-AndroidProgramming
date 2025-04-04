package thigk2.lebavan.thigiuaky_lebavan_62132664;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button nutCn2;
    Button nutCn3;
    Button nutCn4;
    Button nutAbM;
    void TimDieuKhien(){
        nutCn2 = (Button) findViewById(R.id.btnCn2);
        nutCn3 = (Button) findViewById(R.id.btnCn3);
        nutCn4 = (Button) findViewById(R.id.btnCn4);
        nutAbM = (Button) findViewById(R.id.btnAbM);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        nutCn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCn2 = new Intent(MainActivity.this, ActivityCN2.class);
                startActivity(intentCn2);
            }
        });
        nutCn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCn3 = new Intent(MainActivity.this, ActivityCN3.class);
                startActivity(intentCn3);
            }
        });
        nutCn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCn4 = new Intent(MainActivity.this, ActivityCN4.class);
                startActivity(intentCn4);
            }
        });
        nutAbM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAbM = new Intent(MainActivity.this, ActivityAboutMe.class);
                startActivity(intentAbM);
            }
        });
    }
}