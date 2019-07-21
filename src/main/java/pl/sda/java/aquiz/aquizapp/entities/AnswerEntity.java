package pl.sda.java.aquiz.aquizapp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnswerEntity {

    @Id
    private Long idAnswer;

    private String aswerText;
    private Boolean corectOrNot;


}
