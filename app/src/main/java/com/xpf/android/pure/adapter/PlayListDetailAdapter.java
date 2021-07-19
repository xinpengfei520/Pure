package com.xpf.android.pure.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.xpf.android.pure.R;
import com.xpf.android.pure.data.model.PlayListDetail;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * PlayListDetailAdapter
 *
 * @author x-sir :)
 * @date 2021/7/19
 */
public class PlayListDetailAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<PlayListDetail.PlaylistBean.TracksBean> mList;
    private LayoutInflater mLayoutInflater;

    public PlayListDetailAdapter(Context context, List<PlayListDetail.PlaylistBean.TracksBean> list) {
        this.mContext = context;
        this.mList = list;
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(mLayoutInflater.inflate(R.layout.item_play_detail_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.setData(position, mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvIndex;
        private TextView tvSong;
        private TextView tvSinger;
        private ConstraintLayout itemLayout;

        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            tvIndex = itemView.findViewById(R.id.tvIndex);
            tvSong = itemView.findViewById(R.id.tvSong);
            tvSinger = itemView.findViewById(R.id.tvSinger);
            itemLayout = itemView.findViewById(R.id.itemLayout);
            initListener();
        }

        private void initListener() {
            itemLayout.setOnClickListener(v -> {

            });
        }

        public void setData(int position, PlayListDetail.PlaylistBean.TracksBean tracksBean) {
            tvIndex.setText(String.valueOf(position + 1));
            tvSong.setText(tracksBean.getName());
            String name = tracksBean.getAr().get(0).getName();
            tvSinger.setText(TextUtils.isEmpty(name) ? "未知" : name);
        }
    }
}
