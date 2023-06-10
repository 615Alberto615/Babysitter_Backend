    package com.softbabysi.demo.Api;

    import com.softbabysi.demo.Bl.BabysitterBl;
    import com.softbabysi.demo.Dto.BabysitterDto;
    import com.softbabysi.demo.Dto.BabysitterListDto;
    import com.softbabysi.demo.Dto.ResponseDto;
    import com.softbabysi.demo.entity.Babysitter;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/api/v1/babysitter")
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
    public class BabysitterApi {
        @Autowired
        private BabysitterBl babysitterBl;

        @GetMapping("/all")
        public ResponseEntity<ResponseDto<List<BabysitterDto>>> getAllBabysitter(){
            ResponseDto<List<BabysitterDto>> responseDto = new ResponseDto<>();
            try {
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
        public ResponseEntity<ResponseDto<List<Babysitter>>> findAllBabysitterStatus() {
            try {
                return ResponseEntity.ok(new ResponseDto<>(200, babysitterBl.findAllBabysitterStatus(), "Babysitter retrieved successfully"));
            } catch (Exception e) {
                return ResponseEntity.ok(new ResponseDto<>(500, null, "error"));
            }
        }

        //Todas las niñeras para la Lista de niñeras
        @GetMapping("")
        public ResponseEntity<ResponseDto<List<BabysitterListDto>>> getBabysittersData() {
            List<BabysitterListDto> babysittersData = babysitterBl.getBabysittersData();
            try {
                return ResponseEntity.ok(new ResponseDto<>(200, babysittersData, "Babysitters retrieved successfully"));
            } catch (Exception e) {
                return ResponseEntity.ok(new ResponseDto<>(500, null, "An error occurred"));
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
