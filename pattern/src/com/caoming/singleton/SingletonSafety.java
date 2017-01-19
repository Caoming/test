/**
 * Copyright(c) 2017-2016 by Puhuifinance Inc.
 * All Rights Reserved
 */
package com.caoming.singleton;

/**
 * 懒汉式一：线程安全
 *
 * @author caoming
 */
public class SingletonSafety {

    private SingletonSafety() {

    }

    private static SingletonSafety singleton;

    /**
     * 支持多线程，但效率慢
     *
     * @return
     */
    public static synchronized SingletonSafety getInstance() {
        if (null == singleton) {
            singleton = new SingletonSafety();
        }

        return singleton;
    }

}
