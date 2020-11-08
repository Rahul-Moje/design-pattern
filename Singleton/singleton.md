Design Category - Creational
Ensures that only one instance of the class exists
Used in java runtime class
Types of Singleton
1. Eager Initialisation - instance created during class loading.
Drawback - instance created but do we really need it ? it may or may not be used
2. Static Block - instance of directly creating new instance, we do it within a static block
Advantages - can handle exceptions
Drawback - still instance created during class loading

3. Lazy Initialisation - Instance is created when we call the method to get singleton
Advantages - instance will be created if and only if we need it
Drawback - will fail if used in a multithreaded environment. Chances are two threads might simultaneously
call the get singleton method and two different instances would be created

4. Thread Safe - We add the synchronised keyword to the method of getting singleton
This will ensure that even if multiple threads are calling, only one would go inside the method and manipulate
the remaining threads would wait and after the first one finishes, the remaining ones won't create new instances again
Drawback - performance is affected, because we are using synchronisation

5. Double locking thread safe - So to improve performance we used synchronised block only if instance is null
Advantages - improves performance
we need to make reference of the created instance volatile so that it always reads from memory and not from caches

How to destroy singleton patterns - 
1. Using reflection - Get all constructors using getdeclaredconstructors
Now set accessible to true. Create new instance using those constructors. We can have multiple instances and have broken the singleton patter
To avoid this use Enum Singleton

2. Using serialization - There are cases where singleton classes need to be serializable.
When we deserialise them, we get new instance, thus breaking the singleton pattern
To overcome this, just override the method readResolve to get the existing instance

