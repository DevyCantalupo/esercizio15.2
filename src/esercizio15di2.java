public class esercizio15di2 {
    private int cilindrata;
    private String placa;
    private String marca;
    private String modello;

    // Constructor
    public esercizio15di2(int cilindrata, String placa, String marca, String modello) {
        this.cilindrata = cilindrata;
        this.placa = placa;
        this.marca = marca;
        this.modello = modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getPlaca() {
        return placa;
    }

    public void setTarga(String targa) {
        this.placa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public static void main(String[] args) {
        esercizio15di2 auto = new esercizio15di2(1000, "heavymeteal666", "Ford", "Fiesta");

        System.out.println("Cilindrata: " + auto.getCilindrata() + " cc");
        System.out.println("placa: " + auto.getPlaca());
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modello: " + auto.getModello());
    }
}
