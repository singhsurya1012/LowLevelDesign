package design.pattern.creational.singleton;


public enum SingletonEnum {

    //Enum has constructor which can only be instantiated by jvm hence is resolves the issue of reflection
    INSTANCE;
}
