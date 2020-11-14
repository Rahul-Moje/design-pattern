public class ComputerFactoryAbstractPattern {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
