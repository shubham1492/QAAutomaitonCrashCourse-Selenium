package Day18;

import dataprovider.DP;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgDataProviderExampole2 {

    @Test(dataProvider = "dp" , dataProviderClass = DP.class)
    public void sum(int v1 , int v2){
        int result = v1+v2;
        System.out.println("The final sum of given value is "+ result);
    }

    @Test(dataProvider = "dp" , dataProviderClass = DP.class)
    public void diff(int v1 , int v2){
        int result = v1-v2;
        System.out.println("The final diff of given value is "+ result);
    }

    @Test(dataProvider = "dp" , dataProviderClass = DP.class)
    public void Mul(int v1 , int v2){
        int result = v1*v2;
        System.out.println("The final mul of given value is "+ result);
    }
}
