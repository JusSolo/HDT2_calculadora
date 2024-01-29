import java.util.Vector;

public class MyStack<T> implements UvgStack<T> {
    private Vector<T> v;
    private Integer tamano;

     public MyStack(){
        this.v = new Vector<>();
        this.tamano = -1;
    }

    @Override
    public T top() {
        if (this.tamano==-1){
            return null;
        }
        else{
            return v.lastElement();
        }
    }

    @Override
    public void push(T ob) {
        v.add(this.tamano);
        this.tamano ++;
    }

    @Override
    public T pop() {
        if (this.tamano < 0) {
            return null;
        } else {
            T lE = v.lastElement();
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
