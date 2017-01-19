/**
 * Copyright(c) 2017-2016 by Puhuifinance Inc.
 * All Rights Reserved
 */
package com.caoming.singleton;

/**
 * 懒汉式二：线程不安全
 *
 * @author caoming
 */
public class SingletonUnSafety {

    private SingletonUnSafety() {

    }

    private static SingletonUnSafety singletonUnSafety;

    public static SingletonUnSafety getInstance() {
        if (null == singletonUnSafety) {
            singletonUnSafety = new SingletonUnSafety();
        }

        return singletonUnSafety;
    }
}
