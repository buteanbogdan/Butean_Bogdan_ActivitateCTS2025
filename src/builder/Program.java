package builder;

public class Program {
    public static void main(String[] args) {
        BicicletaBuilder builder = new BicicletaBuilder();
        Bicicleta bicicleta1= builder.setCuloare("albastru").setAreSonerie(true).setGreutate(14.5f).setMaterial("carbon").setNrViteze(24).build();
        System.out.println(bicicleta1);
    }
}
