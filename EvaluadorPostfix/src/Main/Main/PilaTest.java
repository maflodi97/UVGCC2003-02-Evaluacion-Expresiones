package Main;

import static org.junit.Assert.*;

public class PilaTest {

    @org.junit.Test
    public void test_para_stack_vacio() {
        Pila p = new Pila();

        assertTrue(p.empty());
    }

    @org.junit.Test
    public void test_para_size() {
        Pila p = new Pila();

        assertTrue(p.size() < 1);
    }
}