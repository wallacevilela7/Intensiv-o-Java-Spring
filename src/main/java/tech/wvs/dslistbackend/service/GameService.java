package tech.wvs.dslistbackend.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.wvs.dslistbackend.dto.GameDto;
import tech.wvs.dslistbackend.dto.GameMinDto;
import tech.wvs.dslistbackend.repository.GameRepository;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }


    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        return gameRepository.findAll()
                .stream()
                .map(GameMinDto::new)
                .toList();
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long id) {
        return gameRepository
                .findById(id)
                .map(GameDto::new)
                .orElseThrow(() -> new RuntimeException("Game not found"));
    }
}
