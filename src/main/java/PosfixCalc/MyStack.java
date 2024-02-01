import java.util.Vector;

/**
 * Implementación de la interfaz UvgStack utilizando la clase Vector de Java.
 *
 * @param <T> El tipo de objetos que contendrá la pila.
 */
public class MyStack<T> implements UvgStack<T> {
    private Vector<T> v;
    private int tamano;

    /**
     * Constructor que inicializa la pila y el tamaño.
     */
    public MyStack() {
        this.v = new Vector<>();
        this.tamano = -1;
    }

    @Override
    public T top() {
        return (this.tamano == -1) ? null : v.lastElement();
    }

    @Override
    public void push(T obj) {
        v.add(obj);
        this.tamano++;
    }

    @Override
    public T pop() {
        if (this.tamano < 0) {
            return null;
        } else {
            T lastElement = v.lastElement();
            v.remove(this.tamano);
            this.tamano--;
            return lastElement;
        }
    }

    @Override
    public boolean isEmpty() {
        return this.tamano == -1;
    }
}

