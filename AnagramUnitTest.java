/* Program has been written in java */

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.*;    
import java.io.*;

public class AnagramUnitTest {

private String mFirstString="eat";
private String mSecondString="tar";

    @Test
    public void testIsAnagramOrNot() {
        anagramCheck   = new AnagramCheck();
        Boolean result = anagramCheck.isAnagram(mFirstString, mSecondString);
		if(result){
		   assertEquals(mFirstString+" and "+mSecondString+" are Anagram");
		}
		else{
		   assertEquals(mFirstString+" and "+mSecondString+" are not Anagram");
		}
    }
	
	@Test
    public void testIsInputValid() {
        anagramCheck   = new AnagramCheck();
		if(mFirstString!=null && mSecondString!=null){
		system.out.println("inputs are valid");
		}
		else{
		system.out.println("inputs are not valid");
		}
		
    }
}