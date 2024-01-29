import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPfCalcTest {

    @Test
    void calc() {
        UvgStack<Integer> pila = new MyStack<>();
        PosfixCalc calcu = new MyPfCalc(pila);
        String operacion = "1 2 + 4 * 3 +";
        int resultado = calcu.calc(operacion);
        assertEquals(15, resultado);


    }


}