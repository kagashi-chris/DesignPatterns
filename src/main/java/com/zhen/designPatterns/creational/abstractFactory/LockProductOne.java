package com.zhen.designPatterns.creational.abstractFactory;

public class LockProductOne extends Lock{

    private Key insertedKey;
    private boolean locked = true;
    private char lockAndKeySetType = '1';

    @Override
    public void acceptKey(Key key) {
        this.insertedKey = key;
    }

    public void turnKey()
    {
        if(insertedKey == null) System.out.println("no key here!");
        else
        {
            if(insertedKey.getLockAndKeySetType() == this.lockAndKeySetType)
            {
                locked = !locked;
            }
        }
    }

    public boolean isLocked() {
        return locked;
    }

    @Override
    public char getLockAndKeySetType() {
        return lockAndKeySetType;
    }
}
