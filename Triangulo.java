public class Triangulo extends Figura { // fala que o Triangulo é "filho" de figura
private int areT;

//getters e setters
public int getAreT() {
    return areT;
}

public void setAreT(int areT) {
    this.areT = areT;
}

  public Triangulo(){//método construtor padrão

    super();

  }
   
public int areat(){//segundo método construtor
     areT = (calcularArea())/2;
    return areT;

}


}

