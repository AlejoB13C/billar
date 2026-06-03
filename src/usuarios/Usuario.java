package usuarios;

public abstract class Usuario {
    private String id;
    private String name;
    private String email;
    private String passwordHash;
    private String estado;

    public Usuario(String id, String name, String email, String passwordHash, String estado) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getEstado() {
        return estado;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
