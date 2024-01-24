package az.katv1.dao;


import az.katv1.dao.entity.Sketch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SketchRepository extends JpaRepository<Sketch, Integer> {
}
