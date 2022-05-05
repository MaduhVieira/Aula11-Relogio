package Polimorfismo;

public class RelogioPonto {
    public static void main(String[] args){

        ControlePonto cp = new ControlePonto();
        //Objeto Gerente
        Gerente g = new Gerente();
        g.setMatricula(1);
        g.setNome("Guilherme");
        //Objeto Secretario
        Secretario s = new Secretario();
        s.setMatricula(2);
        s.setNome("Cristiana");
        //Objeto Telefonista
        Telefonista t = new Telefonista();
        t.setMatricula(3);
        t.setNome("Pedro");

        cp.resgistraEntrada(g);
        cp.resgistraEntrada(s);
        cp.resgistraEntrada(t);
        cp.registraSaida(t);
        cp.registraSaida(s);
        cp.registraSaida(g);

        g.almocar("Macarrão");

    }
}

