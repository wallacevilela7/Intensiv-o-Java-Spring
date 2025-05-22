package tech.wvs.dslistbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.wvs.dslistbackend.entity.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
