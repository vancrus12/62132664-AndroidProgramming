package thigk2.lebavan.baithigk2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ChucNang3 extends Fragment {
    // Khai báo các biến cần thiêt

    //1. Khai báo các biến toàn cục
    DanhNhanAdapter adapter;
    ArrayList<DanhNhan> list;
    //2. Khai báo các biến đại diện cho các view cần tương tác
    RecyclerView recyclerViewDanhNhan;



    public ChucNang3() {
        // Required empty public constructor
    }

    public static ChucNang3 newInstance(String param1, String param2) {
        ChucNang3 fragment = new ChucNang3();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //3. Chuẩn bị dữ liệu cho list
        list = new ArrayList<DanhNhan>();
        list.add(new DanhNhan("Cột cờ Hà Nội", "hanoi_flag_tower"));
        list.add(new DanhNhan("Tháp Eiffel", "eiffel_tower"));
        list.add(new DanhNhan("Cung điện Buckingham", "buckingham_palace"));
        list.add(new DanhNhan("Tượng nữ thần tự do", "nu_than_tu_do"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau3 =inflater.inflate(R.layout.fragment_chuc_nang3, container, false);
        //4. Tìm điều khiển Recycler
        recyclerViewDanhNhan=  viewCau3.findViewById(R.id.ryCau3);

        //5. Tạo layout manager để đặt bố cục cho Recycler
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewCau3.getContext());
        recyclerViewDanhNhan.setLayoutManager(layoutLinear);

        //6. Tạo adapter gắn vào nguồn dữ liệu
        adapter = new DanhNhanAdapter(viewCau3.getContext(), list);
        //7, Gắn adapter vào Recycler
        recyclerViewDanhNhan.setAdapter(adapter);

        return viewCau3;
    }
}