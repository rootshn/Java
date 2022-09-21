package oop1;

public class Main {

    public static void main(String[] args) {
        //String mesaj = "Vade oranı";

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("Image1.jpg");

        Product product2 = new Product();

        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("Image1.jpg");

        Product product3 = new Product();

        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("Image1.jpg");
        Product[] products = {product1, product2, product3};

        System.out.println("<ul>"); //html ürettik daha iyi anlayalım diye görmek amacıyla
        for (Product product : products) {
            System.out.println("<li>" +product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("23232332332");
        individualCustomer.setCustomerNumber("32312");
        individualCustomer.setLastName("Şahin");
        individualCustomer.setFirstName("Berkay");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("rootshn.io");
        corporateCustomer.setPhone("053325225");
        corporateCustomer.setTaxNumber("111111");
        corporateCustomer.setCustomerNumber("325235");

        Customer[] customers = {individualCustomer,corporateCustomer};




    }

}

