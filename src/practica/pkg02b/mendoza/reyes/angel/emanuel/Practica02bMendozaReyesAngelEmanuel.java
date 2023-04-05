//Angel Emanuel Mendoza Reyes
//22110083
//Programacion orientada a Eventos
//Parcial 1
//Practica 02b Mendoza Reyes Angel Emanuel
package practica.pkg02b.mendoza.reyes.angel.emanuel;
import java.util.Arrays;
import java.util.Scanner;

public class Practica02bMendozaReyesAngelEmanuel {
   
public static void main(String[] args) {
     Paciente[] paciente = new Paciente[20];
     int opc;
     double numClinica,registro,numCamilla;
     String NombreClinica,AreaClinica,nombre;
     int pacienteborrar;
     Scanner leer = new Scanner(System.in);
     do{
             System.out.println("************");
             System.out.println("Opciones: ");
             System.out.println("************");
             System.out.println("1. Registrar: ");
             System.out.println("************");
             System.out.println("2. Buscar: ");
             System.out.println("************");
             System.out.println("3. Eliminar: ");
             System.out.println("************");
             System.out.println("4. Consultar: ");
             System.out.println("************");
             System.out.println("5. Salir: ");
             System.out.println("************");
             System.out.println("Ingrese la opcion deseeada: ");
             System.out.println("************");
             opc = leer.nextInt();
             leer.nextLine();
             
             switch(opc){
                 //Registrar
                 case 1:
                     for (int i = 0; i < paciente.length; i++) {
                         System.out.println("Ingrese el nombre del Hospital:");
                         NombreClinica = leer.next();
                         System.out.println("Ingrese el numero del Hospital:");
                         numClinica = leer.nextDouble();
                         System.out.println("Ingresa el nombre del area del Hospital:");
                         AreaClinica = leer.next();
                         System.out.println("Ingrese el numero de camilla del Paciente:");
                         numCamilla = leer.nextDouble();
                         System.out.println("Ingrese el registro del Paciente:");
                         registro = leer.nextDouble();
                         System.out.println("Ingrese el nombre del Paciente:");
                         nombre = leer.next();
                         paciente[i] = new Paciente(nombre, registro, numCamilla, numCamilla, NombreClinica, AreaClinica);
                     }
                     break;
                     //Buscar
                 case 2:
                        System.out.println("Ingrese el registro del paciente, para hacer la busqueda: ");
                        registro= leer.nextDouble();
                        for(int i = 0; i < paciente.length; i++) {
                        if(paciente[i].getRegistro()  == (registro)){
                        System.out.println("El nombre del Hospital es: "+paciente[i].getNombreClinica());
                        System.out.println("El numero del Hospital es: " +paciente[i].getNumClinica());
                        System.out.println("El nombre del area del Hospital es: " +paciente[i].getAreaClinica());
                        System.out.println("El numero de camilla del paciente es: " +paciente[i].getNumCamilla());
                        System.out.println("El registro del pacientes es: " +paciente[i].getRegistro());
                        System.out.println("El nombre del paciente es: " +paciente[i].getNombre());
                        break;
                            }
                      }
                     break;
                 //Eliminar
                 case 3:
                     System.out.println("Ingrese la posicion del paciente a eliminar:");
                     pacienteborrar = leer.nextInt();
                     for(int i = pacienteborrar; i<1; i++){
                        paciente[i]= paciente[i+1];
                         System.out.println("los datos del paciente fueron eliminados");
                    }
                     break;
                     //Consultar
                 case 4:
                      for(int i = 0; i < paciente.length; i++) {
                        System.out.println("El nombre del Hospital es: "+paciente[i].getNombreClinica());
                        System.out.println("El numero del Hospital es: " +paciente[i].getNumClinica());
                        System.out.println("El nombre del area del Hospital es: " +paciente[i].getAreaClinica());
                        System.out.println("El numero de camilla del paciente es: " +paciente[i].getNumCamilla());
                        System.out.println("El registro del pacientes es: " +paciente[i].getRegistro());
                        System.out.println("El nombre del paciente es: " +paciente[i].getNombre());      
                     }
                     break;
                 default:
                     if(opc>5){
                         System.out.println("Opcion Invalida");
                     }
                     break; 
             }
    }while(opc!=5);
    System.out.println("Usted Salio del Menu");
}
}
