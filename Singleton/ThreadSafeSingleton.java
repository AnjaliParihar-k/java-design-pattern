package Singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton singletonObj;

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton ThreadSafeSingleton(){
        if(singletonObj == null){
            synchronized (ThreadSafeSingleton.class){
                if(singletonObj == null){
                    return new ThreadSafeSingleton();
                }
            }
        }
        return singletonObj;
    }
}
