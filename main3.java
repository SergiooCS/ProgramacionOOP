public class Main{
    public static void main(String [] args){
          Subclase1 subclase1=new Subclase1(20,7.95f,true);
          String mensaje=subclase1.informar(" Cliente");
          System.out.println(mensaje);
          //subclase1.setUnidades(20);
          //subclase1.setPrecio(7.95f);
          //subclase1.setAprobado(true);
          
          System.out.println(subclase1.getUnidades());
          System.out.println(subclase1.getPrecio());
          System.out.println(subclase1.getAprobado());
    }
}
