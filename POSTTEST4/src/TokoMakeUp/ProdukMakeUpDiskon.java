// File: ProdukMakeUpDiskon.java
package TokoMakeUp;

public class ProdukMakeUpDiskon extends ProdukMakeUp {
    private double diskon;

    public ProdukMakeUpDiskon(String namaProduk, double harga, double diskon) {
        super(namaProduk, harga);
        this.diskon = diskon;
    }

    @Override
    public String toString() {
        return "[Produk Diskon] " + super.toString() + ", Diskon: " + diskon + "%";
    }
}
