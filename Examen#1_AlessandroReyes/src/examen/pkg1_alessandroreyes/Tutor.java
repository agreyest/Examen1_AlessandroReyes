package examen.pkg1_alessandroreyes;

import java.util.ArrayList;

public class Tutor extends Alumno{
    private ArrayList<String> listaclases; 
    private int ganancias, tutorías, nivel;

    public Tutor(int ganancias, int tutorías, int nivel, String nombre, String carrera, String lugarnat, String usuario, String contraseña, int edad, int númcuenta) {
        super(nombre, carrera, lugarnat, usuario, contraseña, edad, númcuenta);
        this.ganancias = ganancias;
        this.tutorías = tutorías;
        this.nivel = nivel;
    }

    public Tutor(String nombre, String carrera, String lugarnat, String usuario, String contraseña, int edad, int númcuenta) {
        super(nombre, carrera, lugarnat, usuario, contraseña, edad, númcuenta);
    }

    public ArrayList<String> getListaclases() {
        return listaclases;
    }

    public void setListaclases(ArrayList<String> listaclases) {
        this.listaclases = listaclases;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public int getTutorías() {
        return tutorías;
    }

    public void setTutorías(int tutorías) {
        this.tutorías = tutorías;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    @Override
    public void Tutoria(){
        setTutorías(tutorías+1);
        setGanancias(ganancias+270);
    }
}
