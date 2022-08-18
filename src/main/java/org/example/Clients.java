package org.example;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "clients")
@NamedQuery(name = "selectByNameLike", query = "SELECT c FROM Clients c WHERE c.name LIKE :pattern")
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // or @GeneratedValue
    @Column(name = "Client_id")
    private Long id;

    @Column(name = "client_name")
    private String name;

    @Column(nullable = false)
    private Integer age;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Orders order;

    @OneToMany(mappedBy = "client1", cascade = CascadeType.ALL)
    private List<Goods> goods = new ArrayList<>();

    public Clients() {}

    public Clients(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
