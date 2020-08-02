package com.framework.di;

import com.framework.di.beans.OdiCricket;
import com.framework.di.beans.T20Cricket;
import com.framework.di.beans.TestCricket;
import com.framework.di.factory.ObjectFactory;
import org.junit.Assert;
import org.junit.Test;
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
public class DITestingTest {


    @Test
    public void testBeanInjection(){

        T20Cricket cricket =  (T20Cricket) ObjectFactory.getObject(T20Cricket.class);
        Assert.assertNotNull(cricket.getT20CricketSerivce());
    }

    @Test
    public void testSingletonOdi(){

        OdiCricket cricket =  (OdiCricket) ObjectFactory.getObject(OdiCricket.class);
        OdiCricket cricket2 =  (OdiCricket) ObjectFactory.getObject(OdiCricket.class);

        Assert.assertTrue(cricket.getOdiCricketSerivce()==cricket2.getOdiCricketSerivce());
    }

    @Test
    public void testPrototypeTest(){

        TestCricket cricket =  (TestCricket) ObjectFactory.getObject(TestCricket.class);
        TestCricket cricket2 =  (TestCricket) ObjectFactory.getObject(TestCricket.class);

        Assert.assertTrue(cricket.getTestCricketService()!=cricket2.getTestCricketService());
    }

    @Test
    public void testPrototypeT20(){

        T20Cricket cricket =  (T20Cricket) ObjectFactory.getObject(T20Cricket.class);
        T20Cricket cricket2 =  (T20Cricket) ObjectFactory.getObject(T20Cricket.class);

        Assert.assertFalse(cricket.getT20CricketSerivce()!=cricket2.getT20CricketSerivce());
    }
}
