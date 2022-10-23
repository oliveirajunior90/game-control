package com.gamecontrol.api.domain.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name ="name")
    private String name;

    @OneToMany(mappedBy = "team")
    private List<Player> players;

}
