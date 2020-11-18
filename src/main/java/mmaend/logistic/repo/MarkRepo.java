package mmaend.logistic.repo;

import mmaend.logistic.domain.Mark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkRepo extends JpaRepository<Mark, Long> {
}