package com.patrickerson.busca_binaria;

import com.patrickerson.busca_binaria.classes.BuscadorBinario;

public class Main {


    static BuscadorBinario buscadorBinario = new BuscadorBinario();

    public static void  main(String args[]){
        int dados[] = {10, 12, 14, 15, 22, 37};
        int value = buscadorBinario.busca_binaria(dados, 12, 0, dados.length);
        System.out.println(value);


    }
}
