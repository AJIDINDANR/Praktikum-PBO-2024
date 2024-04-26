// File: ProdukMakeUpDiskon.java
package TokoMakeUp;

public class ProdukMakeUpDiskon extends ProdukMakeUp {
    private double diskon;
  
    public ProdukMakeUpDiskon(String namaProduk, double harga, double diskon) {
      super(namaProduk, harga);
      this.diskon = diskon;
    }
  
    public double getDiskon() {
      return diskon;
    }
  
    // You can add methods to calculate discounted price, etc.
  }
  