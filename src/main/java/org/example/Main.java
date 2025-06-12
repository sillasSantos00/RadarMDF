package org.example;

import org.example.insertFactory.insert1;
import org.example.produtos.produtos;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        insert1 insert = new insert1();

        produtos produtos = new produtos("televisao", "aparelho eletronico", new BigDecimal("1000"), 12);

        insert.save(produtos);
    }
}