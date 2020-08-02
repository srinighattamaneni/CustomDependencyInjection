package com.framework.di.beans;

import com.framework.di.factory.AutoInject;

public class TestCricketDao {


    @AutoInject
    private TestCricketDao1 testCricketDao1;
    public String getRules(){


        return testCricketDao1.getRules();
    }
}
