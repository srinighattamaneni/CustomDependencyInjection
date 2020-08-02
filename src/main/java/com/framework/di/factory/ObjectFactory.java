package com.framework.di.factory;
import lombok.extern.log4j.Log4j;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
@Log4j
public class ObjectFactory {


    public static Map<Class,Object> objectPool = new HashMap<Class,Object>();
    public static <T> T getObject(Class<T> beanName){

        if(objectPool.containsKey(beanName)){
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
