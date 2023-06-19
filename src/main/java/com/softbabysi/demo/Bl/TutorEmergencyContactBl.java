package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.TutorEmergencyContactDto;
import com.softbabysi.demo.dao.TutorEmergencyContactRepository;
import com.softbabysi.demo.entity.Tutor;
import com.softbabysi.demo.entity.TutorEmergencyContact;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TutorEmergencyContactBl {
    @Autowired
    private TutorEmergencyContactRepository tutorEmergencyContactRepository;
    //Guardar contacto de emergencia
    @Transactional
    public void createTutorEmergencyContact(TutorEmergencyContactDto tutorEmergencyContactDto){
        TutorEmergencyContact tutorEmergencyContact = new TutorEmergencyContact();
        Tutor tutor = new Tutor();
        tutor.setTutorId(tutorEmergencyContactDto.getTutorId());
        tutorEmergencyContact.setTutor(tutor);
        tutorEmergencyContact.setNameContact(tutorEmergencyContactDto.getNameContact());
        tutorEmergencyContact.setPhoneContact(tutorEmergencyContactDto.getPhoneContact());
        tutorEmergencyContactRepository.save(tutorEmergencyContact);
    }

    //Mostrar contactos de emergencia por id tutor
    public List<TutorEmergencyContactDto> findTutorEmergencyContact(Integer id){
        List<TutorEmergencyContact> tutorEmergencyContact = tutorEmergencyContactRepository.findTutorEmergencyContactByTutorId(id);
        List<TutorEmergencyContactDto> tutorEmergencyContactDto = new ArrayList<>();
        for (TutorEmergencyContact tutorEmergencyContact1 : tutorEmergencyContact){
            TutorEmergencyContactDto tutorEmergencyContactDto1 = new TutorEmergencyContactDto();
            tutorEmergencyContactDto1.setTutorEmergencyContactId(tutorEmergencyContact1.getTutorEmergencyContactId());
            tutorEmergencyContactDto1.setTutorId(tutorEmergencyContact1.getTutor().getTutorId());
            tutorEmergencyContactDto1.setNameContact(tutorEmergencyContact1.getNameContact());
            tutorEmergencyContactDto1.setPhoneContact(tutorEmergencyContact1.getPhoneContact());
            tutorEmergencyContactDto.add(tutorEmergencyContactDto1);
        }
        return tutorEmergencyContactDto;
    }

    //Eliminar por id
    @Transactional
    public void deleteTutorEmergencyContact(Integer id){
        tutorEmergencyContactRepository.deleteById(id);
    }
}
