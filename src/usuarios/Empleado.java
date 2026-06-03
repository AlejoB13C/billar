package usuarios;

public class Empleado extends Usuario {
    private String cargo;
    private double salario;
    private String horario;

    public Empleado(String id, String name, String email, String passwordHash, String estado, String cargo, double salario, String horario) {
        super(id, name, email, passwordHash, estado);
        this.cargo = cargo;
        this.salario = salario;
        this.horario = horario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void registrarVenta() {
        System.out.println("Registrando venta...");
    }

    public void gestionarReserva() {
        System.out.println("Gestionando reserva...");
    }

    public void asignarJuego() {
        System.out.println("Asignando juego...");
    }

}
