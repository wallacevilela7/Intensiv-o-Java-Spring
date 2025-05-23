package tech.wvs.dslistbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wvs.dslistbackend.dto.GameListDto;
import tech.wvs.dslistbackend.dto.GameMinDto;
import tech.wvs.dslistbackend.service.GameListService;
import tech.wvs.dslistbackend.service.GameService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/lists")
public class GameListController {

    private final GameListService gameListService;
    private final GameService gameService;

    public GameListController(GameListService gameListService, GameService gameService) {
        this.gameListService = gameListService;
        this.gameService = gameService;
    }

    @GetMapping()
    public ResponseEntity<List<GameListDto>> findAll() {
        return ResponseEntity.ok(gameListService.findAll());
    }

    @GetMapping(path = "/{listId}/games")
    public ResponseEntity<List<GameMinDto>> findByList(@PathVariable("listId") Long listId) {
        return ResponseEntity.ok(gameService.findByList(listId));
    }
}
