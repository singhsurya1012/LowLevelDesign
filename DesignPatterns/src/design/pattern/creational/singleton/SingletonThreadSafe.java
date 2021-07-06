package design.pattern.creational.singleton;

import com.sun.scenario.animation.shared.SingleLoopClipEnvelope;

public class SingletonThreadSafe {

    private static SingletonThreadSafe instance;

    private  SingletonThreadSafe(){

    }

    public static SingletonThreadSafe getInstance(){

        if(null==instance){

            synchronized (SingletonThreadSafe.class){

                if(null==instance){
                    instance = new SingletonThreadSafe();
                }

            }
        }

        return instance;

    }
}
