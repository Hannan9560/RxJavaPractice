package com.betechme.rxjavapractice.repositories;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.LiveDataReactiveStreams;
import com.betechme.rxjavapractice.requests.ServiceGenerator;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

public class Repository {

    private static Repository instance;

    public static  Repository getInstance(){
        if(instance == null){
            instance = new Repository();
        }
        return instance;
    }

    public LiveData<ResponseBody> makeReactiveQuery(){
        return LiveDataReactiveStreams.fromPublisher(ServiceGenerator.getRequestApi()
        .makeQuery()
        .subscribeOn(Schedulers.io()));




    }



}
