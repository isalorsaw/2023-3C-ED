public class Lista
{
    //Atributo
    Nodo prim;
    String nombre;
    public Lista()
    {
        prim=null;
        nombre="";
    }
    public Lista(String n)
    {
        nombre=n;
        prim=null;
    }
    //Funciones y Metodos
    public void insertar(Nodo n)
    {
        if(prim==null)prim=n;
        else
        {
            Nodo tmp=prim;
            while(tmp.sig!=null)
            {
                tmp=tmp.sig;
            }
            tmp.sig=n;
        }
    }
    public String toString()
    {
        String cadena=nombre+"\n";
        Nodo tmp=prim;
        while(tmp!=null)
        {
            cadena+=tmp.toString()+"\n";
            tmp=tmp.sig;
        }
        return cadena;
    }
    public Nodo buscar(Nodo n)
    {
        Nodo tmp=prim;
        while(tmp!=null)
        {
            if(tmp.equals(n))return tmp;
            tmp=tmp.sig;
        }
        return null;
    }
}