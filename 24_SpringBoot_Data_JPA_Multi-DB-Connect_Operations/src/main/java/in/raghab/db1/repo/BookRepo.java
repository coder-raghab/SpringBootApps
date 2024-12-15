package in.raghab.db1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.raghab.db1.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
