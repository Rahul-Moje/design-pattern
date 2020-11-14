public class TestAbstractFactoryPattern {

    public static void main(String[] args) {
        Computer pc = ComputerFactoryAbstractPattern.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server =ComputerFactoryAbstractPattern.getComputer(new ServerFactoryForAbstract("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}
