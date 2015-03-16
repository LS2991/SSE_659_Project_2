package TheBuilderPattern;

public class PCBuilder {
	Part motherboard = new Part();
	Part cpu = new Part();
	Part cpuFan = new Part();
	Part powerSupply = new Part();
	Part gpu = new Part();
	Part hardDrive = new Part();
	Part cdDrive = new Part();
	Part monitor = new Part();
	Part partsCase = new Part();
	
	public PCBuilder(){}
	
	public PCBuilder setMotherboard(String name, int price) {
		motherboard = new Part(name, price);
		return this;
	}
	
	public PCBuilder setCpu(String name, int price) {
		cpu = new Part(name, price);
		return this;
	}
	
	public PCBuilder setCpuFan(String name, int price) {
		cpuFan = new Part(name, price);
		return this;
	}
	
	public PCBuilder setPowerSupply(String name, int price) {
		powerSupply = new Part(name, price);
		return this;
	}
	
	public PCBuilder setGpu(String name, int price) {
		gpu = new Part(name, price);
		return this;
	}
	
	public PCBuilder setHardDrive(String name, int price) {
		hardDrive = new Part(name, price);
		return this;
	}
	
	public PCBuilder setCdDrive(String name, int price) {
		cdDrive = new Part(name, price);
		return this;
	}
	
	public PCBuilder setMonitor(String name, int price) {
		monitor = new Part(name, price);
		return this;
	}
	
	public PCBuilder setPartsCase(String name, int price) {
		partsCase = new Part(name, price);
		return this;
	}
	
	public Part getMotherboard() {
		return motherboard;
	}
	
	public Part getCpu() {
		return cpu;
	}
	
	public Part getCpuFan() {
		return cpuFan;
	}
	
	public Part getPowerSupply() {
		return powerSupply;
	}
	
	public Part getGpu() {
		return gpu;
	}
	
	public Part getHardDrive() {
		return hardDrive;
	}
	
	public Part getCdDrive() {
		return cdDrive;
	}
	
	public Part getMonitor() {
		return monitor;
	}
	
	public Part getPartsCase() {
		return partsCase;
	}
	
	public PCPartsList buildPC() {
		return new PCPartsList(motherboard, cpu, cpuFan, powerSupply, gpu, hardDrive, cdDrive, monitor, partsCase);
	}
}

