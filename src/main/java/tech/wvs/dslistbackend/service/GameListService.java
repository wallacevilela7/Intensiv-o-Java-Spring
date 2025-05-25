package tech.wvs.dslistbackend.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.wvs.dslistbackend.dto.GameListDto;
import tech.wvs.dslistbackend.dto.GameMinDto;
import tech.wvs.dslistbackend.repository.GameListRepository;
import tech.wvs.dslistbackend.repository.GameRepository;
import tech.wvs.dslistbackend.repository.projections.GameMinProjection;

import java.util.List;

@Service
public class GameListService {

    private final GameListRepository gameListRepository;
    private final GameRepository gameRepository;

    public GameListService(GameListRepository gameListRepository, GameRepository gameRepository) {
        this.gameListRepository = gameListRepository;
        this.gameRepository = gameRepository;
    }


    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {
        return gameListRepository.findAll()
                .stream()
                .map(GameListDto::new)
                .toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj = list.remove(sourceIndex);

        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;

        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
