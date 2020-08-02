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
public class T20Cricket {

    @AutoInject
    private T20CricketService t20CricketSerivce;
    public String getRules(){

        return t20CricketSerivce.getRules();

    }

    public T20CricketService getT20CricketSerivce() {
        return t20CricketSerivce;
    }
}
