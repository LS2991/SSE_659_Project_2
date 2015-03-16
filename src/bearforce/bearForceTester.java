package bearforce;

import static org.junit.Assert.*;

import org.junit.Test;

public class bearForceTester {

	@Test
	public void applicationTester() {
		
		final String[] responses = {"Dont Interview - Not MU Student",
			   "Dont Interview - Not Undergrad student",
			   "Dont Interview - Not Full-time student",
			   "Dont Interview - minimum GPA is not met",
			   "Interview for only BearForce"};
		
		 System.out.println("BearForce Application");
	        
		 boolean[] answers = BearForce.questionnaire();
	        
	        for(int x = 0; x < responses.length; x++) {
	        	if(!answers[x]) {
	        		System.out.println(responses[x]);
	        		return;
	        	}
	        	if(x == responses.length - 1) {
	        		System.out.println("Interview for Bearforce and AV");
	        		return;
	        	}
	        }
	        
	        fail();
	        
	}

}
