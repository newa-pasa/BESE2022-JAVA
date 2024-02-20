package np.edu.gces.library.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import np.edu.gces.library.entities.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
    
}
