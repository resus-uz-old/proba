package uz.resus.yangi.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface Service<Tur, Id> {
    public List<Tur> getAll();
    public Page<Tur> getAll(Pageable pageable);
    public Tur add(Tur data) throws Exception;
    public Tur update(Tur data) throws Exception;
    public void delete(Tur data);
    public void deleteById(Id id);
}
