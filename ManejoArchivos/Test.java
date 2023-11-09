import javax.swing.JOptionPane;
public class Test
{
    static Nodo n[]=new Nodo[0];
    public static void main(String args[])
    {
        Archivo a=new Archivo("archivo/informacion.txt");
        String arc=a.toString();
        inicializar(arc);
        imprimir();
        //String info=a.toString();
        
        //JOptionPane.showMessageDialog(null,info);
    }
    public static void imprimir()
    {
        String cadena="Info de Nodos\n";
        for(int i=0;i<n.length;i++)
        {
            cadena+=n[i].toString()+"\n";
        }
        JOptionPane.showMessageDialog(null,cadena);
    }
    public static void inicializar(String a)
    {
        //Separar String a String arreglos
        String arr[]=a.split("\n");
        n=new Nodo[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            //JOptionPane.showMessageDialog(null,arr[i]);
            String interno[]=arr[i].split(";");
            if(interno.length==4)
            {
                String cod=interno[0];
                String nom=interno[1];
                //int p=Integer.parseInt(interno[2].trim());
                int p=Integer.parseInt(interno[2]);
                
                //JOptionPane.showMessageDialog(null,cod+" "+nom+" "+p);
                
                n[i]=new Nodo(cod,nom,p);
            }
            else
            {
                n[i]=new Nodo(interno[0],"",0);
            }
        }
    }
}