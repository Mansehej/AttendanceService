package com.mansehej.intellify.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.mansehej.intellify.model.classList;
import com.mansehej.intellify.networking.listCreator;


public class classViewModel extends ViewModel {

    private MutableLiveData<classList> mutableLiveData;
    private listCreator listCreator;

    public void init(){
        if (mutableLiveData != null){
            return;
        }
        listCreator = listCreator.getInstance();
        mutableLiveData = listCreator.getAtt("token=YOUR_TOKEN_HERE", 73, "AllClassAttendance");
    }

    public LiveData<classList> getListCreator() {
        return mutableLiveData;
    }

}
