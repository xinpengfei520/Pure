package com.xpf.android.pure.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.xpf.android.pure.R;
import com.xpf.android.pure.constant.IntentExtra;
import com.xpf.android.pure.data.model.PlayListModel;
import com.xpf.android.pure.ui.playlistdetail.PlayListDetailActivity;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author x-sir :)
 * @date 2021/7/19
 */
public class HomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<PlayListModel.PlaylistBean> mList;
    private LayoutInflater mLayoutInflater;

    public HomeAdapter(Context context, List<PlayListModel.PlaylistBean> list) {
        this.mContext = context;
        this.mList = list;
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(mLayoutInflater.inflate(R.layout.item_play_list_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.setData(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivCover;
        private TextView tvName;
        private TextView tvCount;
        private ConstraintLayout itemLayout;
        private PlayListModel.PlaylistBean playlistBean;

        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            ivCover = itemView.findViewById(R.id.ivCover);
            tvName = itemView.findViewById(R.id.tvName);
            tvCount = itemView.findViewById(R.id.tvCount);
            itemLayout = itemView.findViewById(R.id.itemLayout);
            initListener();
        }

        private void initListener() {
            itemLayout.setOnClickListener(v -> {
                Long id = playlistBean.getId();
                try {
                    Intent intent = new Intent(mContext, PlayListDetailActivity.class);
                    intent.putExtra(IntentExtra.PLAY_LIST_ID, String.valueOf(id));
                    mContext.startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }

        public void setData(PlayListModel.PlaylistBean playlistBean) {
            this.playlistBean = playlistBean;
            String coverImgUrl = playlistBean.getCoverImgUrl();
            Glide.with(mContext).load(coverImgUrl).into(ivCover);
            tvName.setText(playlistBean.getName());
            tvCount.setText(playlistBean.getPlayCount() + "首");
        }
    }
}
