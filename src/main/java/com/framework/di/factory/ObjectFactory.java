package com.framework.di.factory;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

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
public class ObjectFactory {


    private static org.apache.log4j.Logger log =  org.apache.log4j.Logger.getLogger(ObjectFactory.class);
    public static Map<Class,Object> objectPool = new HashMap<Class,Object>();

    /**
     *
     * @param beanName
     * @param <T>
     * @return its returns required bean of type T
     */
    public static <T> T getObject(Class<T> beanName){

        if(objectPool.containsKey(beanName)){
            log.info(String.format("Bean %s exists in the Object pool ", beanName));
            return (T)objectPool.get(beanName);
        }
        T mainObj = null;
        try {
            mainObj = (T)beanName.newInstance();
        for (Field field : mainObj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(AutoInject.class)) {

                field.setAccessible(true);

                Object innerObject =  field.getType().newInstance();
                if(field.getAnnotation(AutoInject.class).type().equals(Scope.SINGLETON))
                {
                    objectPool.put(beanName,(Object)mainObj);
                }
                field.set(mainObj,getObject(innerObject.getClass()));

            }
        }

        }
       catch (IllegalAccessException iae){

            log.error(iae);
        }
        catch (InstantiationException ie){
            log.error(ie);

        }

        return mainObj;
    }
}
