package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.BabysitterDto;
import com.softbabysi.demo.dao.BabySitterRepository;
import com.softbabysi.demo.dao.BabysitterDao;
import com.softbabysi.demo.entity.Babysitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BabysitterBl {
    @Autowired
    private BabysitterDao babySitterDao;
    public List<BabysitterDto> getAllBabysitter(){
        List<Babysitter> babysitters=babySitterDao.getAllBabysitter();

        List<BabysitterDto> res= new ArrayList<>();
        babysitters.forEach(babysitter -> {
            res.add(new BabysitterDto(babysitter.getBabysitterId(),babysitter.getUser().getUserId(),
                    babysitter.getBabysitterUrl(),babysitter.getBabysitterStatus(),babysitter.getBabysitterCI(),
                    babysitter.getBabysitterExtension(),babysitter.getBabysitterProfilePhoto(),babysitter.getBabysitterPhoneContact(),
                    babysitter.getBabysitterDescription(),babysitter.getBabysitterVerify()));
        });
        return res;
    }
    //saveAndFlush


    /*
    Documents

     */
}
