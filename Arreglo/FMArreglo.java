public class FMArreglo
{
    public static String imprimir(int a[])
    {
        String cadena="Informacion\n";
        for(int i=0;i<a.length;i++)
        {
            cadena+=a[i]+" ";
        }
        return cadena;
    }
}