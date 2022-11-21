package com.gamecontrol.api.model;

import javax.persistence.*;

@Entity(name = "player_meta")
public class PlayerMeta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="player_id")
    private Player player;

    @Column(name = "key", nullable = false)
    private String key;

    @Column(name = "value", nullable = false)
    private String Value;

}
