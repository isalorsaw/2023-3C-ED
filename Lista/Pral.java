public class Pral
{
    public static void main(String args[])
    {
        Lista l=new Lista("Lista de Numeros");
        l.insertar(new Nodo());
        l.insertar(new Nodo());
        l.insertar(new Nodo());
        new FM().mensaje(l.toString());
        
        //new FM().mensaje(l.prim.toString());
        //new FM().mensaje(l.prim.sig.toString());
    }
}