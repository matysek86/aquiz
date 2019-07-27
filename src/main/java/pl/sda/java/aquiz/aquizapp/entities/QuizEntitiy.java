package pl.sda.java.aquiz.aquizapp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuizEntitiy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idQuiz;

    private String titleQuiz;
    private String descriptQuiz;
    private LocalDate addData;
    private LocalDate lastUseData;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="quizid")
    private Collection<QuestionEntity> questions;





}
