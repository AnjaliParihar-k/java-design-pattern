package Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println("Using Lazy way of Singleton "+ LazyLoadingSingleton.getInstance().getClass().hashCode());
        System.out.println("Using Lazy way of Singleton "+LazyLoadingSingleton.getInstance().getClass().hashCode());

        System.out.println("Using Eager way of Singleton " +EagerLoadingSingleton.getInstance().getClass().hashCode());
        System.out.println("Using Eager way of Singleton " +EagerLoadingSingleton.getInstance().getClass().hashCode());
    }
}
