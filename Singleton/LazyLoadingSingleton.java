package Singleton;

public class LazyLoadingSingleton {

    private static LazyLoadingSingleton singletonObj;

    //Lazy way of creating a object
    public static LazyLoadingSingleton getInstance(){
        if(singletonObj == null){
            return new LazyLoadingSingleton();
        }
        return  singletonObj;
    }

}
