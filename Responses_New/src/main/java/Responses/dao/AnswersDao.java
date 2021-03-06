package Responses.dao;

import Responses.dbEntities.AnswersEntity;
import Responses.utils.HibernateSessionFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnswersDao {

//    @Autowired
//    private SessionFactory sessionFactory;

    public static List<AnswersEntity> getAnswers() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(AnswersEntity.class);
        List<AnswersEntity> answers = criteria.list();
        session.close();
        return answers;
    }

    public static AnswersEntity getAnswerById(Integer answerId) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(AnswersEntity.class);
        criteria.add(Restrictions.eq("id", answerId));
        AnswersEntity answer = (AnswersEntity) criteria.uniqueResult();
        session.close();
        return answer;
    }

//    public static void deleteAnswer(Integer answerId) {
//        Session session = HibernateSessionFactory.getSessionFactory().openSession();
//        AnswersEntity answer = new AnswersEntity();
//        answer.setId(answerId);
//        session.delete(answer);
//        session.getTransaction().commit();
//    }
}
