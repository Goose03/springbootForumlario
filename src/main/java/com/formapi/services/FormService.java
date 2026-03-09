package com.formapi.services;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.HashMap;

@Service
public class FormService {

    public Map<String, String> processForm(Map<String, Object> formData) {
        Map<String, String> response = new HashMap<>();

        String persona = (String) formData.get("persona");
        Object edad = formData.get("edad");
        String personajeFav = (String) formData.get("personajeFav");
        String correo = (String) formData.get("correo");
        String peliculaFav = (String) formData.get("peliculaFav");

        String resumen = "Persona: " + persona + "\n" +
                         "Edad: " + edad + "\n" +
                         "Personaje Favorito: " + personajeFav + "\n" +
                         "Correo: " + correo + "\n" +
                         "Película Favorita: " + peliculaFav;

        response.put("resumen", resumen);

        return response;
    }
}