package herança;

public class Polimorfismo {
    int valor;
    int quantia;

    public int exec() {
    while(valor<quantia){
        valor += 1;
    }
        int multi = valor/quantia;
        return multi;
    }
}
