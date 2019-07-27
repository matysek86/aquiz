package pl.sda.java.aquiz.aquizapp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idQuestion;

    private String questionText;
    private Integer questionPoints;

    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "questionid")
    private Collection<AnswerEntity> answers;




}
