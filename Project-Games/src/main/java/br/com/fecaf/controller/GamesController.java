package br.com.fecaf.controller;

import br.com.fecaf.model.Games;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/games")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class GamesController {

    private List<Games> games = new ArrayList<>();

    @PostConstruct
    public void carregarJson () {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());
            InputStream inputStream = getClass().getResourceAsStream("/data/Games.json");
            games = objectMapper.readValue(inputStream, new TypeReference<List<Games>>() {});
        } catch (Exception e) {
            System.out.println("Erro ao carregar Games.json" + e.getMessage());
        }
    }

    //Listar Todos os Jogos
    @GetMapping
    public List<Games> listarGames() {
        return games;
    }

    //Busca por ID
    @GetMapping("/{id}")
    public Games buscaId (@PathVariable int id) {
        Optional<Games> jogoEncontrado = games.stream().filter(games -> games.getId() == id).findFirst();
        if (jogoEncontrado.isPresent()){
            return jogoEncontrado.get();
        } throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ID" + id + "não encontrado!!!!");
    }





}
