import javax.swing.JOptionPane;
public class Test
{
    static Archivo a=new Archivo("nodos.txt");
    static Lista l=new Lista("Lista de Nodos");
    static ArbolG ar=new ArbolG();
    public static void main(String args[])
    {
        inicializarLista();
        crearArbol();
    }
    public static void crearArbol()
    {
        a=new Archivo("relaciones.txt");
        
        String lineas[]=a.toString().split("\n");
        
        if(lineas.length>0)
        {
            String pl=lineas[0];
            //int codigo=Integer.parseInt(pl.split(";"));
        }
    }
    public static void inicializarLista()
    {
        String cadena="";
        String lineas[]=a.toString().split("\n");
        for(int i=0;i<lineas.length;i++)
        {
            cadena+=lineas[i]+"\n";
            String interno[]=lineas[i].split(";");
            l.insertar(new Nodo(Integer.parseInt(interno[0]),interno[1]));
        }
        JOptionPane.showMessageDialog(null,l.toString());
    }
}