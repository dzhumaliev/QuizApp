package com.example.quizapp.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class MainViewModel extends ViewModel {

    public MutableLiveData<String> message = new MutableLiveData<>();

    public MainViewModel(){


        message.setValue("First");
        message.setValue("First1");
        message.setValue("First2");
        message.setValue("First3");


//        message.postValue("");
    }

    public void onLoginClick(){

    }

}
