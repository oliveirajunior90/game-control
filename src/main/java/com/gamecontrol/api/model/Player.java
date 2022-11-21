package com.gamecontrol.api.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

    @OneToMany(mappedBy = "player")
    private List<PlayerMeta> attributes;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}
