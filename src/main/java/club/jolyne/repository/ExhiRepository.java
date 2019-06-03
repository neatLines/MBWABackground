package club.jolyne.repository;

import club.jolyne.models.ExhiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExhiRepository extends JpaRepository<ExhiEntity, Integer> {
}
