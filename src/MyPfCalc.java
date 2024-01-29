/**
 *
 */
public class MyPfCalc implements PosfixCalc{
    private UvgStack numeros;


    public MyPfCalc(UvgStack pila){
        this.numeros = pila;
    }

    @Override

    public Integer calc(String problem) {
        for (int i = 0; i < problem.length(); i++){
            UvgStack numeros = pila;
            char v = (char) problem.charAt(i);

            if ( Character.isDigit(v) ){
                numeros.push(Integer.parseInt(String.valueOf(v)));
            }
            switch (v){
                case '+':
                    respuesta = numeros.pull() + numeros.pull();
                    numeros.push(respuesta);
                    break;

                case '-':
                    respuesta = numeros.pull() - numeros.pull();
                    numeros.push(respuesta);
                    break;

                case '*':
                    respuesta = numeros.pull() * numeros.pull();
                    numeros.push(respuesta);
                    break;

                case '/':
                    respuesta = numeros.pull() / numeros.pull();
                    numeros.push(respuesta);
                    break;

                default:



            }

        }
        return numeros.pull();
    }
}
