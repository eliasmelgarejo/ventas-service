package com.ventas.demo.ventas;

import com.ventas.demo.ventas.entities.Product;
import com.ventas.demo.ventas.entities.ProductCategory;
import com.ventas.demo.ventas.services.ProductCategoryService;
import com.ventas.demo.ventas.services.ProductService;
import com.ventas.demo.ventas.services.shared.ValidationException;
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


        } catch (ValidationException e) {
            e.printStackTrace();
        }

    }
}
