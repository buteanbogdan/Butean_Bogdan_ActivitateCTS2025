package builder;

public class Bicicleta {
    private int nrViteze;
    private String culoare;
    private float greutate;
    private String material;
    private boolean areSonerie;


    public Bicicleta(int nrViteze, String culoare, float greutate, String material, boolean areSonerie) {
        super();
        this.nrViteze = nrViteze;
        this.culoare = culoare;
        this.greutate = greutate;
        this.material = material;
        this.areSonerie = areSonerie;
    }

    public int getNrViteze() {
        return nrViteze;
    }

    void setNrViteze(int nrViteze) {
        this.nrViteze = nrViteze;
    }

    public String getCuloare() {
        return culoare;
    }

    void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public float getGreutate() {
        return greutate;
    }

    void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    public String getMaterial() {
        return material;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    public boolean isAreSonerie() {
        return areSonerie;
    }

    void setAreSonerie(boolean areSonerie) {
        this.areSonerie = areSonerie;
    }

    @Override
    public String toString() {
    return "Bicicleta [nrViteze=" + nrViteze + ", culoare=" + culoare + ", greutate=" + greutate + ", material=" + material + ", sonerie=" + areSonerie + "]";
    }
}
