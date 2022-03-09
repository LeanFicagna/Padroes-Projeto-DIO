import onde.dio.gof.SingletonEager;
import onde.dio.gof.SingletonHolder;
import onde.dio.gof.SingletonLazy;
import onde.dio.gof.facade.Facade;
import onde.dio.gof.strategy.Comportamento;
import onde.dio.gof.strategy.ComportamentoAgressivo;
import onde.dio.gof.strategy.ComportamentoDefensivo;
import onde.dio.gof.strategy.ComportamentoNormal;
import onde.dio.gof.strategy.Robo;

public class Main {
    public static void main(String[] args) {
        // SingletonLazy lazy = SingletonLazy.getInstancia();
        // System.out.println(lazy);
        // SingletonLazy lazy1 = SingletonLazy.getInstancia();
        // System.out.println(lazy1);

        
        // SingletonEager E = SingletonEager.getInstancia();
        // System.out.println(E);
        // SingletonEager E1 = SingletonEager.getInstancia();
        // System.out.println(E1);
        
        // SingletonHolder H = SingletonHolder.getInstancia();
        // System.out.println(H);
        // SingletonHolder H1 = SingletonHolder.getInstancia();
        // System.out.println(H1);
    
    
        // Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
    
        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // FACADE

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");
    }
}
