package Day19;

import dataprovider.DP;
import org.testng.annotations.Test;

public class ExcelReaderDataProviderExample {

    @Test(dataProvider = "loginDetails", dataProviderClass = DP.class)
    public  void verifyLoginDetails(String userName,String password,String status){
        System.out.println("Username:"+userName);
        System.out.println("password:"+password);
        System.out.println("status:"+status);
    }

}
