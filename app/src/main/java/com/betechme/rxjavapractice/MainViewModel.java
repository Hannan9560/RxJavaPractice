package com.betechme.rxjavapractice;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.betechme.rxjavapractice.repositories.Repository;

import okhttp3.ResponseBody;

public class MainViewModel extends ViewModel {

    private Repository repository;

    public MainViewModel(){
        repository = Repository.getInstance();
    }

    public LiveData<ResponseBody> makeQuery(){
        return repository.makeReactiveQuery();
    }


}
