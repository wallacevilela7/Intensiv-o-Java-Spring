package tech.wvs.dslistbackend.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.wvs.dslistbackend.dto.GameListDto;
import tech.wvs.dslistbackend.repository.GameListRepository;

import java.util.List;

@Service
public class GameListService {

    private final GameListRepository gameListRepository;

    public GameListService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }


    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {
        return gameListRepository.findAll()
                .stream()
                .map(GameListDto::new)
                .toList();
    }
}
