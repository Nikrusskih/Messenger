package com.example.messenger;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class ChatViewModelFactory implements ViewModelProvider.Factory {

    private String myUserId;
    private String otherUserId;

    public ChatViewModelFactory(String myUserId, String otherUserId) {
        this.myUserId = myUserId;
        this.otherUserId = otherUserId;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new ChatViewModel(myUserId,otherUserId);
    }
}
