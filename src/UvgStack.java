public interface UvgStack<T> {
    public T top();
    public void push(T obj);
    public T pop();
    public boolean isEmpty();
}
