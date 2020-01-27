package br.com.library.library.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "abstract_informational")
@NoArgsConstructor
@AllArgsConstructor
public class AbstractInformational {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String title;
    @NotBlank
    private String barcode;
    private String shelf;
    private String copies;
    private String available;
}