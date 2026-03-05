package features.domain;

public class Character {

    private String id;
    private String nombre;
    private String clan;
    private String nivel;
    private String edad;

    public Character(String id, String nombre, String clan, String nivel, String edad) {
        this.id = id;
        this.nombre = nombre;
        this.clan = clan;
        this.nivel = nivel;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
