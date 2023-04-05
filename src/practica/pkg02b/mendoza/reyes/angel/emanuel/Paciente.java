package practica.pkg02b.mendoza.reyes.angel.emanuel;

public class Paciente extends Hospital {
   private String nombre;
   private double registro, numCamilla;
   
    //Constructor
    public Paciente(String nombre, double registro, double numCamilla, double numClinica, String NombreClinica, String AreaClinica) {
     super(numClinica, NombreClinica, AreaClinica);
     this.nombre = nombre;
     this.registro = registro;
     this.numCamilla = numCamilla;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRegistro(double registro) {
        this.registro = registro;
    }

    public void setNumCamilla(double numCamilla) {
        this.numCamilla = numCamilla;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getRegistro() {
        return registro;
    }

    public double getNumCamilla() {
        return numCamilla;
    }
}
