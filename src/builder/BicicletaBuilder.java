package builder;

public class BicicletaBuilder implements IBuilder{

    private int nrViteze;
    private String culoare;
    private float greutate;
    private String material;
    private boolean areSonerie;


    public BicicletaBuilder() {
        super();
        this.nrViteze = 0;
        this.culoare = "Necunoscuta";
        this.greutate = 0;
        this.material = "Necunoscut";
        this.areSonerie = false;
    }

    @Override
    public Bicicleta build() {
        return new Bicicleta(nrViteze, culoare, greutate, material, areSonerie);
    }

    public BicicletaBuilder setNrViteze (int nrViteze){
        this.nrViteze=nrViteze;
        return this;
    }

    public BicicletaBuilder setCuloare (String culoare){
        this.culoare=culoare;
        return this;
    }

    public BicicletaBuilder setGreutate (float greutate){
        this.greutate=greutate;
        return this;
    }

    public BicicletaBuilder setMaterial (String material){
        this.material=material;
        return this;
    }

    public BicicletaBuilder setAreSonerie (boolean areSonerie){
        this.areSonerie=areSonerie;
        return this;
    }
}
