package com.softbabysi.demo.Bl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.softbabysi.demo.dao.*;
import com.softbabysi.demo.entity.*;
import org.mindrot.jbcrypt.BCrypt;
import com.softbabysi.demo.Dto.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserBl {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BabySitterRepository babySitterRepository;

    @Autowired
    private TutorRepository tutorRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Autowired
    private BabysitterAbilityRepository babysitterAbilityRepository;

    @Autowired
    private ChildActivityRepository childActivityRepository;

    public static final String KEY = "AppSoftBabySI";

    //Crear una niñera
    @Transactional
    public void createBabysitter(UserBabysitterDto userBabysitterDto){
        String HashedPassword = BCrypt.hashpw(userBabysitterDto.getUserSecret(), BCrypt.gensalt());
        boolean chech = BCrypt.checkpw(userBabysitterDto.getUserSecret(), HashedPassword);
        System.out.println("HashedPassword: " + HashedPassword);
        System.out.println("password: " + userBabysitterDto.getUserSecret());
        System.out.println("chech: " + chech);

        // Crear el primer registro en User
        User user = new User();
        user.setSeLocationId(userBabysitterDto.getSeLocationId());
        user.setUserName(userBabysitterDto.getUserName());
        user.setUserLastname(userBabysitterDto.getUserLastname());
        user.setUserEmail(userBabysitterDto.getUserEmail());
        user.setUserSecret(HashedPassword);
        user.setUserPhone(userBabysitterDto.getUserPhone());
        user.setUserAddres(userBabysitterDto.getUserAddres());
        user.setUserStatus(true);
        userRepository.save(user);
        userRepository.flush(); // flush after saving the user
        //Obtener el id generado por el save del anterior registro
        Integer userId = user.getUserId();
        System.out.println("userId: " + userId);
        System.out.println("userBabysitterDto: " + userBabysitterDto);
        // Crear el babysitter
        Babysitter babysitter = new Babysitter();
        babysitter.setUser(user);
        babysitter.setBabysitterStatus(true);
        babysitter.setBabysitterCI("1233432");
        babysitter.setBabysitterExtension(userBabysitterDto.getExtension());
        babysitter.setBabysitterPhoneContact(userBabysitterDto.getPhoneContact());
        babysitter.setBabysitterDescription(userBabysitterDto.getDescription());
        babysitter.setBabysitterVerify(false);
        babySitterRepository.save(babysitter);
        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setSeRoleId(2);
        userRoleRepository.save(userRole);

        // Crear las habilidades de la niñera

        BabysitterAbility babysitterAbility = new BabysitterAbility();
        babysitterAbility.setBabysitter(babysitter);
        babysitterAbility.setAbilityKnowledgeChildDevelopment(false);
        babysitterAbility.setAbilityEmpathyAndPatience(false);
        babysitterAbility.setAbilityEffectiveCommunication(false);
        babysitterAbility.setAbilityOrganizationalSkills(false);
        babysitterAbility.setAbilityFlexibilityAndAdaptability(false);
        babysitterAbility.setAbilityFirstAid(false);
        babysitterAbility.setAbilityCulturalSensitivity(false);
        babysitterAbility.setAbilityConflictResolution(false);
        babysitterAbility.setAbilityCreativity(false);
        babysitterAbility.setAbilitySpecialNeeds(false);
        babysitterAbility.setAbilityCarefulObservation(false);
        babysitterAbility.setAbilityTasteForTeaching(false);
        babysitterAbility.setAbilityNone(false);
        babysitterAbilityRepository.save(babysitterAbility);

    }


    //Crear un tutor
    //Crear un tutor
    @Transactional
    public void createTutor(UserDto userDto){
        String HashedPassword = BCrypt.hashpw(userDto.getUserSecret(), BCrypt.gensalt());
        boolean chech = BCrypt.checkpw(userDto.getUserSecret(), HashedPassword);
        System.out.println("HashedPassword: " + HashedPassword);
        System.out.println("password: " + userDto.getUserSecret());
        System.out.println("chech: " + chech);
        // Crear el primer registro en User
        User user = new User();
        user.setSeLocationId(userDto.getSeLocationId());
        user.setUserName(userDto.getUserName());
        user.setUserLastname(userDto.getUserLastname());
        user.setUserEmail(userDto.getUserEmail());
        user.setUserSecret(HashedPassword);
        user.setUserPhone(userDto.getUserPhone());
        user.setUserAddres(userDto.getUserAddres());
        user.setUserStatus(true);
        userRepository.save(user);
        userRepository.flush(); // flush after saving the user
        //Obtener el id generado por el save del anterior registro
        Integer userId = user.getUserId();
        // Crear el Tutor
        Tutor tutor = new Tutor();
        tutor.setUser(user);
        tutor.setTutorStatus(true);
        tutorRepository.save(tutor);
        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setSeRoleId(1);
        userRoleRepository.save(userRole);

        // Crear las actividades de los niños
        ChildActivity childActivity = new ChildActivity();
        childActivity.setTutor(tutor);
        childActivity.setActivityTableGames(false);
        childActivity.setActivityArtsAndCrafts(false);
        childActivity.setActivityReadingOfBooks(false);
        childActivity.setActivityCookingAndPastry(false);
        childActivity.setActivityOutdoorActivities(false);
        childActivity.setActivityBlockConstruction(false);
        childActivity.setActivityRolePlays(false);
        childActivity.setActivityMusicAndDance(false);
        childActivity.setActivityExercisesAndYoga(false);
        childActivity.setActivityGardening(false);
        childActivity.setActivityConstructionOfFortresses(false);
        childActivity.setActivityMoviesAndTvShows(false);
        childActivity.setActivityMoviesAndTvShows(false);
        childActivity.setActivityNone(false);
        childActivityRepository.save(childActivity);
    }

    //Todos los usuarios activos
    public List<User> findUsersWhitStatusTrue(){
        List<User> users = userRepository.findAllUserStatus();
        return users;
    }

    //Usuario con id
    public User findUserById(Integer id){
        User user = userRepository.findByUserId(id);
        return user;
    }


    public void findAllUsers(){
        List<User> users = userRepository.findAll();
        users.forEach(user -> {
            System.out.println(user.getUserId());
        });
    }

    public UserLoginDto getUsersData(String email, String secret) {
        List<UserLoginDto> users = userRepository.getUserData();
        for (UserLoginDto user : users) {
            System.out.println("User id " + user.getUserId());
            boolean chech = BCrypt.checkpw(secret, user.getUserSecret());
            if (user.getUserEmail().equals(email) && chech == true) {
                TokenDto tokenDto = new TokenDto();
                tokenDto.setAuthToken(generateToken(user.getUserId(), user.getSeRoleId(), "AUTH", 120));
                user.setToken(tokenDto.getAuthToken());
                return user;
            }
        }

        return null; // Retorna null si no se encuentra un usuario con las credenciales proporcionadas
    }

    //Token

    private String generateToken(Integer userId, Integer seRoleId, String type, int minutes){
        try {
            Algorithm algorithm = Algorithm.HMAC256(KEY);
            String token  = JWT.create()
                    .withIssuer("www.softbabysi.com")
                    .withClaim("userId", userId)
                    .withClaim("seRoleId", seRoleId)
                    .withClaim("type", type)
                    .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * minutes))
                    .sign(algorithm);
            return token;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error al generar el token " + userId + " " + seRoleId + " " + type + " " + minutes);
            throw new RuntimeException("Error al generar el token", e);
        }
    }

    public boolean validateToken(String token){
        if(token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        DecodedJWT decodedJWT;
        try {
            Algorithm algorithm = Algorithm.HMAC256(KEY);
            JWTVerifier verifier = JWT.require(algorithm)
                    // specify an specific claim validations
                    .withIssuer("www.softbabysi.com")
                    // reusable verifier instance
                    .build();
            decodedJWT = verifier.verify(token);
            return true;
        } catch (JWTVerificationException exception){
            System.err.print("Token invalido: " + exception.getMessage());
            return false;
        }
    }

    // Eliminar el ususario de forma logica
    public void deleteUser(Integer id){
        User user = userRepository.findByUserId(id);
        user.setUserStatus(false);
        userRepository.save(user);
    }

    // Actualizar el usuario
    public void updateUser(Integer id, UserEditDto userEditDto){
        User user = userRepository.findByUserId(id);
        user.setSeLocationId(userEditDto.getSeLocationId());
        user.setUserName(userEditDto.getUserName());
        user.setUserLastname(userEditDto.getUserLastname());
        user.setUserPhone(userEditDto.getUserPhone());
        user.setUserAddres(userEditDto.getUserAddres());
        userRepository.save(user);
    }

    //Actualizar password
    public void updatePassword(Integer id, UserEditSecretDto userEditSecretDto){
        User user = userRepository.findByUserId(id);
        String HashedPassword = BCrypt.hashpw(userEditSecretDto.getUserSecret(), BCrypt.gensalt());
        user.setUserSecret(HashedPassword);
        userRepository.save(user);
    }


    /*public User save(User newUser){
        return userRepository.save(newUser);
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }*/





    /*
    public (){

     */
}