package pl.sda.java.aquiz.aquizapp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idQuestion;

    @ManyToOne
    @JoinColumn(name="idQuestionnaire")
    QuestionnaireEntity questionnaireEntity;

    private String questionText;
    private Integer questionPoints;



}
