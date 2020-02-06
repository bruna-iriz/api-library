package br.com.library.library.entity.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum TypePublisher {

    BOOK(1, "BOOK"),
    DIDACTIC_BOOK(2, "DIDACTIC_BOOK"),
    MAGAZINE(3, "MAGAZINE"),
    OTHERS(0, "OTHERS");

    private int id;
    private String name;

    public static TypePublisher getTypePublisherById(int typePublisherId) {
        return Stream.of(values())
                .filter(value -> typePublisherId == value.id)
                .findAny()
                .orElse(OTHERS);
    }
}