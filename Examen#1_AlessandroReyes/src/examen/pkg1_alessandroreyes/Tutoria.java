package examen.pkg1_alessandroreyes;

import java.util.ArrayList;

public class Tutoria {
    private String hora, aula, día, clase, mes, año, tema; 
    private Tutor tutor;
    private ArrayList<Anormal> alumnos;

    public Tutoria() {
    }

    public Tutoria(String hora, String aula, String día, String clase, String mes, String año, String tema, Tutor tutor) {
        this.hora = hora;
        this.aula = aula;
        this.día = día;
        this.clase = clase;
        this.mes = mes;
        this.año = año;
        this.tema = tema;
        this.tutor = tutor;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getDía() {
        return día;
    }

    public void setDía(String día) {
        this.día = día;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public ArrayList<Anormal> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Anormal> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "hora= " + hora + ", aula: " + aula + ", dia: " + día + ", clase: " + clase + ", mes: " + mes +
                ", año: " + año + ", tema: " + tema + ", tutor: " + tutor;
    }
    
}
