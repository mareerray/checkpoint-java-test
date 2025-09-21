// Builder interface defines steps needed to construct a regex
public interface RegexBuilder {
    void buildLiteral(String literal);
    void buildAnyCharacter();
    void buildDigit();
    void buildWhitespace();
    void buildWordCharacter();
    Regex getResult();
}