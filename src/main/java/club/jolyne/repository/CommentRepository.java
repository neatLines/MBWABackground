package club.jolyne.repository;

import club.jolyne.models.CommentEntity;
import club.jolyne.models.ExhiEntity;
import club.jolyne.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Integer> {
    public List<CommentEntity> findByExhiByExhiId(ExhiEntity exhi);
    public List<CommentEntity> findByUserByUserId(UserEntity userEntity);
}
