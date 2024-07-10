package Day18;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterExample {

    @Test
    @Parameters({"val1","val2"})
    public void sum(int v1 , int v2){
        int result = v1+v2;
        System.out.println("The final sum of given value is "+ result);
    }

    @Test
    @Parameters({"val1","val2"})
    public void diff(int v1 , int v2){
        int result = v1-v2;
        System.out.println("The final diff of given value is "+ result);
    }
}
