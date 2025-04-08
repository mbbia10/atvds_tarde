
public class Main {
    public static void main(String[] args) {
         Quadrado  q1 = new Quadrado();//objetos dos construtores
         Triangulo t1 = new Triangulo();
       t1.setAltura(10);
       t1.setBase(10);
       q1.setAltura(10);
       q1.setBase(10);
       System.err.println(q1.calcularArea());
       System.err.println(t1.areat());

    }
}
