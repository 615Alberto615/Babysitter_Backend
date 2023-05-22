    package com.softbabysi.demo.Api;

    import com.softbabysi.demo.Bl.BabysitterBl;
    import com.softbabysi.demo.Dto.BabysitterDto;
    import com.softbabysi.demo.Dto.ResponseDto;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    import java.util.List;

    @RestController
    @RequestMapping("/api/v1/babysitter")
    public class BabysitterApi {
        @Autowired
        private BabysitterBl babysitterBl;

        @GetMapping("")
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

    }
    //
