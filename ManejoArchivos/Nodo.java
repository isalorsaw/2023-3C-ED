public class Nodo
{
    String codigo;
    String municipio;
    int poblacion;
    Nodo(String c, String m, int p)
    {
        codigo=c;
        municipio=m;
        poblacion=p;
    }
    public String toString()
    {
        return codigo+" "+municipio+" "+poblacion;
    }
}