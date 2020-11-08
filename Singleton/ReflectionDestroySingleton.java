import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionDestroySingleton {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        EagerInitialisationSingleton instance1 = EagerInitialisationSingleton.getEagerSingleton();
        EagerInitialisationSingleton instance2 = null;

        Constructor[] constructors = EagerInitialisationSingleton.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
        }
        instance2 = (EagerInitialisationSingleton)constructors[0].newInstance();
        System.out.println("Is instance one equal to instance two ? " + (instance1 == instance2));
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }
}
