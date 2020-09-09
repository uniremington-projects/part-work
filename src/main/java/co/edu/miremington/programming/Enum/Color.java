package co.edu.miremington.programming.Enum;

public enum Color {
    COLOR_BLACK("Black"),
    COLOR_RED("Red"),
    COLOR_BLUE("Blue"),
    COLOR_YELLOW("Yellow");

    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
