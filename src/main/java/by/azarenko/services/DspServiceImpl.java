package by.azarenko.services;

import by.azarenko.dao.DspDao;
import by.azarenko.model.Dsp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DspServiceImpl implements DspService{
    private DspDao dspDao;

    @Override
    @Transactional
    public void add(Dsp dsp) {
        this.dspDao.add(dsp);
    }

    @Override
    @Transactional
    public void remove(int number) {
        this.dspDao.remove(number);
    }

    @Override
    @Transactional
    public void update(Dsp dsp) {
        this.dspDao.update(dsp);
    }

    @Override
    public void edit(Dsp dsp) {

    }

    @Override
    @Transactional
    public Dsp getDspByNumber(int number) {
        return this.dspDao.getDspByNumber(number);
    }

    @Override
    @Transactional
    public List<Dsp> dspMap() {
        return this.dspDao.dspMap();
    }

    public void setDspDao(DspDao dspDao) {
        this.dspDao = dspDao;
    }
}
