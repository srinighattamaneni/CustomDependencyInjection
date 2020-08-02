package com.framework.di.beans;

import com.framework.di.factory.AutoInject;
import com.framework.di.factory.Scope;
/*
 * Copyright (c) 2020.
 * @author Srinivas
 * @version 1.0
 * @since 02-Aug-20
 *
 * <pre>
 * Revision History:
 * Version      Date                     Author            Changes
 * -----------------------------------------------------------------------------
 * 1.0         02-Aug-20                   Srinivas  		   Initial coding
 *
 * </pre>
 */
public class TestCricket {



    @AutoInject(type= Scope.PROTOTYPE)
    private TestCricketService testCricketService;
    @AutoInject(type=Scope.PROTOTYPE)
    private TestCricketUtility testCricketUtility;

    public String getRules(){

        return testCricketService.getRules();

    }

    public String getBallColor(){


        return testCricketUtility.getBallColor();
    }

    public TestCricketUtility getTestCricketUtility() {
        return testCricketUtility;
    }

    public TestCricketService getTestCricketService() {
        return testCricketService;
    }
}
