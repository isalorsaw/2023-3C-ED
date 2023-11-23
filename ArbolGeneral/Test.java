import javax.swing.JOptionPane;
public class Test
{
    public static void main(String args[])
    {
        ArbolG a=new ArbolG();
        
        a.ingresar(null,new NodoG(0,"A"));
        
        NodoG n=a.traer(0);
        a.ingresar(n,new NodoG(1,"B"));
        a.ingresar(n,new NodoG(2,"C"));
        a.ingresar(n,new NodoG(3,"D"));
        a.ingresar(n,new NodoG(4,"E"));
        
        //JOptionPane.showMessageDialog(null,n.toString());
        
        n=a.traer(1);
        a.ingresar(n,new NodoG(5,"F"));
        //JOptionPane.showMessageDialog(null,n.toString());
        
        n=a.traer(5);
        a.ingresar(n,new NodoG(6,"G"));
        a.ingresar(n,new NodoG(7,"A"));
        
        n=a.traer(7);
        JOptionPane.showMessageDialog(null,"A "+n.toString());
        
        JOptionPane.showMessageDialog(null,"Final");
    }
}