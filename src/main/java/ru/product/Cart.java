package ru.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class Cart {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public void cartControl() throws IOException {
        String b;
        while (true){

        }
    }

    public void deleteProduct() throws IOException {
        System.out.println("Введите id товара для удаления");
        int a = Integer.parseInt(reader.readLine());
        for (int i = 0; i < ProductRepository.productList.size(); i++) {
            if(a == ProductRepository.productList.get(i).getId()){
                ProductRepository.productList.remove(i);
                System.out.println("Товар удален");
            }
        }
    }

    public void addProduct() throws IOException {
        int id;
        String name;
        double price;
        System.out.println("Введите id товара");
        id = Integer.parseInt(reader.readLine());
        System.out.println("Введите name товара");
        name = reader.readLine();
        System.out.println("Введите цену товара");
        price = Double.parseDouble(reader.readLine());

        ProductRepository.productList.add(new Product(id, name, price));
        System.out.println("Товар успешно добавлен");
    }


}
