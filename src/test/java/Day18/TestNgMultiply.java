package Day18;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgMultiply {

    @Test
    @Parameters({"val1","val2"})
    public void diff(int v1 , int v2){
        int result = v1*v2;
        System.out.println("The final mul of given value is "+ result);
    }
}
