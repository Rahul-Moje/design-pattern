public class ThreadSafeSingleton {

    private static ThreadSafeSingleton MY_INSTANCE;

    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getSingleton() {
        if (MY_INSTANCE == null)
            MY_INSTANCE = new ThreadSafeSingleton();
        return MY_INSTANCE;
    }
}
