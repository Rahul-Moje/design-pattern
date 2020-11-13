public class MachineFactory {

    public BaseFactoryClass createSystem(String type) {
        switch (type.toLowerCase()) {
            case "computer": return new ComputerFactory("8GB","500GB","I3");
            case "server" : return new ServerFactory("16GB","1TB","I5");
            default:break;
        }
        return null;
    }
}
