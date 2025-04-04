package thigk2.lebavan.thigiuaky_lebavan_62132664;

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

public class ActivityCN3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cn3);
        ArrayList<String> nguonDuLieu = new ArrayList<String>();
        nguonDuLieu.add("Tin học đại cương");
        nguonDuLieu.add("Lập trình Java");
        nguonDuLieu.add("Phát triển ứng dụng web");
        nguonDuLieu.add("Khai phá dữ liệu lớn");
        ListView listViewBH = (ListView) findViewById(R.id.dsmonhoc);
        ArrayAdapter<String> baiHat_Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nguonDuLieu);
        listViewBH.setAdapter(baiHat_Adapter);

        listViewBH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = baiHat_Adapter.getItem(i);
                Toast.makeText(ActivityCN3.this, value, Toast.LENGTH_LONG).show();
            }
        });
    }
}