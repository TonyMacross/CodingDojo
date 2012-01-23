package net.grupocae.cd;

import org.junit.Test;

public class TestStringCalculator {

    @Test  
    public void test1() throws Exception {
            assert StringCalculator.add("//t\n1t-2,-3\n4") == 10;
    }
    
    @Test
    public void test2() throws Exception {
            assert StringCalculator.add("//**\n1**2**3**4") == 11;
    }
    
    @Test
    public void test3() throws Exception {
            assert StringCalculator.add("1,2") == 3;
    }
    
    @Test
    public void test4() throws Exception {
            assert StringCalculator.add("2") == 2;
    }
    
    @Test
    public void test5() throws Exception {
            assert StringCalculator.add("") == 0;
    }

    
}
