# CustomDependencyInjection
Technologies used : Jav 1.8, Maven 4.0
 
IDE used : Intellij

1. "ObjectFactory" class is used to provide singleton or prototype beans based on the configuration.

2. The details of configuring a bean is as follows:

    a. Use "@AutoInject" or "@AutoInject(type= Scope.SINGLETON)" to create singleton beans.
    b. Use only "@AutoInject(type= Scope.PROTOTYPE)" to create prototype beans.
   
3. All the domain classes are placed in "com.framework.di.beans" package and DI mechanism classes are placed in "com.framework.di.factory"

4. For the purpose of demonstration i have come up with providing rules of three formats in cricket




