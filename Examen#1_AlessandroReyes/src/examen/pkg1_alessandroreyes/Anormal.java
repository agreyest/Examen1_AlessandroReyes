package examen.pkg1_alessandroreyes;

import java.util.ArrayList;
import java.util.Random;
public class Anormal extends Alumno{
    private int conocimiento, nivel; 
    private ArrayList<Examen> exámenesPR;
    private Random random = new Random();
    public Anormal(int conocimiento, int nivel, String nombre, String carrera, String lugarnat, String usuario, String contraseña, int edad, int númcuenta) {
        super(nombre, carrera, lugarnat, usuario, contraseña, edad, númcuenta);
        this.conocimiento = conocimiento;
        this.nivel = nivel;
    }

    
    public int getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(int conocimiento) {
        this.conocimiento = conocimiento;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Examen> getExámenesPR() {
        return exámenesPR;
    }

    public void setExámenesPR(ArrayList<Examen> exámenesPR) {
        this.exámenesPR = exámenesPR;
    }
    
    @Override
    public void Tutoria(){
        int rand = 0+random.nextInt(100);
        setConocimiento(conocimiento+ rand);
    }
}
