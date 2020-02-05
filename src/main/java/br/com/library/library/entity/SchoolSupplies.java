package br.com.library.library.entity;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchoolSupplies implements Serializable {
    private String description;
}
