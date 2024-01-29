public class Main {
    public static void main(String[] args) {
        String direccion = "/Documentos/education/U/Semestres/Semestre_9/Algoritmos y Estructura/Tareas/HDT/hdt2/src/operacion.txt";
        Leo leo = new Leo();
        String operacio = leo.leerArchivo(direccion);
        UvgStack<Integer> pila = new MyStack<>();
        PosfixCalc calcu = new MyPfCalc(pila);
        String operacion = "1 2 + 4 * 3 +";
        int resultado = calcu.calc(operacion);
        System.out.println(resultado);


    }
}
