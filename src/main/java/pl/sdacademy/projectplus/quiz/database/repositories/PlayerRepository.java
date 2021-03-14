package pl.sdacademy.projectplus.quiz.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.projectplus.quiz.database.entities.PlayerEntity;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}
