/**
 * Copyright(c) 2017-2016 by Puhuifinance Inc.
 * All Rights Reserved
 */
package com.caoming.singleton;

/**
 * 饿汉式，利用类加载器进行处理
 * 
 * @author caoming
 */
public class SingletonHungryStatic {

    private SingletonHungryStatic() {

    }

    private static SingletonHungryStatic singleton;

    static {
        singleton = new SingletonHungryStatic();
    }

    public static SingletonHungryStatic getInstance() {
        return singleton;
    }
}
