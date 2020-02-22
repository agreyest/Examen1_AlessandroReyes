package examen.pkg1_alessandroreyes;

public abstract class Alumno {
    private String nombre, carrera, lugarnat, usuario, contraseña; 
    private int edad, númcuenta; 

    public Alumno() {
    }

    public Alumno(String nombre, String carrera, String lugarnat, String usuario, String contraseña, int edad, int númcuenta) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.lugarnat = lugarnat;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.edad = edad;
        this.númcuenta = númcuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getLugarnat() {
        return lugarnat;
    }

    public void setLugarnat(String lugarnat) {
        this.lugarnat = lugarnat;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNúmcuenta() {
        return númcuenta;
    }

    public void setNúmcuenta(int númcuenta) {
        this.númcuenta = númcuenta;
    }

    @Override
    public String toString() {
        return nombre + ", carrera: " + carrera + ", edad= " + edad;
    }
    
    public abstract void Tutoria();
    
}
