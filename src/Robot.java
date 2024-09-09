abstract class Robot implements Cloneable {
    public String nombre;

    public Robot clonar() throws CloneNotSupportedException {
        return (Robot) this.clone();
    }

    public abstract void realizarTarea();
}
