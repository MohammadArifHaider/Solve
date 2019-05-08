import java.io.*; 
import java.util.Arrays; 
import java.util.Collections; 
  
class AnagramCheck { 
  
    /*function to check anagram */
    static boolean isAnagram(String str1, String str2) 
    { 
		//deleting all whitespace
		
        str1 = str1.replaceAll("\\s","");
		str2 = str2.replaceAll("\\s","");
		
		// Get lenghts 
        int n1 = str1.length(); 
        int n2 = str2.length(); 
  
        // check If length of both strings is same		
        if (n1 != n2) 
            return false; 
  
        // Sort both strings 
        str1.sort();
        str2.sort();
		
		if(str1.equalsIgnoreCase(str2))  
			return true;
		return false;
    } 
  
    /* Driver program */
    public static void main(String args[]) 
    {
		
		str1 = "The Da Vinci Code";
		str2 = "The candid voice";
        if (isAnagram(str1, str2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 
    } 
}