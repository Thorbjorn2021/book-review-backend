package Thorbjorn.books.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private ObjectId id;
    private String isbn13;
    private String isbn10;
    private String title;
    private String subtitle;
    private String authors;
    private String categories;
    private String thumbnail;
    private String description;
    private int published_year;
}
