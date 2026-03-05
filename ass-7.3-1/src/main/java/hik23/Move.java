package hik23;

import java.util.Locale;
import java.util.Optional;

public enum Move {
    STONE,
    SCISSORS,
    PAPER;

    public static Optional<Move> fromUserInput(String raw) {
        if (raw == null) return Optional.empty();

        String s = raw.trim().toLowerCase(Locale.ROOT);

        // allow numbers
        switch (s) {
            case "1":
            case "stone":
            case "rock":      // (leyfi rock líka - skaðar ekki)
                return Optional.of(STONE);

            case "2":
            case "scissors":
            case "scissor":
                return Optional.of(SCISSORS);

            case "3":
            case "paper":
                return Optional.of(PAPER);

            default:
                return Optional.empty();
        }
    }

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}