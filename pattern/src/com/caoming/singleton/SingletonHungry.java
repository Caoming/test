/**
 * Copyright(c) 2017-2016 by Puhuifinance Inc.
 * All Rights Reserved
 */
package com.caoming.singleton;

/**
 * 饿汉式
 *
 * @author caoming
 */
public class SingletonHungry {

    private SingletonHungry() {

    }

    /**
     * 类加载器加载的时候就进行加载
     */
    private static SingletonHungry singleton = new SingletonHungry();

    public static SingletonHungry getInstance() {
        return singleton;
    }
}
