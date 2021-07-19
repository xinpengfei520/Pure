package com.xpf.android.pure.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.xpf.android.pure.constant.Status;
import com.xpf.android.pure.data.Result;
import com.xpf.android.pure.data.model.PlayListModel;
import com.xpf.android.pure.data.repository.RemoteRepository;
import com.xpf.android.pure.data.source.RemoteDataSource;

import java.util.List;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<List<PlayListModel.PlaylistBean>> playListResult = new MutableLiveData<>();
    private RemoteRepository remoteRepository;

    public HomeViewModel() {
        remoteRepository = RemoteRepository.getInstance(new RemoteDataSource());
    }

    public LiveData<List<PlayListModel.PlaylistBean>> getPlayListResult() {
        return playListResult;
    }

    public void getPlayList() {
        remoteRepository.getPlayList(result -> {
            if (result instanceof Result.Success) {
                PlayListModel playListModel = ((Result.Success<PlayListModel>) result).getData();
                Integer code = playListModel.getCode();
                if (Status.isSuccess(String.valueOf(code))) {
                    List<PlayListModel.PlaylistBean> playlist = playListModel.getPlaylist();
                    playListResult.postValue(playlist);
                } else {
                    playListResult.postValue(null);
                }
            } else {
                playListResult.postValue(null);
            }
        });
    }
}