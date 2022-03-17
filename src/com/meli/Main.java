package com.meli;

import com.meli.guardavolume.GuardaVolume;
import com.meli.vestuario.Vestuario;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GuardaVolume guardaVolume = new GuardaVolume();
        List<Vestuario> listaVestuario = new ArrayList<>();
        List<Vestuario> listaVestuario2 = new ArrayList<>();

        listaVestuario.add(new Vestuario("Louis Vitton", "Jeans"));
        listaVestuario.add(new Vestuario("Gucci", "Bolsa"));

        listaVestuario2.add(new Vestuario("Prada", "Blusa"));
        listaVestuario2.add(new Vestuario("D&G", "Sapato"));

        Integer codigo = guardaVolume.guardarRoupa(listaVestuario);
        System.out.println(codigo);

        Integer codigo2 = guardaVolume.guardarRoupa(listaVestuario2);
        System.out.println(codigo2);


        guardaVolume.mostrarRoupas();

        System.out.println();
        List<Vestuario> retirada1 = guardaVolume.getRoupas(0);
        retirada1.forEach(System.out::println);

        System.out.println();
        guardaVolume.mostrarRoupas();


    }
}
