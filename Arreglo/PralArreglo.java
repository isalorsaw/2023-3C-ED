public class PralArreglo
{
    public static void main(String args[])
    {
        FMArreglo fma=new FMArreglo();
        FM f=new FM();
        int a[]={10,11,12,13,14,15};
        //int a[]=new int[10];
        
        String result=fma.imprimir(a);
        f.mensaje(result);       
    }
}