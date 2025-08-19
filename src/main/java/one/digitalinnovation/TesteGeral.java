package one.digitalinnovation;

import one.digitalinnovation.Comportamental.*;
import one.digitalinnovation.Criacional.SingletonEager;
import one.digitalinnovation.Criacional.SingletonLazy;
import one.digitalinnovation.Criacional.SingletonLazyHolder;

public class TesteGeral {
    public static void main(String[] args) {
        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy
        Comportamento passifico = new ComportamentoPassifico();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(passifico);
        robo.mover();

    }
}
