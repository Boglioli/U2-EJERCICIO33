public class RenderizadorOpengl implements MotorGrafico {
    private boolean inicializado = false;

    public void inicializarContexto() {
        inicializado = true;
        System.out.println("contexto Opengl inicializado");
    }

    public void dibujarMalla(String nombreMalla) {
        if (inicializado) {
            System.out.println("opengl dibujando: " + nombreMalla);
        } else {
            System.out.println("error: opengl no esta inicializado");
        }
    }

    public void liberarRecursos() {
        if (inicializado) {
            inicializado = false;
            System.out.println("recursos opengl liberados");
        } else {
            System.out.println("error: opengl no esta inicializado");
        }
    }
}
