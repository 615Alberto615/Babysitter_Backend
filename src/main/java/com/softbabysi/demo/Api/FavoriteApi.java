package com.softbabysi.demo.Api;
import com.softbabysi.demo.Bl.FavoriteBl;
import com.softbabysi.demo.Bl.UserBl;
import com.softbabysi.demo.Dto.FavoriteDto;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.entity.Favorite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/favorite")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class FavoriteApi {
    @Autowired
    private FavoriteBl favoriteBl;

    @Autowired
    private UserBl userBl;

    //Obtener todos los favoritos por id de tutor
    @GetMapping("/tutor/{id}")
    public ResponseEntity<ResponseDto<List<Favorite>>> getAllFavoriteByTutorId(@PathVariable Integer tutorId){
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, favoriteBl.getAllFavoriteByTutorId(tutorId), "Favoritos"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }

    //Crear un favorito
    @PostMapping("/")
    public ResponseEntity<ResponseDto<Favorite>> createFavorite(@RequestBody FavoriteDto favoriteDto){
        favoriteBl.createFavorite(favoriteDto);
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Favorito creado"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }

    //Eliminar un favorito de manera permanente
    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto<Favorite>> deleteFavorite(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        favoriteBl.deleteFavorite(id);
        try {
            if (!userBl.validateToken(token)) {
                return ResponseEntity.status(401).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Favorito eliminado"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }

}
