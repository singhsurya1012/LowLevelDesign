package design.pattern.creational.singleton;

public class SingletonInnerClass {

    private SingletonInnerClass(){

    }

    //This class is not loaded until the getInstance method is called
    private static class Singleton {
        private static final SingletonInnerClass instance = new SingletonInnerClass();
    }

    public static SingletonInnerClass  getInstance(){
        return Singleton.instance;
    }
}
