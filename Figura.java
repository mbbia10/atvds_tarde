 public class Figura {//define a classe figura
     private int Altura;// declara a variavel
     private int Base;// declara a variavel
     private int Area;// declara a variavel
    
public int getArea() {//método acessor da area
        return Area;
    }
    public void setArea(int area) { //método modificador da area
        Area = area;
    }
public Figura(int altura, int base) {
        Altura = altura;
        Base = base;
    }
public Figura (){ // meteodo construtur padrão



}
// metodos getters e setters
    public int getAltura() {
        return Altura;
    }
    public void setAltura(int altura) {
        Altura = altura;
    }
    public int getBase() {
        return Base;
    }
    public void setBase(int base) {
        Base = base;
    }

    public int calcularArea (){//segundo construtor
      Area = Base*Altura;
      
      return Area;

    }

}
