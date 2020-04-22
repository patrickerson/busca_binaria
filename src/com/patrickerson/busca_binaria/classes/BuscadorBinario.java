package com.patrickerson.busca_binaria.classes;

public class BuscadorBinario {


    int get_mid(int inicio, int fim){
        double mid_double = (inicio + fim) / 2;
        int mid_int = (int) mid_double;
        return  mid_int;
    }




  public int busca_binaria(int dados[], int x, int inicio, int fim){
        int mid = get_mid(inicio, fim);
        if(dados.length == 1){
            return dados[0];
        }else{
            if (dados[mid] == x){
                return  dados[mid];
            }else {
                if (x < dados[mid]) {
                    return busca_binaria(dados, x, inicio, mid);
                } else {
                    return busca_binaria(dados, x, mid, fim);
                }
            }
        }

  }


}
