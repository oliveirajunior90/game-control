package com.gamecontrol.api.domain.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="home_team_id")
    private Team homeTeam;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="visitor_team_id")
    private Team visitorTeam;

    private Date date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="winner_team_id")
    private Team winner;

    private int homeScore;

    private int visitorScore;

    private String place;

    @Enumerated(EnumType.STRING)
    private Status status;

    private enum Status {
        canceled,
        progress,
        interrupted,
        finished,
    }
}
