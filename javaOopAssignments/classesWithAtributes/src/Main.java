public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Monster");
        product.setPrice(13000);
        product.setStockAmount(3);
        product.setRenk("Siyah");

        ProductManager productManager = new ProductManager();

        productManager.Add(product);


        System.out.println(product.getKod());
    }
}
