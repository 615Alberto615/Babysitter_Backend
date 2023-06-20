package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.RegisterCodeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterCodeBl {

    @Autowired
    EmailSenderBl emailSenderBl;

    //enviar el mensaje de correo con el codigo de registro
    public void createRegisterCode(RegisterCodeDto registerCodeDto){
        //Mensaje de verificacion
        String subject = "Bienvenido a ASAPsitter!!!";
        String text = "Hola, gracias por registrarte en ASAPsitter, tu codigo de verificacion es: " + registerCodeDto.getCodigo();
        emailSenderBl.sendEmail(registerCodeDto.getCorreo(), subject, text);

    }
}
