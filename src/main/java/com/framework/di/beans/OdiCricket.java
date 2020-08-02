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

    public OdiCricketService getOdiCricketSerivce() {
        return odiCricketSerivce;
    }

    public OdiCricketUtility getOdiCricketUtility() {
        return odiCricketUtility;
    }
}
