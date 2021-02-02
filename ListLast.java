//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
   // Method for checking for a repeat final value
   //By Carson Irons P2
	public static boolean go( List<Integer> ray)
	{
//First check if the arraylist has at least 2 elements 
if(ray.size()>=2){
//if it does make a for loop starting at 0and ending at the second to last element
for(int i =0; i<ray.size()-1;i++){
//for each index check if it is equal to the final element 
if(ray.get(i)==ray.get(ray.size()-1)){
//if any are return true
return true;
}
//end for loop
}
//end if statement
}
//if true is not returned already return false
return false;
//end method
  }
}