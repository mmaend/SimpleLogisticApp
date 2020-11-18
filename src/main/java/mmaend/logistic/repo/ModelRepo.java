package mmaend.logistic.repo;

import mmaend.logistic.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepo extends JpaRepository<Model, Long> {
}
