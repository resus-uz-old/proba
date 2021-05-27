package uz.resus.yangi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.resus.yangi.entity.Mahsulot;

import java.util.List;

@Repository
public interface MahsulotRepository extends CrudRepository<Mahsulot, Long> {
        List<Mahsulot> findAll();
}
