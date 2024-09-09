class RobotDeLimpieza extends Robot {
    public RobotDeLimpieza(String nombre) {
        this.nombre = nombre;
    }

    public void realizarTarea() {
        System.out.println(nombre + " está limpiando.");
    }
}