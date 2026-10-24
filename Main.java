public class Main {
    public static void main(String[] args) {
        MotorGrafico motor;
        motor = new RenderizadorOpengl();
        motor.inicializarContexto();
        motor.dibujarMalla("personaje");
        motor.dibujarMalla("escenario");
        motor.liberarRecursos();
        System.out.println("------------");
        motor = new RenderizadorDirectx();
        motor.inicializarContexto();
        motor.dibujarMalla("personaje ");
        motor.liberarRecursos();
        System.out.println("------------");
        motor = new RenderizadorVulkan();
        motor.inicializarContexto();
        motor.dibujarMalla("escenario ");
        motor.liberarRecursos();
    }
}
