package org.example;


import javax.persistence.*;

@Entity
@Table(name = "Goods")

public class Goods {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "Goods_name")
    private String name;

    @Column(nullable = false)
    private Long price;

    @OneToMany
    @JoinColumn(mappedBy = "goods", cascade = CascadeType.ALL)
    private <Orders> order = new Orders();;




    public Goods() {
    }

    public Goods(Long id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }


}
