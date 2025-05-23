package tech.wvs.dslistbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.wvs.dslistbackend.entity.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
