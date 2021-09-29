package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Hobby implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;








    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }








}
