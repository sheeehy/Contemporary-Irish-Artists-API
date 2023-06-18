package com.example.SpringAPI.service;

import com.example.SpringAPI.api.model.Artist;
import com.example.SpringAPI.api.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {
    private final ArtistRepository artistRepository;

    @Autowired
    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public Optional<Artist> getArtistById(Integer id) {
        return artistRepository.findArtistById(id);
    }

    public List<Artist> getArtistsByName(String name) {
        return artistRepository.findArtistsByName(name);
    }

    public List<Artist> getArtistsByStyle(String style) {
        return artistRepository.findArtistsByStyle(style);
    }
}
