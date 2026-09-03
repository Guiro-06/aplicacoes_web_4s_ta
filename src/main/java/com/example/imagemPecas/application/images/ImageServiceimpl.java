package com.example.imagemPecas.application.images;

import com.example.imagemPecas.Infra.Repository.ImageRepository;
import com.example.imagemPecas.domain.Service.ImageService;
import com.example.imagemPecas.domain.entity.Image;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ImageServiceimpl implements ImageService {

    private final ImageRepository repository;

    @Override
    @Transactional
    public Image save(Image image) {
        return repository.save(image);
    }
}
