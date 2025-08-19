package one.digitalinnovation.gof;
/*Sigleton Preguiçoso*/
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia(){
        return  instancia;
    }
}

