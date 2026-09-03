package com.example.imagemPecas.Infra.Repository;


import com.example.imagemPecas.domain.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, String> {
}
