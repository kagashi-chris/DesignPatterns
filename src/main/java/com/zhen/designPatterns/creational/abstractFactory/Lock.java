package com.zhen.designPatterns.creational.abstractFactory;

public abstract class Lock {

    public abstract void acceptKey(Key key);
    public abstract void turnKey();
    public abstract boolean isLocked();
    public abstract char getLockAndKeySetType();
}
