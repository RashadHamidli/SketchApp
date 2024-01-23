package az.katv1.repository;


import az.katv1.entity.Eskiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EskizRepository extends JpaRepository<Eskiz, Integer> {
}
