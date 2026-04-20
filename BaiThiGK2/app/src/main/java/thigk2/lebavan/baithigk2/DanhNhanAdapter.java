package thigk2.lebavan.baithigk2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

    public class DanhNhanAdapter extends RecyclerView.Adapter<DanhNhanAdapter.DanhNhanViewHolder> {

        Context context;

        ArrayList<DanhNhan> datas;

        public DanhNhanAdapter(Context _context, ArrayList<DanhNhan> _datas) {
            this.context = _context;
            this.datas = _datas;
        }

        @NonNull
        @Override
        public DanhNhanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View viewItem = layoutInflater.inflate(R.layout.danhnhan_layout, parent, false);
            DanhNhanViewHolder viewHolder = new DanhNhanViewHolder(viewItem);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull DanhNhanViewHolder holder, int position) {
            //Lấy phần tử ở vị trí position của nguồn dữ liệu
            DanhNhan danhNhan = datas.get(position);

            //Đặt vào các thuộc tính hiển thị của view con
            //Đặt tên
            holder.danhnhanCaption.setText(danhNhan.getTenDanhNhan());
            //Đặt ảnh
            String packageName = holder.itemView.getContext().getPackageName();
            //Lấy id ảnh thông qua tên
            String nameFile = danhNhan.getTenDanhNhan();
            int imageID = holder.itemView.getResources().getIdentifier(nameFile, "mipmap", packageName);
            holder.danhnhanImage.setImageResource(imageID);
        }

        @Override
        public int getItemCount() {
            return datas.size();
        }

        final class DanhNhanViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
            TextView danhnhanCaption;
            ImageView danhnhanImage;

            public DanhNhanViewHolder(@NonNull View itemView) {
                super(itemView);
                itemView.setOnClickListener(this);
                danhnhanImage = itemView.findViewById(R.id.ivLandScape);
                danhnhanCaption = itemView.findViewById(R.id.tvCaption);
            }

            @Override
            public void onClick(View v) {
                //Lấy vị trí item được click thông qua phương thức getAdapterPosition()
                int clickedPosition = getAdapterPosition();
                //Lấy dữ liệu tương ứng từ danh sách (theo vị trí)
                DanhNhan danhNhan = datas.get(clickedPosition);
                //Hiện thông báo hoặc các sự kiện khác
                Toast.makeText(v.getContext(), "Bạn đã lựa chọn: " + danhNhan.getTenDanhNhan(), Toast.LENGTH_SHORT).show();
            }
        }
    }
