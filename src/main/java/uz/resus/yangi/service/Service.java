package uz.resus.yangi.service;

import java.util.List;

public interface Service<Tur, Id> {
    public List<Tur> getAll();
    public Tur add(Tur data) throws Exception;
    public Tur update(Tur data) throws Exception;
    public void delete(Tur data);
    public void deleteById(Id id);
}
