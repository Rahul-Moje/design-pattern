import java.io.*;

public class SerializationDestroySingleton {

    public static void main(String[] args) {
        SerializedSingleton instance1 = SerializedSingleton.getMyInstance();
        SerializedSingleton instance2;

        try {
            ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("C:\\Temp\\file.ser"));
            objectOutput.writeObject(instance1);
            objectOutput.close();

            ObjectInput objectInput = new ObjectInputStream(new FileInputStream("C:\\Temp\\file.ser"));
            instance2 = (SerializedSingleton) objectInput.readObject();
            System.out.println("Is instance one equal to instance two ? " + (instance1 == instance2));
            System.out.println(instance1.hashCode());
            System.out.println(instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
