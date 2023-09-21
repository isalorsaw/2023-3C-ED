import javax.swing.JOptionPane;
public class FM
{
    //Funcion que pide un entero y lo valida
    public int pedirNumero(String msg)
    {
        int n=0;
        boolean seguir=true;
        do
        {
            try
            {
                n=Integer.parseInt(JOptionPane.showInputDialog(msg));
                seguir=false;
            }
            catch(Exception exp)
            {
                mensaje("Error al Ingresar un Entero");
            }
        }while(seguir);
        return n;
    }
    //Funcion que pide un double y lo valida
    public double pedirDouble(String msg)
    {
        return 0;
    }
    public void mensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
    
}