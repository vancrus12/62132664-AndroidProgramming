package ntu.lebavan.bth7_listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> dsTinhThanh;
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
    }

}