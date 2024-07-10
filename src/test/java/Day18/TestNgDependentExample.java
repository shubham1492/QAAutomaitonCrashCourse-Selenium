package Day18;

import org.testng.annotations.Test;

public class TestNgDependentExample {

    @Test(dependsOnMethods = "bopenBrowser")
    public void asignIn(){
        System.out.println("Sign in the application");
    }

    @Test
    public void bopenBrowser(){
        System.out.println("open browser and launch the url");
    }

}
