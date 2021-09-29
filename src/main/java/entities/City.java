package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class City implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 6)
    private Long id;

    public String name;
    public Long zipCode;





}
