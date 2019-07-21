package pl.sda.java.aquiz.aquizapp.entities;


import lombok.*;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class QuestionnaireEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idQuestionnaire;

    private String titleQnnaire;
    private String descript;
    private LocalDate addData;
    private LocalDate lastUseData;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idQuestion")
    private List<QuestionEntity> questionEntityList;

//    @OneToMany(mappedBy = "questionnaireEntity", cascade = CascadeType.ALL)
//    @JoinColumn(name = "idAnswer")
//    private List<AnswerEntity> answerEntityList;




















}
