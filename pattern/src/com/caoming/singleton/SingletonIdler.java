/**
 * Copyright(c) 2017-2016 by Puhuifinance Inc.
 * All Rights Reserved
 */
package com.caoming.singleton;

/**
 * 懒汉式三
 *
 * @author caoming
 */
public class SingletonIdler {

    private SingletonIdler() {
    }

    private static class SingletonHolder {
        private static final SingletonIdler idler = new SingletonIdler();
    }

    public static SingletonIdler getInstance() {
        return SingletonHolder.idler;
    }
}
