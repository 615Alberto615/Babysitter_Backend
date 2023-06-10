package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.BabysitterDto;
import com.softbabysi.demo.Dto.BabysitterListDto;
import com.softbabysi.demo.dao.BabySitterRepository;
import com.softbabysi.demo.dao.BabysitterDao;
import com.softbabysi.demo.dao.UserRepository;
import com.softbabysi.demo.entity.Babysitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BabysitterBl {
    @Autowired
    private BabysitterDao babySitterDao;

    @Autowired
    private BabySitterRepository babySitterRepository;

    @Autowired
    private UserRepository userRepository;
    public List<BabysitterDto> getAllBabysitter(){
        List<Babysitter> babysitters=babySitterDao.getAllBabysitter();

        List<BabysitterDto> res= new ArrayList<>();
        babysitters.forEach(babysitter -> {
            res.add(new BabysitterDto(babysitter.getBabysitterId(),babysitter.getUser().getUserId(),babysitter.getBabysitterStatus(),babysitter.getBabysitterCI(),
                    babysitter.getBabysitterExtension(),babysitter.getBabysitterPhoneContact(),
                    babysitter.getBabysitterDescription(),babysitter.getBabysitterVerify()));
        });
        return res;
    }


    // Todas las niñeras con estatus true
    public List<Babysitter> findAllBabysitterStatus(){
        List<Babysitter> babysitters =babySitterRepository.findAllBabysitterStatus();
        return babysitters;
    }

    //Todas las niñeras para la Lista de niñeras
    public List<BabysitterListDto> getBabysittersData(){
        List<BabysitterListDto> babysitters = userRepository.getBabysiiterData();
        //System.out.println(babysitters);
        return babysitters;
    }




    //saveAndFlush



    /*public BabysitterDto saveBabysitter(BabysitterDto babysitterDto){
        Babysitter babysitter=new Babysitter();
        babysitter.setBabysitterId(babysitterDto.getBabysitterId());
        babysitter.setBabysitterStatus(true);
        babysitter.setBabysitterCI(babysitterDto.getBabysitterCi());
        babysitter.setBabysitterExtension(babysitterDto.getBabysitterExtension());
        babysitter.setBabysitterPhoneContact(babysitterDto.getBabysitterPhoneContact());
        babysitter.setBabysitterDescription(babysitterDto.getBabysitterDescription());
        babysitter.setBabysitterVerify(false);
        babysitter.setUser(babySitterDao.getUserById(babysitterDto.getUserId()));
        babysitter=babySitterDao.saveAndFlush(babysitter);
        babysitterDto.setBabysitterId(babysitter.getBabysitterId());
        return babysitterDto;
    }*/



    /*
    Documents

     */
}
