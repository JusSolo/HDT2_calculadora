public class Main {
    public static void main(String[] args) {
        String direccion = "/home/juan/Documentos/education/U/Semestres/Semestre_9/Algoritmos y Estructura/Tareas/HDT/hdt2/operacion.txt";
        Leo leo = new Leo();
        String operacion = leo.leerArchivo(direccion);
        UvgStack<Integer> pila = new MyStack<>();
        PosfixCalc calcu = new MyPfCalc(pila);
        int resultado = calcu.calc(operacion);
        System.out.println(resultado);


    }
}
