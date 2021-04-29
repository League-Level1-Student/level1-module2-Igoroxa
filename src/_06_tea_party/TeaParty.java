package _06_tea_party;

public class TeaParty {
	    public String welcome(String name, boolean isWoman, boolean isKnighted) {
	    	String output = "Hello ";
	    	
//	    	output += "Mr. ";
	        if (isWoman == true) {
	        	if (isKnighted == true) {
					output += "Lady ";
				}
	        	else {
	        		output += "Ms. ";
	        	}
			}
	        if (isWoman == false) {
				if (isKnighted == true) {
					output += "Sir ";
				}
				else {
					output += "Mr. ";
				}
			}
	    	
	       
	        
	        return output  + name;
	    }
	
}
