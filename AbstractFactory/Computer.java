public abstract class Computer {

    public abstract String getRam();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString() {
        return "Ram = " + this.getRam() + ", HDD = " + this.getHDD() + " and CPU =  " + this.getCPU();
    }
}
