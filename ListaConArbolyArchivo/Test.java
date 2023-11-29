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
        ar.inorden();
        JOptionPane.showMessageDialog(null,ar.msg);
    }
    public static void crearArbol()
    {
        //try{
        a=new Archivo("relaciones.txt");
        String lineas[]=a.toString().split("\n");
        if(lineas.length>0)
        {
            String pl=lineas[0];
            int codigo=Integer.parseInt(pl.split(";")[0]);
            Nodo b=l.buscar(new Nodo(codigo,""));
            ar.ingresar(null,new NodoG(b.num,b.nombre));
            //int codigo=Integer.parseInt(pl.split(";"));
            
            for(int i=1;i<lineas.length;i++)
            {
                String spli[]=lineas[i].split(";");
                codigo=Integer.parseInt(spli[0]);
                int codigoh=Integer.parseInt(spli[1]);
                b=l.buscar(new Nodo(codigoh,""));
                ar.ingresar(ar.traer(codigo),new NodoG(b.num,b.nombre));//Nodo=NodoG
            }
            
        }
        //{catch(Exception exp){}
    }
    public static void inicializarLista()
    {
        String lineas[];
        String actual="";
        try
        {
            String cadena="";
            lineas=a.toString().split("\n");
            for(int i=0;i<lineas.length;i++)
            {
                actual=lineas[i];
                l.insertar(new Nodo(lineas[i]));
            }
            JOptionPane.showMessageDialog(null,l.toString());
        }
        catch(Exception exp)
        {
            JOptionPane.showMessageDialog(null,"Error en la linea "+actual);
        }
    }
}