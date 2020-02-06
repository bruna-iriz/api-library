package br.com.library.library.entity;

import br.com.library.library.entity.enums.TypePublisher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@Table(name = "publisher")
@NoArgsConstructor
@AllArgsConstructor
public class Publisher implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;
    @NotBlank
    private String name;
    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private TypePublisher type;
}