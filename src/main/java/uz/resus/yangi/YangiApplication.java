package uz.resus.yangi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uz.resus.yangi.entity.Mahsulot;
import uz.resus.yangi.service.MahsulotService;

@SpringBootApplication
public class YangiApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(YangiApplication.class, args);
    }


    @Autowired
    MahsulotService mahsulotService;
    @Override
    public void run(ApplicationArguments args) throws Exception {

        for (int i = 0; i < 100; i++) {
            Mahsulot m = new Mahsulot();
            m.setNom("Olma " + i);
            m.setNarx(7*i);
            mahsulotService.add(m);


        }


    }
}
