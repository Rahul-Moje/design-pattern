public class EagerInitialisationSingleton {

    private static final EagerInitialisationSingleton MY_INSTANCE = new EagerInitialisationSingleton();

    private EagerInitialisationSingleton() {
    }

    public static EagerInitialisationSingleton getEagerSingleton() {
        return MY_INSTANCE;
    }
}
