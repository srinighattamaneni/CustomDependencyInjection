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
public class TestCricketService {

    @AutoInject(type = Scope.PROTOTYPE)
    private TestCricketDao testCricketDao;
    public String getRules(){


        return testCricketDao.getRules();
    }


    public TestCricketDao getTestCricketDao() {
        return testCricketDao;
    }
}
