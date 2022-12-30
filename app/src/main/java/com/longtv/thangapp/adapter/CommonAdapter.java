package com.longtv.thangapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.longtv.thangapp.R;
import com.longtv.thangapp.utils.CompatibilityUtils;
import com.longtv.thangapp.utils.ImageUtils;

import java.util.List;

public class CommonAdapter extends RecyclerView.Adapter<CommonAdapter.ViewHolder> {
    private Context context;
    private List<String> data;

    public CommonAdapter(Context context, List<String> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rcy, parent, false);
        int width = CompatibilityUtils.getWidthContentItem(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(300, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(layoutParams);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // position la vi tri cua phan tu trong mang du lieu ---- vd:
        String s = data.get(position);
        ImageUtils.loadImageCorner(context, holder.ivAvt, "https://taimienphi.vn/tmp/cf/aut/anh-gai-xinh-1.jpg");
        holder.tvName.setText(s);
    }

    @Override
    public int getItemCount() {
        if (data != null) {
            return data.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView ivAvt;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            ivAvt = itemView.findViewById(R.id.iv_avatar);
        }
    }
}
