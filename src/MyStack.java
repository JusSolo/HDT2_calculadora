import org.junit.jupiter.api.Test;

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
        if (this.tamano==-1){
            return null;
        }
        else{
            return v.lastElement();
        }
    }

    @Override
    public void push(Object ob) {
        v.add(this.tamano);
        this.tamano ++;
    }

    @Override
    public Object pop() {
        if (this.tamano < 0) {
            return null;
        } else {
            Object lE = v.lastElement();
            v.remove(this.tamano);
            this.tamano--;
            return lE;
        }

    }
    @Override
    public boolean isEmpty() {
        if (this.tamano==-1){
            return true;
        }
        return false;
    }
}
