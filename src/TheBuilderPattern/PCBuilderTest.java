package TheBuilderPattern;

import java.util.Scanner;


public class PCBuilderTest {

	public static void main(String[] args) {
		
		PCPartsList pcParts;
		PCBuilder builder = new PCBuilder();
		
		Scanner in = new Scanner(System.in);
		String input;
		boolean done = false;
		
		System.out.println("-----Welcome to the PC Parts List-----\n");
		System.out.println("Please enter the a command to start\n\n");
		
		while(!done) {
			System.out.println("1). Add Motherboard");
			System.out.println("2). Add CPU");
			System.out.println("3). Add CPU Fan");
			System.out.println("4). Add Power Supply");
			System.out.println("5). Add GPU");
			System.out.println("6). Add Hard Drive");
			System.out.println("7). Add CD Drive");
			System.out.println("8). Add Monitor");
			System.out.println("9). Add Parts Case");
			System.out.println("b). Build Computer");
			System.out.println("f). Finished");
			
			System.out.println("\nRunning Parts List:");
			System.out.println("Motherboard:  " + builder.getMotherboard().toString());
			System.out.println("CPU:          " + builder.getCpu().toString());
			System.out.println("CPU Fan:      " + builder.getCpuFan().toString());
			System.out.println("Power Supply: " + builder.getPowerSupply().toString());
			System.out.println("GPU:          " + builder.getGpu().toString());
			System.out.println("Hard Drive:   " + builder.getHardDrive().toString());
			System.out.println("CD Drive:     " + builder.getCdDrive().toString());
			System.out.println("Monitor:      " + builder.getMonitor().toString());
			System.out.println("Parts Case:   " + builder.getPartsCase().toString());
			
			System.out.print("\nCommand Entered: ");
			
			String name, partInput;
			int price;
			String[] tokens;
			
			input = in.nextLine();
			input.toLowerCase();
			input.trim();
			
			switch(input) {
			
			case "1": 	
				System.out.println("Please input part information (name,price)");
				partInput = in.nextLine();
				partInput.trim();
				tokens = partInput.split(",");
				name = tokens[0];
				price = Integer.parseInt(tokens[1]);
				builder.setMotherboard(name, price);
				break;
				
			case "2": 	
				System.out.println("Please input part information (name,price)");
				partInput = in.nextLine();
				tokens = partInput.split(",");
				name = tokens[0];
				price = Integer.parseInt(tokens[1]);
				builder.setCpu(name, price);
				break;
				
			case "3": 	
				System.out.println("Please input part information (name,price)");
				partInput = in.nextLine();
				tokens = partInput.split(",");
				name = tokens[0];
				price = Integer.parseInt(tokens[1]);
				builder.setCpuFan(name, price);
				break;
				
			case "4": 	
				System.out.println("Please input part information (name,price)");
				partInput = in.nextLine();
				tokens = partInput.split(",");
				name = tokens[0];
				price = Integer.parseInt(tokens[1]);
				builder.setPowerSupply(name, price);
				break;
				
			case "5": 	
				System.out.println("Please input part information (name,price)");
				partInput = in.nextLine();
				tokens = partInput.split(",");
				name = tokens[0];
				price = Integer.parseInt(tokens[1]);
				builder.setGpu(name, price);
				break;
				
			case "6": 	
				System.out.println("Please input part information (name,price)");
				partInput = in.nextLine();
				tokens = partInput.split(",");
				name = tokens[0];
				price = Integer.parseInt(tokens[1]);
				builder.setHardDrive(name, price);
				break;
				
			case "7": 	
				System.out.println("Please input part information (name,price)");
				partInput = in.nextLine();
				tokens = partInput.split(",");
				name = tokens[0];
				price = Integer.parseInt(tokens[1]);
				builder.setCdDrive(name, price);
				break;
				
			case "8": 	
				System.out.println("Please input part information (name,price)");
				partInput = in.nextLine();
				tokens = partInput.split(",");
				name = tokens[0];
				price = Integer.parseInt(tokens[1]);
				builder.setMonitor(name, price);
				break;
				
			case "9": 	
				System.out.println("Please input part information (name,price)");
				partInput = in.nextLine();
				tokens = partInput.split(",");
				name = tokens[0];
				price = Integer.parseInt(tokens[1]);
				builder.setPartsCase(name, price);
				break;
				
			case "b":
				System.out.println("System built! Thank you\n");
				pcParts = builder.buildPC();
				pcParts.printList();
				pcParts.printTotal();
				done = true;
				break;
				
			case "f":
				System.out.println("Program Finished");
				done = true;
				break;
			
			 default:
				System.out.println("Invalid entry");
			}
		}

	}

}
