package Day18;

import org.testng.annotations.Test;

public class TestNgGroupDependentExample {

    @Test(groups = "sanity")
    public void sigIn(){
        System.out.println("Sign in the application");
    }

    @Test(groups = "sanity")
    public void openBrowser(){
        System.out.println("open browser and lauch the url");
    }

    @Test(dependsOnGroups = "sanity")
    public void viewHomePage(){
        System.out.println("go to home page");
    }

}
