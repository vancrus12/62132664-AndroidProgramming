package ntu.lebavan.bth7_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTinhThanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dsTinhThanh = new ArrayList<String>();

        dsTinhThanh.add("Ha Noi");
        dsTinhThanh.add("TP.HCM");
        dsTinhThanh.add("Khanh Hoa");
        dsTinhThanh.add("Ninh Thuan");
        dsTinhThanh.add("Da Nang");
        dsTinhThanh.add("Dong Nai");
        dsTinhThanh.add("Quang Ninh");

        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsTinhThanh);

        ListView lvTenTinhThanh = findViewById(R.id.lvDSTT);
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);
    }
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String strTenTinhChon = dsTinhThanh.get(i);
            Toast.makeText(MainActivity.this, strTenTinhChon, Toast.LENGTH_LONG).show();
        }
    };
}