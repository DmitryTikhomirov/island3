package com.kup.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EntityType {
    WOLF("\uD83D\uDC01"),
    SNAKE("\uD83D\uDC0D"),
    FOX("\uD83E\uDD8A"),
    BAER("\uD83D\uDC3B"),
    EAGLE("\uD83E\uDD85"),
    HORSE("\uD83D\uDC0E"),
    DEER("\uD83E\uDD8C"),
    RABBIT("\uD83D\uDC07"),
    GOAT("\uD83D\uDC10"),
    SHEEP("\uD83D\uDC11"),
    BOAR("\uD83D\uDC17"),
    BUFFALO("\uD83D\uDC03"),
    DUCK("\uD83E\uDD86"),
    LARVA("\uD83D\uDC1B"),
    PLANT("\uD83C\uDF31");
    private final String unicodeSymbol;
}
