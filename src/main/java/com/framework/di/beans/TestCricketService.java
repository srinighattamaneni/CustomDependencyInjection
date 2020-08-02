package com.framework.di.beans;

import com.framework.di.factory.AutoInject;

public class TestCricketService {

    @AutoInject
    private TestCricketDao testCricketDao;
    public String getRules(){


        return testCricketDao.getRules();
    }

    public String getBallColor(){


        return "RED Color Ball";
    }
}
