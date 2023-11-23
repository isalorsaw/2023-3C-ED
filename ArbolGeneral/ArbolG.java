public class ArbolG
{
    NodoG raiz;
    NodoG bus;
    ArbolG()
    {
        raiz=null;
    }
    void ingresar(NodoG p, NodoG n)
    {
        if(p==null)raiz=n;
        else if(p.hijo==null)p.hijo=n;
        else 
        {
            NodoG tmp=p.hijo;
            while(tmp.her!=null)
            {
                tmp=tmp.her;
            }
            tmp.her=n;
        }
    }
    NodoG traer(int codigo)
    {
        bus=null;
        recorrido(raiz,codigo);
        return bus;
    }
    void recorrido(NodoG p, int codigo)
    {
        if(bus!=null)return ;
        if(p!=null)
        {
            if(p.codigo==codigo)bus=p;
        }
        NodoG tmp=p.hijo;
        while(tmp!=null)
        {
            if(tmp.codigo==codigo)bus=tmp;
            else recorrido(tmp,codigo);
            tmp=tmp.her;
        }
        
    }
    String inorden()
    {
        return null;
    }
        
}