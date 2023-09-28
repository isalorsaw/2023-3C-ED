import javax.swing.JOptionPane;
public class Nodo
{
    //Atributos
    int num;
    Nodo sig;
    
    //Constructor
    public Nodo(int n)
    {
        num=n;
        sig=null;
    }
    
    public Nodo()
    {
        //num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Entero"));
        num=new FM().pedirNumero("Ingrese un Numero");
        sig=null;
    }
    
    //Funciones y Metodos
    public String toString()
    {
        return num+"";
    }
}