import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class BitCountingTest {
  @Test
  public void testGame() {
    assertEquals(5, BitCounting.countBits(1234)); 
    assertEquals(1, BitCounting.countBits(4)); 
    assertEquals(3, BitCounting.countBits(7)); 
    assertEquals(2, BitCounting.countBits(9)); 
    assertEquals(2, BitCounting.countBits(10)); 
  }
}


public class BitCounting {

	public static int countBits(int n){
		
    String bin = Integer.toBinaryString(n);
    
    int count = 0;
    System.out.print(bin);
    
    for(int i = 0; i < bin.length() ; i++){
      if(bin.charAt(i) == '1'){
        count++;
      }
    }
  
    
    
    
    return count;
	}
	
}
