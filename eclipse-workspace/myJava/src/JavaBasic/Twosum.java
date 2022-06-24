package JavaBasic;

public class Twosum {

	public static void main(String[] args) {
		
		int[] nums= {1,2,3,4};
		
		int target = 6;
	    for (int i = 0; i < nums.length; i++) 
	    {
	        for (int j = i+1; j < nums.length; j++) 
	        {
	            if (nums[j] + nums[i]== target) 
	            {
	                System.out.println(i+","+j);
	                break; 
	            }
	           
	        }
	    }
	}
}
		
	

	
	
	
		

	    


