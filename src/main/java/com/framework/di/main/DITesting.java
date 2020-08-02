package com.framework.di.main;

import com.framework.di.beans.OdiCricket;
import com.framework.di.beans.T20Cricket;
import com.framework.di.beans.TestCricket;
import com.framework.di.factory.ObjectFactory;
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
public class DITesting {
    public static void main(String[] args) {


        T20Cricket cricket =  (T20Cricket)ObjectFactory.getObject(T20Cricket.class);
        T20Cricket cricket1 = (T20Cricket) ObjectFactory.getObject(T20Cricket.class);
        System.out.println(cricket + "  "+ cricket1);
       // TestCricket testCricket = new TestCricket();
       // OdiCricket odiCricket = new OdiCricket();
        //T20Cricket t20Cricket = new T20Cricket();



        System.out.println("Cricket Rules------>"+cricket.getRules());
      // System.out.println("Ball Color------>"+cricket.getBallColor());

        // System.out.printf("Cricket Rules------>"+odiCricket.getRules());
       // System.out.printf("Cricket Rules------>"+t20Cricket.getRules());

    }


}
