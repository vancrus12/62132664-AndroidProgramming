package ntu.lebavan.bth2_apptinhtong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void XuLyCong(View view){
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        String strA = editTextSoA.getText().toString();
        String strB = editTextSoA.getText().toString();

        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        int tong = soA + soB;
        String strTong = String.valueOf(tong);

        editTextKetQua.setText(strTong);
    }
}