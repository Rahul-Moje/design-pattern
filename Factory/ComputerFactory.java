public class ComputerFactory extends BaseFactoryClass{

    private String ram;
    private String hdd;
    private String cpu;


    public ComputerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }


    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.cpu;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
