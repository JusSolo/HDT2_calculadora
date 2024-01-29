/**
 *
 */
public class MyPfCalc implements PosfixCalc{
    private UvgStack<Integer> numeros;


    public MyPfCalc(UvgStack<Integer> pila){
        this.numeros = pila;
    }

    @Override

    public Integer calc(String problem) {
        // verifiquemos que numeros este vacia
        while (!numeros.isEmpty()){
            numeros.pop();
        }
        int respuesta =0;
        for (int i = 0; i < problem.length(); i++){
            char v = (char) problem.charAt(i);

            if ( Character.isDigit(v) ){
                numeros.push(Integer.parseInt(String.valueOf(v)));
            }
            switch (v){
                case '+':
                    respuesta = numeros.pop() + numeros.pop();
                    numeros.push(respuesta);
                    break;

                case '-':
                    respuesta = numeros.pop() - numeros.pop();
                    numeros.push(respuesta);
                    break;

                case '*':
                    respuesta = numeros.pop() * numeros.pop();
                    numeros.push(respuesta);
                    break;

                case '/':
                    respuesta = numeros.pop() / numeros.pop();
                    numeros.push(respuesta);
                    break;

                default:



            }

        }
        return (Integer) numeros.pop();
    }
}
