A Singleton class in Java means: Only one object (instance) of the class is ever created.

That one object is shared across the whole application.
USE CASE
-- Database connections
-- Logging
-- Configuration managers

Issue in below two ways:
Lazy loading way:
-- Whenever we require object then only we will get an instance.
-- in multi threading environment, as threads work in concurrent way it will always create new object.
Below statement will run twice for 2 threads:
        if(singletonObj == null){
            return new LazyLoadingSingleton();
        }
Eager Way: Every time object will be created even if not used in application.

In multithreaded application, if we have thread safety concern then we have to use in synchronize way.
