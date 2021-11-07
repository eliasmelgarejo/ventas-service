package com.ventas.demo.ventas;

import com.ventas.demo.ventas.entities.CategoryDiscountRule;
import com.ventas.demo.ventas.entities.Product;
import com.ventas.demo.ventas.entities.ProductCategory;
import com.ventas.demo.ventas.entities.ProductPrice;
import com.ventas.demo.ventas.services.CategoryDiscountRuleService;
import com.ventas.demo.ventas.services.ProductCategoryService;
import com.ventas.demo.ventas.services.ProductPriceService;
import com.ventas.demo.ventas.services.ProductService;
import com.ventas.demo.ventas.services.shared.ValidationException;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VentasServiceApplication implements CommandLineRunner {

    @Autowired
    private ProductService productService;
    @Autowired
    private ProductCategoryService productCategoryService;
	@Autowired
	private ProductPriceService productPriceService;
	@Autowired
	private CategoryDiscountRuleService categoryDiscountRuleService;


    public static void main(String[] args) {
        SpringApplication.run(VentasServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Cargar datos de prueba
        loadData();
    }

    private void loadData() {
        //Categorias
        try {
			System.out.println("Populate Database. Table product_category...");
            ProductCategory productCategory1 = productCategoryService.create(
                    ProductCategory.builder()
                            .code("EL")
                            .name("Electronicos")
                            .color("#FF0000").build());


            ProductCategory productCategory2 = productCategoryService.create(
                    ProductCategory
                            .builder()
                            .code("HOG")
                            .name("Hogar")
                            .color("#00FF00").build());

            ProductCategory productCategory3 = productCategoryService.create(
                    ProductCategory
                            .builder()
                            .code("VEH")
                            .name("Vehiculos")
                            .color("#0000FF").build());

            ProductCategory productCategory4 = productCategoryService.create(
                    ProductCategory
                            .builder()
                            .code("MUE")
                            .name("Muebles")
                            .color("#FFFF00").build());

			System.out.println("Populate Database. Table product...");
            //Productos
            Product product1 = productService.create(
                    Product.builder()
                            .code("EL1")
                            .name("Televisor")
                            .productCategory(productCategory1).build());
            Product product2 = productService.create(
            		Product.builder()
					        .code("EL2")
					        .name("Computadora")
					        .productCategory(productCategory1).build());
            Product product3 = productService.create(
            		Product.builder()
					        .code("EL3")
					        .name("Celular")
					        .productCategory(productCategory1).build());
            Product product4 = productService.create(
            		Product.builder()
					        .code("HOG1")
					        .name("Sofa")
					        .productCategory(productCategory2).build());
            Product product5 = productService.create(
            		Product.builder()
					        .code("HOG2")
					        .name("Rack de TV")
					        .productCategory(productCategory2).build());
            Product product6 = productService.create(
            		Product.builder()
					        .code("HOG3")
					        .name("Cuadro")
					        .productCategory(productCategory2).build());
            Product product7 = productService.create(
            			Product.builder()
					        .code("VEH1")
					        .name("Carro")
					        .productCategory(productCategory3).build());
            Product product8 = productService.create(
            		Product.builder()
					        .code("VEH2")
					        .name("Moto")
					        .productCategory(productCategory3).build());
            Product product9 = productService.create(
            		Product.builder()
					        .code("VEH3")
					        .name("Bicicleta")
					        .productCategory(productCategory3).build());
            Product product10 = productService.create(
            		Product.builder()
					        .code("MUE1")
					        .name("Silla")
					        .productCategory(productCategory4).build());
            Product product11 = productService.create(
            		Product.builder()
					        .code("MUE2")
					        .name("Mesa")
					        .productCategory(productCategory4).build());
            Product product12 = productService.create(
            		Product.builder()
					        .code("MUE3")
					        .name("Cama")
					        .productCategory(productCategory4).build());

			System.out.println("Populate Database. Table product_price...");
            // Precios
			ProductPrice productPrice1 = productPriceService.create(
					ProductPrice.builder()
					        .product(product1)
					        .minQuantity(1.0)
							.maxQuantity(5.0)
					        .price(120000.0).build());

			ProductPrice productPrice2 = productPriceService.create(
					ProductPrice.builder()
					        .product(product1)
					        .minQuantity(6.0)
					        .maxQuantity(10.0)
					        .price(100000.0).build());

			ProductPrice productPrice3 = productPriceService.create(
					ProductPrice.builder()
					        .product(product2)
					        .minQuantity(1.0)
					        .maxQuantity(5.0)
					        .price(120000.0).build());
			ProductPrice productPrice4 = productPriceService.create(
					ProductPrice.builder()
					        .product(product2)
					        .minQuantity(6.0)
					        .maxQuantity(10.0)
					        .price(100000.0).build());
			ProductPrice productPrice5 = productPriceService.create(
					ProductPrice.builder()
					        .product(product3)
					        .minQuantity(1.0)
					        .maxQuantity(5.0)
					        .price(120000.0).build());
			ProductPrice productPrice6 = productPriceService.create(
					ProductPrice.builder()
					        .product(product3)
					        .minQuantity(6.0)
					        .maxQuantity(10.0)
					        .price(100000.0).build());
			ProductPrice productPrice7 = productPriceService.create(
					ProductPrice.builder()
					        .product(product4)
					        .minQuantity(1.0)
					        .maxQuantity(5.0)
					        .price(120000.0).build());
			ProductPrice productPrice8 = productPriceService.create(
					ProductPrice.builder()
					        .product(product4)
					        .minQuantity(6.0)
					        .maxQuantity(10.0)
					        .price(100000.0).build());
			ProductPrice productPrice9 = productPriceService.create(
					ProductPrice.builder()
					        .product(product5)
					        .minQuantity(1.0)
					        .maxQuantity(5.0)
					        .price(120000.0).build());
			ProductPrice productPrice10 = productPriceService.create(
					ProductPrice.builder()
					        .product(product5)
					        .minQuantity(6.0)
					        .maxQuantity(10.0)
					        .price(100000.0).build());
			ProductPrice productPrice11 = productPriceService.create(
					ProductPrice.builder()
					        .product(product6)
					        .minQuantity(1.0)
					        .maxQuantity(5.0)
					        .price(120000.0).build());
			ProductPrice productPrice12 = productPriceService.create(
					ProductPrice.builder()
					        .product(product6)
					        .minQuantity(6.0)
					        .maxQuantity(10.0)
					        .price(100000.0).build());
			ProductPrice productPrice13 = productPriceService.create(
					ProductPrice.builder()
					        .product(product7)
					        .minQuantity(1.0)
					        .maxQuantity(5.0)
					        .price(120000.0).build());
			ProductPrice productPrice14 = productPriceService.create(
					ProductPrice.builder()
					        .product(product7)
					        .minQuantity(6.0)
					        .maxQuantity(10.0)
					        .price(100000.0).build());
			ProductPrice productPrice15 = productPriceService.create(
					ProductPrice.builder()
					        .product(product8)
					        .minQuantity(1.0)
					        .maxQuantity(5.0)
					        .price(120000.0).build());
			ProductPrice productPrice16 = productPriceService.create(
					ProductPrice.builder()
					        .product(product8)
					        .minQuantity(6.0)
					        .maxQuantity(10.0)
					        .price(100000.0).build());
			ProductPrice productPrice17 = productPriceService.create(
					ProductPrice.builder()
					        .product(product9)
					        .minQuantity(1.0)
					        .maxQuantity(5.0)
					        .price(120000.0).build());
			ProductPrice productPrice18 = productPriceService.create(
					ProductPrice.builder()
					        .product(product9)
					        .minQuantity(6.0)
					        .maxQuantity(10.0)
					        .price(100000.0).build());
			ProductPrice productPrice19 = productPriceService.create(
					ProductPrice.builder()
					        .product(product10)
					        .minQuantity(1.0)
					        .maxQuantity(5.0)
					        .price(120000.0).build());
			ProductPrice productPrice20 = productPriceService.create(
					ProductPrice.builder()
					        .product(product10)
					        .minQuantity(6.0)
					        .maxQuantity(10.0)
					        .price(100000.0).build());
			ProductPrice productPrice21 = productPriceService.create(
					ProductPrice.builder()
					        .product(product11)
					        .minQuantity(1.0)
					        .maxQuantity(5.0)
					        .price(120000.0).build());
			ProductPrice productPrice22 = productPriceService.create(
					ProductPrice.builder()
					        .product(product11)
					        .minQuantity(6.0)
					        .maxQuantity(10.0)
					        .price(100000.0).build());
			ProductPrice productPrice23 = productPriceService.create(
					ProductPrice.builder()
					        .product(product12)
					        .minQuantity(1.0)
					        .maxQuantity(5.0)
					        .price(120000.0).build());
			ProductPrice productPrice24 = productPriceService.create(
					ProductPrice.builder()
					        .product(product12)
					        .minQuantity(6.0)
					        .maxQuantity(10.0)
					        .price(100000.0).build());

			System.out.println("Populate Database. Table category_discount_rule...");
			// Reglas de descuento categorias
			CategoryDiscountRule categoryDiscountRule1 = categoryDiscountRuleService.create(
					CategoryDiscountRule.builder()
					        .category(productCategory1)
							.minQuantity(10.0)
					        .maxQuantity(20.0)
							.discountPercentage(5.0).build());
			CategoryDiscountRule categoryDiscountRule2 = categoryDiscountRuleService.create(
					CategoryDiscountRule.builder()
					        .category(productCategory2)
					        .minQuantity(10.0)
					        .maxQuantity(20.0)
					        .discountPercentage(5.0).build());
			CategoryDiscountRule categoryDiscountRule3 = categoryDiscountRuleService.create(
					CategoryDiscountRule.builder()
					        .category(productCategory3)
					        .minQuantity(10.0)
					        .maxQuantity(20.0)
					        .discountPercentage(5.0).build());
			CategoryDiscountRule categoryDiscountRule4 = categoryDiscountRuleService.create(
					CategoryDiscountRule.builder()
					        .category(productCategory4)
					        .minQuantity(10.0)
					        .maxQuantity(20.0)
					        .discountPercentage(5.0).build());


        } catch (ValidationException e) {
            e.printStackTrace();
        }

    }
}
