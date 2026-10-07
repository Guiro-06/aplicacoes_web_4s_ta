package com.example.imagemPecas.Infra.Repository;

import com.example.imagemPecas.domain.entity.Image;
import com.example.imagemPecas.domain.enums.ImageExtension;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.util.StringUtils;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, String>,
        JpaSpecificationExecutor<Image> {

    default List<Image> findByExtensionAndNameOrTagsLike(
            ImageExtension extension,
            String query
    ) {

        Specification<Image> conjunction =
                (root, q, criteriaBuilder) ->
                        criteriaBuilder.conjunction();

        Specification<Image> spec =
                Specification.where(conjunction);

        if (extension != null) {
            spec = spec.and(
                    (root, q, cb) ->
                            cb.equal(root.get("extension"), extension)
            );
        }

        if (StringUtils.hasText(query)) {

            Specification<Image> nameLike =
                    (root, q, cb) ->
                            cb.like(
                                    cb.upper(root.get("name")),
                                    "%" + query.toUpperCase() + "%"
                            );

            Specification<Image> tagsLike =
                    (root, q, cb) ->
                            cb.like(
                                    cb.upper(root.get("tags")),
                                    "%" + query.toUpperCase() + "%"
                            );

            spec = spec.and(
                    Specification.anyOf(nameLike, tagsLike)
            );
        }

        return findAll(spec);
    }
}
