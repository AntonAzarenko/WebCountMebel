package by.azarenko.services;

import by.azarenko.model.Dsp;

import java.util.List;

public interface DspService {
    void add(Dsp dsp);

    void remove(int number);

    void update(Dsp dsp);

    void edit(Dsp dsp);

    Dsp getDspByNumber(int number);

    List<Dsp> dspMap();
}
