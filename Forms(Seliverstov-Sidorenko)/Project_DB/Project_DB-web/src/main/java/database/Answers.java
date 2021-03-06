package database;
// Generated 15.07.2016 9:53:11 by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Answers generated by hbm2java
 */
@Entity
@Table(name="answers"
    ,catalog="practice_project"
)
public class Answers  implements java.io.Serializable {


     private AnswersId id;
     private Questions questions;

    public Answers() {
    }

    public Answers(AnswersId id, Questions questions) {
       this.id = id;
       this.questions = questions;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="iditem", column=@Column(name="iditem", nullable=false) ), 
        @AttributeOverride(name="answer", column=@Column(name="answer", nullable=false, length=64) ) } )
    public AnswersId getId() {
        return this.id;
    }
    
    public void setId(AnswersId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="iditem", nullable=false, insertable=false, updatable=false)
    public Questions getQuestions() {
        return this.questions;
    }
    
    public void setQuestions(Questions questions) {
        this.questions = questions;
    }




}


