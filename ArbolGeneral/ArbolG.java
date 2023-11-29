public class ArbolG
{
    NodoG raiz;
    NodoG bus;
    String msg;
    //Cola c;
    ArbolG()
    {
        raiz=null;
    }
    void ingresar(NodoG p, NodoG n)
    {
        if(p==null)raiz=n;
        else if(p.hijo==null)p.hijo=n;//hijo
        else 
        {
            NodoG tmp=p.hijo;
            while(tmp.her!=null)
            {
                tmp=tmp.her;
            }
            tmp.her=n;//her
        }
    }
//=============================================================================
    NodoG traer(int codigo)
    {
        bus=null;
        recorrido(raiz,codigo);
        return bus;
    }
    private void recorrido(NodoG p, int codigo)
    {
        if(bus!=null)return ;
        if(p!=null)
        {
            //javax.swing.JOptionPane.showMessageDialog(null,"Primero "+p.toString());
            if(p.codigo==codigo)bus=p;
        }
        NodoG tmp=p.hijo;
        while(tmp!=null)
        {
            javax.swing.JOptionPane.showMessageDialog(null,tmp.toString());
            if(tmp.codigo==codigo)bus=tmp;
            else recorrido(tmp,codigo);
            tmp=tmp.her;
        }   
    }
//===================================================================================
    void inorden()
    {
        msg="Informacion Inorden del Arbol\n";
        //c=new Cola();
        inorden(raiz);
    }
    private void inorden(NodoG p)
    {
        msg+=p.toString()+"\n";
        //c.encolar(new NodC(p.codigo,p.nombre));
        NodoG tmp=p.hijo;
        while(tmp!=null)
        {
            //javax.swing.JOptionPane.showMessageDialog(null,tmp.toString());
            inorden(tmp);
            tmp=tmp.her;
        }
    }
//====================================================================================
}