package pl.sda.java.aquiz.aquizapp.service;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.java.aquiz.aquizapp.entities.QuestionnaireEntity;


public interface QuestionnaireRepository extends JpaRepository <QuestionnaireEntity, Long>
{

}

