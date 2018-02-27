package by.azarenko.dao;

import by.azarenko.model.Dsp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DspDaoImpl implements DspDao {

    private static final Logger logger =  LoggerFactory.getLogger(DspDaoImpl.class); //для логирования
    private SessionFactory sessionFactory; //сессия для соединения с базой данных

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(Dsp dsp) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(dsp);
        logger.info("Detail DSP successfully saved. Detail: " + dsp);
    }

    @Override
    public void remove(int number) {
        Session session = sessionFactory.getCurrentSession();
        Dsp dsp = (Dsp) session.load(Dsp.class,number);
        if(dsp != null){
            session.delete(dsp);
        }
        logger.info("Dsp successfully removed. Detail dsp:" + dsp);
    }

    @Override
    public void update(Dsp dsp) {
        Session session = sessionFactory.getCurrentSession();
        session.update(dsp);
    }

    @Override
    public void edit(Dsp dsp) {
    }

    @Override
    public Dsp getDspByNumber(int number) {
        Session session = sessionFactory.getCurrentSession();
        Dsp dsp = (Dsp) session.load(Dsp.class, number);
        return dsp;

    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Dsp> dspMap() {
        Session session = sessionFactory.getCurrentSession();
        List<Dsp> dspList = session.createQuery("from Dsp").list();
        return dspList;
    }
}
