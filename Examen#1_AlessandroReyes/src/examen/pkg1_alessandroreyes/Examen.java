package examen.pkg1_alessandroreyes;

public class Examen {
    private String clase, tema;
    private int conocimientorequerido, puntaje;

    public Examen() {
    }

    public Examen(String clase, String tema, int conocimientorequerido, int puntaje) {
        this.clase = clase;
        this.tema = tema;
        this.conocimientorequerido = conocimientorequerido;
        this.puntaje = puntaje;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getConocimientorequerido() {
        return conocimientorequerido;
    }

    public void setConocimientorequerido(int conocimientorequerido) {
        this.conocimientorequerido = conocimientorequerido;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "clase: " + clase + ", tema: " + tema + ", conocimientorequerido= " + conocimientorequerido + ", puntaje= " + puntaje + '}';
    }
    
}
