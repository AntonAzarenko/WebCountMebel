package by.azarenko.dao;

import by.azarenko.model.Dsp;

import java.util.List;

public interface DspDao {
    void add(Dsp dsp);

    void remove(int number);

    void update(Dsp dsp);

    void edit(Dsp dsp);

    Dsp getDspByNumber(int number);

    List<Dsp> dspMap();



}
