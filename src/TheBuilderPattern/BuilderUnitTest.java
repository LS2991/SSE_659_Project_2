package TheBuilderPattern;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class BuilderUnitTest {

	@Test
	public void addComponentTest() {
		Scanner in = new Scanner(System.in);
		String partName = "";
		String[] tokens = {"", ""};
		
		Part p = PCBuilderTest.addComponent(in, partName, tokens);
		
		assertTrue(p.getName().equals("Motherboard Test"));
		assertTrue(p.getPrice() == 9000);
		
	}

}
