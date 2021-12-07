import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Persona{
    String nombre;
    String apellido;
    int edad;
    String hobbie;
    String editorFav;
    String usaOS;
    
    public void setAll(String[] array){

        this.nombre=array[0];
        this.apellido=array[1];
        this.edad=Integer.parseInt(array[2]);
        this.hobbie=array[3];
        this.editorFav=array[4];
        this.usaOS=array[5];
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    }
    public String obtenerHobbie(){
        return hobbie;
    }
    public String obtenerEditorFav(){
        return editorFav;
    }
    public String obtenerOs(){return usaOS;}
    public String obtenerEdad(){
        return Integer.toString(edad);
    }
    
    public void obtenerTodo(){
        String texto= "Hola! "+obtenerApellido()+", "+obtenerNombre()+"\n";
        String texto2= "Tu edad es: " + obtenerEdad()+"\n";
        String texto3="Tu hobbie es: "+obtenerHobbie()+"\n";
        String texto4="Tu editor de codigo favorito es: " +obtenerEditorFav()+" y usas el siguiente Sistema Operativo: "+obtenerOs()+"\n";
        System.out.println(texto+texto2+texto3+texto4);
    }
}
public class main {
    public static void main(String[] args) {

        String[] lista={"Nombre","Apellido","Edad","Hobbie","Editor Favorito","Sistema Operativo que usas"};
        String[] array;
        array = new String[6];


        Persona persona=new Persona();
//ingreso los valores por medio de un Scanner
        Scanner input=new Scanner(System.in);

        System.out.println("Hola! Vamos a ingresar tus datos para darte de alta!\n");
        for (int i=0; i < lista.length; i++){

            System.out.println("Ingresá el siguiente dato: "+ lista[i]);
            String valor=input.nextLine();

            array[i]=valor;
        }
        //Seteo los valores pedidos en el Setter correspondiente.
        persona.setAll(array);
        //Imprimo los valores ingresados por consola.
        persona.obtenerTodo();
    }

}
