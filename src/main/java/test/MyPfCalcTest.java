import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPfCalcTest {

    @Test
    void calc() {
        UvgStack<Integer> pila = new MyStack<>();
        PosfixCalc calcu = new MyPfCalc(pila);
        String operacion = "1 2 +";
        assertEquals(3,calcu.calc(operacion));
    }
}