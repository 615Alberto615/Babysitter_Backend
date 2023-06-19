package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.BabysitterDto;
import com.softbabysi.demo.Dto.BookingDto;
import com.softbabysi.demo.Dto.BookingListDto;
import com.softbabysi.demo.Dto.BookingStatusServiceDto;
import com.softbabysi.demo.dao.BookingDao;
import com.softbabysi.demo.dao.BookingRepository;
import com.softbabysi.demo.dao.NotificationRepository;
import com.softbabysi.demo.dao.TutorRepository;
import com.softbabysi.demo.entity.Babysitter;
import com.softbabysi.demo.entity.Booking;
import com.softbabysi.demo.entity.Notification;
import com.softbabysi.demo.entity.Tutor;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingBl {
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private TutorRepository tutorRepository;

    @Autowired
    private EmailSenderBl emailSenderBl;

    @Autowired
    private NotificationRepository notificationRepository;


    @Transactional
    public void createBooking(BookingDto bookingDto){
        Booking booking = new Booking();
        Notification notification = new Notification();
        String emailBabysitter = tutorRepository.getEmailByBabysitterId(bookingDto.getBabysitterId());
        System.out.println(emailBabysitter);
        Tutor tutor = new Tutor();
        Babysitter babysitter = new Babysitter();
        tutor.setTutorId(bookingDto.getTutorId());
        babysitter.setBabysitterId(bookingDto.getBabysitterId());
        booking.setBabysitter(babysitter);
        booking.setTutor(tutor);
        booking.setBookingChild(bookingDto.getBookingChild());
        booking.setBookingEstimatedTime(bookingDto.getBookingEstimatedTime());
        booking.setBookingTimeStart(bookingDto.getBookingTimeStart());
        booking.setBookingTimeEnd(bookingDto.getBookingTimeEnd());
        booking.setBookingDate(bookingDto.getBookingDate());
        booking.setBookingStatus(bookingDto.getBookingStatus());
        booking.setBookingCompleted(bookingDto.getBookingCompleted());
        booking.setBookingPaid(bookingDto.getBookingPaid());
        booking.setBookingAmount(bookingDto.getBookingAmount());
        bookingRepository.save(booking);
        String asuntoPendiente = "Servicio Pendiente - ASAPsitter";
        String mensajePendiente = "Estimado/a,\n\n" +
                "Le informamos que su solicitud de servicio ha sido recibida y está pendiente de asignación a una niñera en ASAPsitter. Estamos trabajando diligentemente para encontrar la mejor opción para satisfacer sus necesidades.\n\n" +
                "Apreciamos su paciencia y pronto le notificaremos una vez que hayamos asignado una niñera a su solicitud. Si tiene alguna pregunta adicional, no dude en comunicarse con nosotros.\n\n" +
                "Atentamente,\nEl equipo de ASAPsitter";
        //Guarda notificacion
        notification.setBooking(booking);
        notification.setNotificationMessage(asuntoPendiente+" "+mensajePendiente);
        notificationRepository.save(notification);
        // Mensaje 1 (Pendiente)

        emailSenderBl.sendEmail(emailBabysitter, asuntoPendiente, mensajePendiente);

    }

    // Obtener booking por id
    public Booking findBooking(Integer id){
        Booking booking = bookingRepository.findByBookingId(id);
        return booking;
    }

    //Obtener booking por babysitter
    public List<BookingDto> findBookingByBabysitter(Integer id){
        List<Booking> booking = bookingRepository.findBookingByBabysitterId(id);
        List<BookingDto> bookingDto = new ArrayList<>();
        for (Booking booking1: booking) {
            BookingDto bookingDto1 = new BookingDto();
            bookingDto1.setBookingId(booking1.getBookingId());
            bookingDto1.setTutorId(booking1.getTutor().getTutorId());
            bookingDto1.setBabysitterId(booking1.getBabysitter().getBabysitterId());
            bookingDto1.setBookingChild(booking1.getBookingChild());
            bookingDto1.setBookingEstimatedTime(booking1.getBookingEstimatedTime());
            bookingDto1.setBookingTimeStart(booking1.getBookingTimeStart());
            bookingDto1.setBookingTimeEnd(booking1.getBookingTimeEnd());
            bookingDto1.setBookingDate(booking1.getBookingDate());
            bookingDto1.setBookingStatus(booking1.getBookingStatus());
            bookingDto1.setBookingCompleted(booking1.getBookingCompleted());
            bookingDto1.setBookingPaid(booking1.getBookingPaid());
            bookingDto1.setBookingAmount(booking1.getBookingAmount());
            bookingDto.add(bookingDto1);
        }
        return bookingDto;
    }

    //Actualizar reserva
    public void updateBooking(BookingDto bookingDto, Integer id){
        Booking booking = bookingRepository.findByBookingId(id);
        Tutor tutor = new Tutor();
        Babysitter babysitter = new Babysitter();
        booking.setBookingId(bookingDto.getBookingId());
        tutor.setTutorId(bookingDto.getTutorId());
        babysitter.setBabysitterId(bookingDto.getBabysitterId());
        booking.setBabysitter(babysitter);
        booking.setTutor(tutor);
        booking.setBookingChild(bookingDto.getBookingChild());
        booking.setBookingEstimatedTime(bookingDto.getBookingEstimatedTime());
        booking.setBookingTimeStart(bookingDto.getBookingTimeStart());
        booking.setBookingTimeEnd(bookingDto.getBookingTimeEnd());
        booking.setBookingDate(bookingDto.getBookingDate());
        booking.setBookingStatus(bookingDto.getBookingStatus());
        booking.setBookingCompleted(bookingDto.getBookingCompleted());
        booking.setBookingPaid(bookingDto.getBookingPaid());
        booking.setBookingAmount(bookingDto.getBookingAmount());
        bookingRepository.save(booking);
    }

    /*public void findBookingByBabysitter(Integer id){
        List<Booking> booking = bookingRepository.findBookingByBabysitterId(id);
        System.out.println("booking: " + booking);
    }*/

    //Obtener booking por tutor
    public List<BookingDto> findBookingByTutor(Integer id){
        List<Booking> booking = bookingRepository.findBookingByTutorId(id);
        List<BookingDto> bookingDto = new ArrayList<>();
        for (Booking booking1: booking) {
            BookingDto bookingDto1 = new BookingDto();
            bookingDto1.setBookingId(booking1.getBookingId());
            bookingDto1.setTutorId(booking1.getTutor().getTutorId());
            bookingDto1.setBabysitterId(booking1.getBabysitter().getBabysitterId());
            bookingDto1.setBookingChild(booking1.getBookingChild());
            bookingDto1.setBookingEstimatedTime(booking1.getBookingEstimatedTime());
            bookingDto1.setBookingTimeStart(booking1.getBookingTimeStart());
            bookingDto1.setBookingTimeEnd(booking1.getBookingTimeEnd());
            bookingDto1.setBookingDate(booking1.getBookingDate());
            bookingDto1.setBookingStatus(booking1.getBookingStatus());
            bookingDto1.setBookingCompleted(booking1.getBookingCompleted());
            bookingDto1.setBookingPaid(booking1.getBookingPaid());
            bookingDto1.setBookingAmount(booking1.getBookingAmount());
            bookingDto.add(bookingDto1);
        }
        System.out.println("booking: " + booking);
        return bookingDto;
    }

    // obtener Lista Booking por tutor
    public List<BookingListDto> findBookingListByTutorId(Integer id){
        List<BookingListDto> bookingListDto = bookingRepository.findBookingListByTutorId(id);
        return bookingListDto;
    }

    // obtener Lista Booking por babysitter
    public List<BookingListDto> findBookingListByBabysitterId(Integer id){
        List<BookingListDto> bookingListDto = bookingRepository.findBookingListByBabysitterId(id);
        return bookingListDto;
    }


    /*public void findBookingByTutor(Integer id){
        List<Booking> booking = bookingRepository.findBookingByTutorId(id);
        System.out.println("booking: " + booking);
    }*/

    //Modificar el estatus del booking
    public void updateBookingStatus(Integer id, BookingStatusServiceDto status){

        Booking booking = bookingRepository.findByBookingId(id);
        String emailTutor = tutorRepository.getEmailByTutorId(booking.getTutor().getTutorId());
        String emailBabysitter = tutorRepository.getEmailByBabysitterId(booking.getBabysitter().getBabysitterId());
        Notification notification = new Notification();

        switch (status.getBookingCompleted()){
            case 1:
                // Mensaje 1 (Pendiente)
                String asuntoPendiente = "Servicio Pendiente - ASAPsitter";
                String mensajePendiente = "Estimado/a,\n\n" +
                        "Le informamos que su solicitud de servicio ha sido recibida y está pendiente de asignación a una niñera en ASAPsitter. Estamos trabajando diligentemente para encontrar la mejor opción para satisfacer sus necesidades.\n\n" +
                        "Apreciamos su paciencia y pronto le notificaremos una vez que hayamos asignado una niñera a su solicitud. Si tiene alguna pregunta adicional, no dude en comunicarse con nosotros.\n\n" +
                        "Atentamente,\nEl equipo de ASAPsitter";
                booking.setBookingCompleted(1);
                bookingRepository.save(booking);
                notification.setBooking(booking);
                notification.setNotificationMessage(asuntoPendiente+" "+mensajePendiente);
                notificationRepository.save(notification);
                emailSenderBl.sendEmail(emailBabysitter, asuntoPendiente, mensajePendiente);

                break;
            case 2:
                // Mensaje 2 (Aceptada y en proceso)
                String asuntoEnProceso = "Servicio en Proceso - ASAPsitter";
                String mensajeEnProceso = "Estimado/a,\n\n" +
                        "Nos complace informarle que su solicitud de servicio ha sido aceptada y está en proceso. Hemos asignado a una niñera calificada para cuidar de su(s) hijo(s) según los detalles proporcionados.\n\n" +
                        "La niñera asignada está en camino y se espera que llegue a su domicilio a la hora acordada. Si necesita realizar alguna modificación o tiene alguna pregunta adicional, no dude en contactarnos.\n\n" +
                        "Gracias por confiar en ASAPsitter para el cuidado de sus seres queridos.\n\n" +
                        "Atentamente,\nEl equipo de ASAPsitter";
                booking.setBookingCompleted(2);
                bookingRepository.save(booking);
                notification.setBooking(booking);
                notification.setNotificationMessage(asuntoEnProceso+" "+mensajeEnProceso);
                notificationRepository.save(notification);
                emailSenderBl.sendEmail(emailTutor, asuntoEnProceso, mensajeEnProceso);
                break;
            case 3:
                String asuntoTerminada = "Servicio Terminado - ASAPsitter";
                String mensajeTerminada = "Estimado/a,\n\n" +
                        "Nos complace informarle que el servicio de niñera solicitado a través de ASAPsitter ha sido completado con éxito. Nuestra niñera ha cuidado de su(s) hijo(s) según lo acordado y ha realizado todas las tareas asignadas.\n\n" +
                        "Esperamos que su experiencia haya sido satisfactoria y que esté satisfecho con el servicio proporcionado. Si tiene alguna pregunta o comentario, no dude en comunicarse con nosotros.\n\n" +
                        "Agradecemos su confianza en ASAPsitter para el cuidado de sus seres queridos.\n\n" +
                        "Atentamente,\nEl equipo de ASAPsitter";
                booking.setBookingCompleted(3);
                booking.setBookingPaid(true);
                booking.setBookingAmount(status.getBookingAmount());
                bookingRepository.save(booking);
                notification.setBooking(booking);
                notification.setNotificationMessage(asuntoTerminada+" "+mensajeTerminada);
                notificationRepository.save(notification);
                emailSenderBl.sendEmail(emailTutor, asuntoTerminada, mensajeTerminada);
                break;
            case 4:
                // Mensaje 4 (Cancelada)
                String asuntoCancelada = "Servicio Cancelado - ASAPsitter";
                String mensajeCancelada = "Estimado/a,\n\n" +
                        "Lamentamos informarle que su solicitud de servicio de niñera a través de ASAPsitter ha sido cancelada. Algo ha surgido y no pudimos asignar una niñera para cumplir con su solicitud en este momento.\n\n" +
                        "Nos disculpamos por cualquier inconveniente que esto pueda causarle y le recomendamos que vuelva a intentarlo en el futuro. Si tiene alguna pregunta adicional o necesita más información, no dude en ponerse en contacto con nosotros.\n\n" +
                        "Gracias por considerar ASAPsitter para el cuidado de sus seres queridos.\n\n" +
                        "Atentamente,\nEl equipo de ASAPsitter";
                booking.setBookingCompleted(4);
                bookingRepository.save(booking);
                notification.setBooking(booking);
                notification.setNotificationMessage(asuntoCancelada+" "+mensajeCancelada);
                notificationRepository.save(notification);
                emailSenderBl.sendEmail(emailTutor, asuntoCancelada, mensajeCancelada);
                break;
        }
    }
}
