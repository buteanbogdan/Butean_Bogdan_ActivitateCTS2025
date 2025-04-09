package prototype;

import java.util.ArrayList;

public class ContractCorporate extends AContract {
    public ContractCorporate() {
        System.out.println("Incarcare contract corporate din BD");
        this.listaClauze = new ArrayList();
        this.listaClauze.add("clauza 1 corporate");
        this.listaClauze.add("clauza 2 corporate");
        this.tip = "corporate";
    }

    void printare() {
        System.out.println("Contract de tip " + this.tip);
    }
}
