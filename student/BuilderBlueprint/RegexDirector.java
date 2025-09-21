// RegexDirector class controls the sequence in which builder methods are called.
// Key: The director knows how to build a specific product, but not the details of assembling each piece.
public class RegexDirector {
    private RegexBuilder builder;

    public void setBuilder(RegexBuilder builder) {
        this.builder = builder;
    }

    // The construct() method choose both which steps are called and in what order.
    // If you change the order in construct(), the result will be a different regex pattern.
    public Regex construct() {
        builder.buildLiteral("Hello");
        builder.buildWhitespace();
        builder.buildWordCharacter();
        builder.buildAnyCharacter();
        return builder.getResult();
    }
}