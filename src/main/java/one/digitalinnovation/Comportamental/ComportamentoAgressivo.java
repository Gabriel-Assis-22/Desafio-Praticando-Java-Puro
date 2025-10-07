package one.digitalinnovation.Comportamental;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente");
    }
}
//há outras classes de comportamentos que implementam a interface Comportamento