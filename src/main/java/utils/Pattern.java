package utils;

public enum Pattern {
    COORDINATE("\\((\\d+),(\\d+)\\)");

    private final String pattern;

    Pattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}
