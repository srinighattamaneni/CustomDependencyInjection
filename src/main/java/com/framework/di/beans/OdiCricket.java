package com.framework.di.beans;

import com.framework.di.factory.AutoInject;

public class OdiCricket {

    @AutoInject
    private OdiCricketService odiCricketSerivce;
    @AutoInject
    private OdiCricketUtility odiCricketUtility;

    public String getRules(){

        return odiCricketSerivce.getRules();

    }

    public String getBallColor(){


        return odiCricketUtility.getBallColor();
    }
}
