import javax.swing.JOptionPane;
public class Nodo
{
    //Atributos
    int num;
    String nombre;
    Nodo sig;
    
    //Constructor
    public Nodo(int n,String no)
    {
        num=n;
        nombre=no;
        sig=null;
    }
    
    public Nodo()
    {
        //num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Entero"));
        //num=new FM().pedirNumero("Ingrese un Numero");
        sig=null;
    }
    
    //Funciones y Metodos
    public String toString()
    {
        return num+" "+nombre;
    }
}