import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

class ListTestChecker implements StringChecker{
    public int sc;
    public boolean checkString(String s){
        if (s.length() == sc){
            return true;
        }
        return false; 
    }
}
public class ListTests{
    // String[] input = {"hi", "hello", "hey"};
    // String[] output = {"hello", "hey"};
    // @Test
    // public void filter(){
    //     List<String> input = new ArrayList<String>(input);
    //     List<String> e = new ArrayList<String>(output);
    //     assertArrayEquals(expected, ListExamples.filter(input, 2));

    // }
    
}
