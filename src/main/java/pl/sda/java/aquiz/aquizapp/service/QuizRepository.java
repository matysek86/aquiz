package pl.sda.java.aquiz.aquizapp.service;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.java.aquiz.aquizapp.entities.QuizEntitiy;

public interface QuizRepository extends JpaRepository <QuizEntitiy, Long> {
}
