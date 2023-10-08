package entities;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long age;
    private Date date;
    private String name;
    @OneToMany(mappedBy = "user")
    private List<Task> tasks = new ArrayList<>();


}
