package com.framework.di.beans;

import com.framework.di.factory.AutoInject;
import com.framework.di.factory.Scope;

public class TestCricket {

    public TestCricketService getTestCricketService() {
        return testCricketService;
    }

    public void setTestCricketService(TestCricketService testCricketService) {
        this.testCricketService = testCricketService;
    }

    @AutoInject(type= Scope.PROTOTYPE)
    private TestCricketService testCricketService;
    @AutoInject(type=Scope.PROTOTYPE)
    private TestCricketUtility testCricketUtility;

    public String getRules(){

        return testCricketService.getRules();

        //return "Test cricket is played for 5 days, each days got 90 overs,no over limit per each bowler ";
    }

    public String getBallColor(){


        return testCricketUtility.getBallColor();
    }
}
