package com.xpf.android.pure.ui.playlistdetail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.xpf.android.pure.constant.Status;
import com.xpf.android.pure.data.Result;
import com.xpf.android.pure.data.model.PlayListDetail;
import com.xpf.android.pure.data.repository.RemoteRepository;
import com.xpf.android.pure.data.source.RemoteDataSource;

import java.util.List;

public class PlayListDetailViewModel extends ViewModel {

    private MutableLiveData<List<PlayListDetail.PlaylistBean.TracksBean>> playListDetailResult
            = new MutableLiveData<>();
    private RemoteRepository remoteRepository;

    public PlayListDetailViewModel() {
        remoteRepository = RemoteRepository.getInstance(new RemoteDataSource());
    }

    public LiveData<List<PlayListDetail.PlaylistBean.TracksBean>> getPlayListDetailResult() {
        return playListDetailResult;
    }

    public void getPlayListDetail(String id) {
        remoteRepository.getPlayListDetail(id, result -> {
            if (result instanceof Result.Success) {
                PlayListDetail playListDetail = ((Result.Success<PlayListDetail>) result).getData();
                Integer code = playListDetail.getCode();
                if (Status.isSuccess(String.valueOf(code))) {
                    PlayListDetail.PlaylistBean playlistBean = playListDetail.getPlaylist();
                    List<PlayListDetail.PlaylistBean.TracksBean> tracks = playlistBean.getTracks();
                    playListDetailResult.postValue(tracks);
                } else {
                    playListDetailResult.postValue(null);
                }
            } else {
                playListDetailResult.postValue(null);
            }
        });
    }
}