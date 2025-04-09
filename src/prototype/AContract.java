package prototype;

import java.util.ArrayList;

public abstract class AContract implements Cloneable {
    private String id;
    protected String tip;
    protected ArrayList<String> listaClauze;

    public AContract() {
    }

    public void modifListaClauze(int i, String clauzaNoua) {
        this.listaClauze.set(i, clauzaNoua);
    }

    abstract void printare();

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTip() {
        return this.tip;
    }

    public ArrayList<String> getListaClauze() {
        return this.listaClauze;
    }

    public String toString() {
        String var10000 = this.id;
        return "AContract [id=" + var10000 + ", tip=" + this.tip + ", listaClauze=" + String.valueOf(this.listaClauze) + "]";
    }

    public AContract clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException var3) {
            var3.printStackTrace();
        }

        return (AContract)clone;
    }
}