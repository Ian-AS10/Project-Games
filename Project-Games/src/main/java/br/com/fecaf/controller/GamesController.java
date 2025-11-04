package br.com.fecaf.controller;

import br.com.fecaf.model.Games;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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

    @GetMapping
    public List<Games> listarGames() {
        return games;
    }





}
