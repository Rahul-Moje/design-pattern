public class DoubleCheckedLockingSingleton {

    private volatile static DoubleCheckedLockingSingleton MY_INSTANCE;

    private DoubleCheckedLockingSingleton() {

    }

    public static DoubleCheckedLockingSingleton getMyInstance() {
        if (MY_INSTANCE == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (MY_INSTANCE == null)
                    MY_INSTANCE = new DoubleCheckedLockingSingleton();
            }
        }
        return MY_INSTANCE;
    }
}
