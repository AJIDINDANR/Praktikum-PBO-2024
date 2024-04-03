// File: ProdukMakeUpBiasa.java
package TokoMakeUp;

public class ProdukMakeUpBiasa extends ProdukMakeUp {
    public ProdukMakeUpBiasa(String namaProduk, double harga) {
        super(namaProduk, harga);
    }

    @Override
    public String toString() {
        return "[Produk Biasa] " + super.toString();
    }
}
