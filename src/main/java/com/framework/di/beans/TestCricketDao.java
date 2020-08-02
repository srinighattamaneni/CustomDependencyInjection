package com.framework.di.beans;

import com.framework.di.factory.AutoInject;
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
public class TestCricketDao {


    @AutoInject
    private TestCricketDao1 testCricketDao1;
    public String getRules(){


        return testCricketDao1.getRules();
    }

    public TestCricketDao1 getTestCricketDao1() {
        return testCricketDao1;
    }
}
