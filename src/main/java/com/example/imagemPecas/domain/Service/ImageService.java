package com.example.imagemPecas.domain.Service;

import com.example.imagemPecas.domain.entity.Image;

import java.util.Optional;

public interface ImageService {
    Image save (Image image);

    Optional<Image> getById(String id);
}
