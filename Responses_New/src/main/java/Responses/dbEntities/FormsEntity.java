package Responses.dbEntities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by venedikttsulenev on 14/07/16.
 */
@Entity
@Table(name = "Forms", schema = "Responses", catalog = "")
@IdClass(FormsEntityPK.class)
public class FormsEntity {
    private int id;
    private int questionId;
    private Integer answerId;
    private Date dateSent;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "QuestionID")
    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    @Basic
    @Column(name = "AnswerID", insertable = false, updatable = false)
    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    @Basic
    @Column(name = "DateSent")
    public Date getDateSent() {
        return dateSent;
    }

    public void setDateSent(Date dateSent) {
        this.dateSent = dateSent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FormsEntity that = (FormsEntity) o;

        if (id != that.id) return false;
        if (questionId != that.questionId) return false;
        if (answerId != null ? !answerId.equals(that.answerId) : that.answerId != null) return false;
        if (dateSent != null ? !dateSent.equals(that.dateSent) : that.dateSent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + questionId;
        result = 31 * result + (answerId != null ? answerId.hashCode() : 0);
        result = 31 * result + (dateSent != null ? dateSent.hashCode() : 0);
        return result;
    }
}
