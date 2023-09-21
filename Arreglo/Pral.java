import javax.swing.JOptionPane;
public class Pral
{
    public static void main(String args[])
    {
        int n1=0;
        int n2=0;
        int suma=0;
        FM f=new FM();//Instancia
        
        //n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Primer Numero"));
        n1=f.pedirNumero("Ingrese el Primer Numero");
        n2=f.pedirNumero("Ingrese el Segundo Numero");
        suma=n1+n2;
        
        String salida=n1+" + "+n2+" = "+suma;
        f.mensaje(salida);
    }
}