package prototype;

import java.util.ArrayList;

public class ContractParty extends AContract {
    public ContractParty() {
        System.out.println("Incarcare contract party DIN BD");
        this.listaClauze = new ArrayList();
        this.listaClauze.add("clauza 1 party");
        this.listaClauze.add("clauza 2 party");
        this.tip = "party";
    }

    void printare() {
        System.out.println("Contract de tip " + this.tip);
    }

    public AContract clone() {
        AContract clone = super.clone();
        clone.listaClauze = new ArrayList();

        for(int i = 0; i < this.listaClauze.size(); ++i) {
            clone.listaClauze.add(new String((String)this.listaClauze.get(i)));
        }

        return clone;
    }
}