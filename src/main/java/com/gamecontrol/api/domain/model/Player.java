package com.gamecontrol.api.domain.model;

import javax.persistence.*;

@Entity(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column()
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="team_id")
    private Team team;

}
