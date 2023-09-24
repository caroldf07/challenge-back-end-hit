package com.example.demo.controller;

import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.IOException;
import java.util.*;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PlanetaController {

  List<String> listaPaginas = new ArrayList<>();

  @GetMapping
  public List<String> listaPlanetas() throws UnirestException, IOException {

    for (int pagina = 1; pagina < 7; pagina++) {

      HttpResponse<JsonNode> jsonResponse =
          Unirest.get("https://swapi.dev/api/planets/?page=" + pagina).asJson();

      JSONObject json = jsonResponse.getBody().getObject();
      listaPaginas.add(json.toString());
    }

    // JSONObject json = jsonResponse.getBody().getObject();
    return listaPaginas;
  }
}
