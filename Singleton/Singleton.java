public class Singleton {

    private static Singleton obj;

    // private constructor to force use of
    // getInstance() to create Singleton object
    private Singleton() {}

    public static Singleton getInstance()
    {
        if (obj==null)
            obj = new Singleton();
        return obj;
    }

}

class MyClass{
    public static void main(String args[]){
         System.out.println("Testing SingleTon class");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("Singleton s1 reference - " + s1);
        System.out.println("Singleton s2 reference - " + s2);
        System.out.println("s1 equals s2 ? " + s1.equals(s2));
    }
}
