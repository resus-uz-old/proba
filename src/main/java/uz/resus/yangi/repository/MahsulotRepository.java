package uz.resus.yangi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository;
import org.springframework.stereotype.Repository;
import uz.resus.yangi.entity.Mahsulot;

import java.util.List;

@Repository
public interface MahsulotRepository extends JpaRepository<Mahsulot, Long> {
        List<Mahsulot> findAll();
}
