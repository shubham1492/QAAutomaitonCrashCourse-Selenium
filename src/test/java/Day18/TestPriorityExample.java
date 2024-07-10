package Day18;

import org.testng.annotations.Test;

public class TestPriorityExample {

    @Test(priority = 0)
    public void b_method(){
        System.out.println("b_method");
    }

    @Test(priority = 1)
    public void c_method(){
        System.out.println("c_method");
    }

    @Test(priority = 3)
    public void a_method(){
        System.out.println("a_method");
    }

    @Test(priority = 2)
    public void d_method(){
        System.out.println("d_method");
    }

}

