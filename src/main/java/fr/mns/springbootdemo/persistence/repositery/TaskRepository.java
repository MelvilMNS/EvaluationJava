package fr.mns.springbootdemo.persistence.repositery;


import fr.mns.springbootdemo.persistence.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}