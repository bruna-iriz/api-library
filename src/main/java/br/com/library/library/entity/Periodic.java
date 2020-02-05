package br.com.library.library.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "periodic")
@NoArgsConstructor
@AllArgsConstructor
public class Periodic implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long issn;
    private Integer volume;
    private Integer year;
}
