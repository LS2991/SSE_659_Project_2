package TheBuilderPattern;

public class PCPartsList {
	Part motherboard;
	Part cpu;
	Part cpuFan;
	Part powerSupply;
	Part gpu;
	Part hardDrive;
	Part cdDrive;
	Part monitor;
	Part partsCase;
	Part[] list = new Part[9];

	public PCPartsList(Part motherboard, Part cpu, Part cpuFan, Part powerSupply, Part gpu, Part hardDrive, Part cdDrive, Part monitor, Part partsCase) {
		this.motherboard = motherboard;
		this.cpu = cpu;
		this.cpuFan = cpuFan;
		this.powerSupply = powerSupply;
		this.gpu = gpu;
		this.hardDrive = hardDrive;
		this.cdDrive = cdDrive;
		this.monitor = monitor;
		this.partsCase = partsCase;
		
		list[0] = motherboard;
		list[1] = cpu;
		list[2] = cpuFan;
		list[3] = powerSupply;
		list[4] = gpu;
		list[5] = hardDrive;
		list[6] = cdDrive;
		list[7] = monitor;
		list[8] = partsCase;
	}
	
	public void printList() {
		for(int x = 0; x < list.length; x++) {
			System.out.println(list[x].toString());
		}
	}
	
	public void printTotal() {
		int total = 0;
		for(int x = 0; x < list.length; x++) {
			total += list[x].getPrice();
		}
		System.out.println("Total price is: " + total);
	}
	
	
}
