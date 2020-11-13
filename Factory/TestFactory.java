import java.util.ArrayList;
import java.util.List;

public class TestFactory {
    public static void main(String[] args) {
        MachineFactory machineFactory = new MachineFactory();
        BaseFactoryClass computer = machineFactory.createSystem("computer");
        BaseFactoryClass server = machineFactory.createSystem("server");
        System.out.println(computer);
        System.out.println(server);
        System.out.println(4^1^1);
        List<String> myList = new ArrayList<>();
    }

}
