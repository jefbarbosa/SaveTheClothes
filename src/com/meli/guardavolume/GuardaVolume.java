package com.meli.guardavolume;

import com.meli.vestuario.Vestuario;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolume {
    private Map<String, List<Vestuario>> volumes = new HashMap<>();
    private Integer contador = 0;

    public GuardaVolume() {

    }

    public Integer guardarRoupa(List<Vestuario> listaDeVestuario) {
        volumes.put(String.valueOf(contador) , listaDeVestuario);
        return contador++;
    }

    public void mostrarRoupas() {
        volumes.forEach((s, vestuarios) -> System.out.println(s + " " + vestuarios));
    }

    public List<Vestuario> getRoupas(Integer numero) {
        List<Vestuario> vestuariosRetirada = volumes.get(String.valueOf(numero));
        volumes.remove(String.valueOf(numero));

        return  vestuariosRetirada;
    }
}
