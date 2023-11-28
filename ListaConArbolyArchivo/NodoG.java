public class NodoG
{
    int codigo;
    String nombre;
    NodoG hijo,her;
    NodoG(int c, String n)
    {
        codigo=c;
        nombre=n;
        hijo=her=null;
    }
    public String toString()
    {
        return codigo+" "+nombre;
    }
}