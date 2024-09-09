public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        RobotDeLimpieza original = new RobotDeLimpieza("Robot 1");
        RobotDeLimpieza copia = (RobotDeLimpieza) original.clonar();

        original.realizarTarea();
        copia.realizarTarea();
    }
}