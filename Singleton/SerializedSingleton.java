import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static SerializedSingleton MY_INSTANCE;

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton() {

    }

    public static SerializedSingleton getMyInstance() {
        if(MY_INSTANCE == null)
            MY_INSTANCE = new SerializedSingleton();
        return MY_INSTANCE;
    }

    //Uncomment this to avoid destroying singleton pattern using serialization
    /*protected Object readResolve() {
        return getMyInstance();
    }*/


}
