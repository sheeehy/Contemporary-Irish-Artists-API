package com.example.SpringAPI.api.controller;

import com.example.SpringAPI.api.model.Artist;
import com.example.SpringAPI.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@RestController
public class ArtistController {

    private final ArtistService artistService;

    @Autowired
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/Artist/id")
    public ResponseEntity<Artist> getArtistById(@RequestParam Integer id) {
        Optional<Artist> artist = artistService.getArtistById(id);
        if (artist.isPresent()) {
            return ResponseEntity.ok(artist.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/Artist/name")
    public ResponseEntity<List<Artist>> getArtistByName(@RequestParam String name) {
        List<Artist> artists = artistService.getArtistsByName(name);
        if (artists.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(artists);
    }

    @GetMapping("/Artist/style")
    public ResponseEntity<List<Artist>> getArtistsByStyle(@RequestParam String style) {
        List<Artist> artists = artistService.getArtistsByStyle(style);
        if (artists.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(artists);
    }

}
