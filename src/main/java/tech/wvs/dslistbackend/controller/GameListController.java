package tech.wvs.dslistbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wvs.dslistbackend.dto.GameListDto;
import tech.wvs.dslistbackend.service.GameListService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/lists")
public class GameListController {

    private final GameListService gameListService;

    public GameListController(GameListService gameListService) {
        this.gameListService = gameListService;
    }

    @GetMapping()
    public ResponseEntity<List<GameListDto>> findAll() {
        return ResponseEntity.ok(gameListService.findAll());
    }
}
