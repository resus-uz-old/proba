package uz.resus.yangi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.resus.yangi.entity.Mahsulot;
import uz.resus.yangi.repository.MahsulotRepository;
import uz.resus.yangi.service.MahsulotService;

import java.util.List;

@Service
public class MahsulotServiceImpl implements MahsulotService {

    @Autowired
    MahsulotRepository mahsulotRepository;


    @Override
    public List<Mahsulot> getAll() {
        return mahsulotRepository.findAll();
    }

    @Override
    public Page<Mahsulot> getAll(Pageable pageable) {
        return mahsulotRepository.findAll(pageable);
    }

    @Override
    public Mahsulot add(Mahsulot data) throws Exception {
        if(data.getId() == null)
        return mahsulotRepository.save(data);
        else
            throw new Exception("Yangi qo'shiluvchida id bo'lmaydi");
    }

    @Override
    public Mahsulot update(Mahsulot data) throws Exception {
        if(data.getId() != null)
            return mahsulotRepository.save(data);
        else
            throw new Exception("O'zgaruvchida id bo'lishi shart");
    }

    @Override
    public void delete(Mahsulot data) {
        deleteById(data.getId());
    }

    @Override
    public void deleteById(Long id) {
        mahsulotRepository.deleteById(id);
    }
}
