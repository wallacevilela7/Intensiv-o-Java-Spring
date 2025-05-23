package tech.wvs.dslistbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wvs.dslistbackend.dto.GameDto;
import tech.wvs.dslistbackend.dto.GameMinDto;
import tech.wvs.dslistbackend.service.GameService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/games")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping()
    public ResponseEntity<List<GameMinDto>> getAllGames() {
        return ResponseEntity.ok(gameService.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<GameDto> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(gameService.findById(id));
    }
}
