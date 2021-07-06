package design.pattern.creational.singleton;

import java.io.Serializable;

public class SingletonSerializable implements Serializable {

    private static SingletonSerializable instance = new SingletonSerializable();

    private SingletonSerializable(){
    }

    public static SingletonSerializable getInstance(){
        return instance;
    }

    protected Object readResolve(){
        return instance;
    }
}
