package com.booleanuk.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "games")
@Data
//@Getter
//@Setter
@NoArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Column(nullable = false)
    private String title;

    @NotBlank
    @Column(nullable = false)
    private String genre;

    @NotBlank
    @Column(nullable = false)
    private String publisher;

    @NotBlank
    @Column(nullable = false)
    private String developer;

    @NotBlank
    @Column(nullable = false)
    private int releaseYear;


    @Column(nullable = false)
    private boolean isEarlyAccess;


}
