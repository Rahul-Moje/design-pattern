public class StaticBlockInitialisationSingleton {

    private static StaticBlockInitialisationSingleton MY_INSTANCE;

    private StaticBlockInitialisationSingleton(){

    }

    static {
        try {
            MY_INSTANCE = new StaticBlockInitialisationSingleton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static StaticBlockInitialisationSingleton getStaticBlockInstance() {
        return MY_INSTANCE;
    }
}
