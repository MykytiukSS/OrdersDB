package org.example;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Orders")

public class Orders {
    @Id
    @GeneratedValue
    private Long id;

   

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Clients client1;


     @ManyToOne
    @JoinColumn(name = "goods_id")
    private Goods goods;



    public Orders() {

    }

    public Orders(Long id, Clients client) {
        this.id = id;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Clients getClient() {
        return client;
    }

    public void setClient(Clients client) {
        this.client = client;
    }
}
