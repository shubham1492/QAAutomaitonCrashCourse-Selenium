package Day18;

import org.testng.annotations.Test;

public class TestNgGroupExample {

    @Test(groups = {"sanity"})
    public void b_method(){
        System.out.println("b_method");
    }

    @Test
    public void c_method(){
        System.out.println("c_method");
    }

    @Test(groups = {"sanity"})
    public void a_method(){
        System.out.println("a_method");
    }

    @Test
    public void e_method(){
        System.out.println("e_method");
    }

    @Test(groups = {"sanity"})
    public void f_method(){
        System.out.println("f_method");
    }


    @Test
    public void g_method(){
        System.out.println("g_method");
    }

    @Test(groups = {"sanity"})
    public void h_method(){
        System.out.println("h_method");
    }

    @Test
    public void d_method(){
        System.out.println("d_method");
    }

}
