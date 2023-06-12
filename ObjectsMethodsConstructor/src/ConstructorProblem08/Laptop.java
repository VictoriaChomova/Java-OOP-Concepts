package ConstructorProblem08;

public class Laptop {
    private int ram;
    private int cpuClock;
    private String cpuModel;
    private String gpuModel;

    public Laptop() {

    }
    public Laptop(int ram, int cpuClock, String cpuModel, String gpuModel) {
        this.ram = ram;
        this.cpuClock = cpuClock;
        this.cpuModel = cpuModel;
        this.gpuModel = gpuModel;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCpuClock() {
        return cpuClock;
    }

    public void setCpuClock(int cpuClock) {
        this.cpuClock = cpuClock;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }

    public static boolean isBetter(Laptop first, Laptop second) {
        if (first.getRam() > second.getRam()) {
            return true;
        } else if (first.getRam() == second.getRam()) {
            return first.getCpuClock() > second.getCpuClock();
        } else {
            return false;
        }
    }
}
