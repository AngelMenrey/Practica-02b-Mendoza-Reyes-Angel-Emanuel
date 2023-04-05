package practica.pkg02b.mendoza.reyes.angel.emanuel;

public class Hospital {
     private  double numClinica;
     private String NombreClinica, AreaClinica;
     
    //constructor
    public Hospital(double numClinica, String NombreClinica, String AreaClinica) {
        this.numClinica = numClinica;
        this.NombreClinica = NombreClinica;
        this.AreaClinica = AreaClinica;
    }
  
    //Setters
    public void setNumClinica(double numClinica) {
        this.numClinica = numClinica;
    }

    public void setNombreClinica(String NombreClinica) {
        this.NombreClinica = NombreClinica;
    }

    public void setAreaClinica(String AreaClinica) {
        this.AreaClinica = AreaClinica;
    }
   
    //Getters
    public double getNumClinica() {
        return numClinica;
    }

    public String getNombreClinica() {
        return NombreClinica;
    }

    public String getAreaClinica() {
        return AreaClinica;
    } 
}