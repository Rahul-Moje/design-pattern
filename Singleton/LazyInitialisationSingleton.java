public class LazyInitialisationSingleton {

    private static LazyInitialisationSingleton MY_INSTANCE;

    private LazyInitialisationSingleton() {

    }

    public static LazyInitialisationSingleton getSingleton() {
        if (MY_INSTANCE == null)
            MY_INSTANCE = new LazyInitialisationSingleton();
        return MY_INSTANCE;
    }
}
