package com.softbabysi.demo.Api;
import com.softbabysi.demo.Bl.FavoriteBl;
import com.softbabysi.demo.Dto.FavoriteDto;
import com.softbabysi.demo.Dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/favorite")
public class FavoriteApi {
    @Autowired
    private FavoriteBl favoriteBl;

    @GetMapping("")
    public ResponseEntity<ResponseDto<List<FavoriteDto>>> getAllFavorite(){
        ResponseDto<List<FavoriteDto>> responseDto = new ResponseDto<>();
        try {
            responseDto.setCode(0000);
            responseDto.setData(favoriteBl.getAllFavorite());
            responseDto.setMessage("Favorite retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }

    }
}
