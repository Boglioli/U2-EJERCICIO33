public class RenderizadorDirectx implements MotorGrafico {
    private boolean inicializado = false;

    public void inicializarContexto() {
        inicializado = true;
        System.out.println("contexto directx inicializado");
    }

    public void dibujarMalla(String nombreMalla) {
        if (inicializado) {
            System.out.println("directx dibujando: " + nombreMalla);
        } else {
            System.out.println("error: directx no esta inicializado");
        }
    }

    public void liberarRecursos() {
        if (inicializado) {
            inicializado = false;
            System.out.println("recursos directx liberados");
        } else {
            System.out.println("error: directx no esta inicializado");
        }
    }
}
