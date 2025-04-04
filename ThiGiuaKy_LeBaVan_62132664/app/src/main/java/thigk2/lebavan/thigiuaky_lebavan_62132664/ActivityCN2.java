package thigk2.lebavan.thigiuaky_lebavan_62132664;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityCN2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cn2);
        EditText edtNum1 = findViewById(R.id.editTextGK);
        EditText edtNum2 = findViewById(R.id.editTextCK);
        Button btnTB = findViewById(R.id.btnTinhTB);
        TextView tvResult = findViewById(R.id.txtKetQua);
        btnTB.setOnClickListener(v -> {
            try {
                double num1 = Double.parseDouble(edtNum1.getText().toString());
                double num2 = Double.parseDouble(edtNum2.getText().toString());
                double tb = (num1 + num2)/2;
                tvResult.setText("Diem TB: " + tb);
            } catch (NumberFormatException e) {
                tvResult.setText("Vui lòng nhập số hợp lệ!");
            }
        });
    }
}