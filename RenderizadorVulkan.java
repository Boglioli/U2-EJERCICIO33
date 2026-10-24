public class RenderizadorVulkan implements MotorGrafico {
    private boolean inicializado = false;

    public void inicializarContexto() {
        inicializado = true;
        System.out.println("contexto vulkan inicializado");
    }

    public void dibujarMalla(String nombreMalla) {
        if (inicializado) {
            System.out.println("vulkan dibujando: " + nombreMalla);
        } else {
            System.out.println("error: vulkan no esta inicializado");
        }
    }

    public void liberarRecursos() {
        if (inicializado) {
            inicializado = false;
            System.out.println("recursos vulkan liberados");
        } else {
            System.out.println("error: vulkan no esta inicializado");
        }
    }
}
