    package com.softbabysi.demo.Api;

    import com.softbabysi.demo.Bl.BabysitterBl;
    import com.softbabysi.demo.Bl.UserBl;
    import com.softbabysi.demo.Dto.BabysitterDto;
    import com.softbabysi.demo.Dto.BabysitterListDto;
    import com.softbabysi.demo.Dto.ResponseDto;
    import com.softbabysi.demo.entity.Babysitter;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/api/v1/babysitter")
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
    public class BabysitterApi {
        @Autowired
        private BabysitterBl babysitterBl;

        @Autowired
        private UserBl userBl;

        @GetMapping("/all")
        public ResponseEntity<ResponseDto<List<BabysitterDto>>> getAllBabysitter(@RequestHeader("Authorization") String token){
            ResponseDto<List<BabysitterDto>> responseDto = new ResponseDto<>();
            try {
                if(!userBl.validateToken(token)){
                    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
                }
                System.out.println("token autorizado");
                responseDto.setCode(0000);
                responseDto.setData(babysitterBl.getAllBabysitter());
                responseDto.setMessage("Babysitter retrieved successfully");
                return ResponseEntity.ok(responseDto);
            }catch (Exception e) {
                responseDto.setCode(500);
                responseDto.setMessage("error");
                return ResponseEntity.ok(responseDto);
            }

        }

        // Todas la niñeras con estatus true
        @GetMapping("/")
        public ResponseEntity<ResponseDto<List<Babysitter>>> findAllBabysitterStatus(@RequestHeader("Authorization") String token) {
            try {
                if(!userBl.validateToken(token)){
                    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
                }
                System.out.println("token autorizado");
                return ResponseEntity.ok(new ResponseDto<>(200, babysitterBl.findAllBabysitterStatus(), "Babysitter retrieved successfully"));
            } catch (Exception e) {
                return ResponseEntity.ok(new ResponseDto<>(500, null, "error"));
            }
        }

        //Todas las niñeras para la Lista de niñeras
        @GetMapping("")
        public ResponseEntity<ResponseDto<List<BabysitterListDto>>> getBabysittersData(@RequestHeader("Authorization") String token) {
            List<BabysitterListDto> babysittersData = babysitterBl.getBabysittersData();
            try {
                if(!userBl.validateToken(token)){
                    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
                }
                System.out.println("token autorizado");
                return ResponseEntity.ok(new ResponseDto<>(200, babysittersData, "Babysitters retrieved successfully"));
            } catch (Exception e) {
                return ResponseEntity.ok(new ResponseDto<>(500, null, "An error occurred"));
            }

        }

        // Por id de usuario
        @GetMapping("/user/{id}")
        public ResponseEntity<ResponseDto<BabysitterDto>> findBabysitterByUserId(@PathVariable Integer id){
            Babysitter babysitter = babysitterBl.findBabysitterByUserId(id);
            BabysitterDto babysitterDto = new BabysitterDto();
            babysitterDto.setBabysitterId(babysitter.getBabysitterId());
            babysitterDto.setUserId(babysitter.getUser().getUserId());
            babysitterDto.setBabysitterCi(babysitter.getBabysitterCI());
            babysitterDto.setBabysitterExtension(babysitter.getBabysitterExtension());
            babysitterDto.setBabysitterDescription(babysitter.getBabysitterDescription());
            babysitterDto.setBabysitterStatus(babysitter.getBabysitterStatus());
            System.out.println(babysitterDto);
            try {
                return ResponseEntity.ok(new ResponseDto<>(200, babysitterDto, "Babysitter retrieved successfully"));
            }catch (Exception e) {
                return ResponseEntity.ok(new ResponseDto<>(500, null, "error"));
            }
        }



        /*@GetMapping("/{id}")
        public ResponseEntity<ResponseDto<BabysitterDto>> getBabysitterById(Long id){
            ResponseDto<BabysitterDto> responseDto = new ResponseDto<>();
            try {
                responseDto.setCode(0000);
                responseDto.setData(babysitterBl.getBabysitterById(id));
                responseDto.setMessage("Babysitter retrieved successfully");
                return ResponseEntity.ok(responseDto);
            }catch (Exception e) {
                responseDto.setCode(500);
                responseDto.setMessage("error");
                return ResponseEntity.ok(responseDto);
            }

        }*/

    }
    //
