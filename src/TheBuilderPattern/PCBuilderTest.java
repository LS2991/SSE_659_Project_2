package TheBuilderPattern;

import java.util.Scanner;


public class PCBuilderTest {

	public static void main(String[] args) {
		
		PCPartsList pcParts;
		PCBuilder builder = new PCBuilder();
		Part tempP;
		
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
			
			String[] tokens = {"", ""};
			
			input = in.nextLine();
			input.toLowerCase();
			input.trim();
			
			switch(input) {
			
			case "1": 	
				tempP = addComponent(in, input, tokens);
				builder.setMotherboard(tempP.getName(), tempP.getPrice());
				break;
				
			case "2": 	
				tempP = addComponent(in, input, tokens);
				builder.setCpu(tempP.getName(), tempP.getPrice());
				break;
				
			case "3": 	
				tempP = addComponent(in, input, tokens);
				builder.setCpuFan(tempP.getName(), tempP.getPrice());
				break;
				
			case "4": 	
				tempP = addComponent(in, input, tokens);
				builder.setPowerSupply(tempP.getName(), tempP.getPrice());
				break;
				
			case "5": 	
				tempP = addComponent(in, input, tokens);
				builder.setGpu(tempP.getName(), tempP.getPrice());
				break;
				
			case "6": 	
				tempP = addComponent(in, input, tokens);
				builder.setHardDrive(tempP.getName(), tempP.getPrice());
				break;
				
			case "7": 	
				tempP = addComponent(in, input, tokens);
				builder.setCdDrive(tempP.getName(), tempP.getPrice());
				break;
				
			case "8": 	
				tempP = addComponent(in, input, tokens);
				builder.setMonitor(tempP.getName(), tempP.getPrice());
				break;
				
			case "9": 	
				tempP = addComponent(in, input, tokens);
				builder.setPartsCase(tempP.getName(), tempP.getPrice());
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
	
	public static Part addComponent(Scanner in, String partInput, String[]tokens) {
		
		System.out.println("Please input part information (name,price)");
		
		partInput = in.nextLine();
		tokens = partInput.split(",");
		System.out.println(tokens[0] + " " + tokens[1]);
		
		Part p = new Part(tokens[0], Integer.parseInt(tokens[1]));
		return p;
	}

}
