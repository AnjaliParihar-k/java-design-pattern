package Singleton;

public class EagerLoadingSingleton {

    private static EagerLoadingSingleton singletonObj = new EagerLoadingSingleton();
    private EagerLoadingSingleton(){

    }

    public static EagerLoadingSingleton getInstance(){
        return singletonObj;
    }
}
