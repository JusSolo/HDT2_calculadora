import java.util.Vector;

public class MyStack implements UvgStack {
    private Vector<Object> v;
    private Integer tamano;

    MyStack(){
        this.v = new Vector<Object>();
        this.tamano = -1;
    }

    @Override
    public Object top() {
        return null;
    }

    @Override
    public Object push() {
        return null;
    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
