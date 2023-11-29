public class Test2
{
    public static void main(String args[])
    {
        ArbolG a=new ArbolG();
        
        a.ingresar(null,new NodoG(0,"A"));
        a.ingresar(a.traer(0),new NodoG(1,"B"));
        a.ingresar(a.traer(0),new NodoG(2,"C"));
        a.ingresar(a.traer(0),new NodoG(3,"D"));
        a.ingresar(a.traer(1),new NodoG(4,"E"));
        a.ingresar(a.traer(1),new NodoG(5,"F"));
        a.ingresar(a.traer(4),new NodoG(6,"G"));
        a.ingresar(a.traer(4),new NodoG(7,"H"));
        //a.ingresar(a.traer(7),new NodoG(8,"J"));
        //a.ingresar(a.traer(7),new NodoG(9,"K"));
        //a.ingresar(a.traer(7),new NodoG(10,"L"));
        
        a.inorden();
        javax.swing.JOptionPane.showMessageDialog(null,a.msg);
    }
}