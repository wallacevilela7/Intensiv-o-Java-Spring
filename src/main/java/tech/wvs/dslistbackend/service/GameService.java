package tech.wvs.dslistbackend.service;

import org.springframework.stereotype.Service;
import tech.wvs.dslistbackend.dto.GameMinDto;
import tech.wvs.dslistbackend.repository.GameRepository;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<GameMinDto> findAll() {
        return gameRepository.findAll()
                .stream()
                .map(GameMinDto::new)
                .toList();
    }
}
