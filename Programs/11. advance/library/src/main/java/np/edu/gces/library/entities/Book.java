package np.edu.gces.library.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book{
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "author_name")
    private String authorName;

    private int pages;
    private Date publishDate;
    private String col1;
}
