public class esercizio15di2 {
    public int cilindrata;
    public String placa;
    public String marca;
    public String modello;

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
        esercizio15di2 auto = new esercizio15di2(4000, "EU23434", "Toyota", "4runner");

        System.out.println("Cilindrata: " + auto.getCilindrata());
        System.out.println("placa: " + auto.getPlaca());
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modello: " + auto.getModello());
    }
}
