package com.framework.di.beans;

import com.framework.di.factory.AutoInject;

public class T20Cricket {

    @AutoInject
    private T20CricketService t20CricketSerivce;
    public String getRules(){

        return t20CricketSerivce.getRules();

    }
}
