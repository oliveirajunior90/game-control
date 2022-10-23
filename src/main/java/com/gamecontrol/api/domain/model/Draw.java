package com.gamecontrol.api.domain.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "draw")
public class Draw {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="match_id")
    private Match match;

    @Column(name="moment", nullable=false)
    private Date moment;

    @Column(name="message", nullable=false)
    private String message;

}
