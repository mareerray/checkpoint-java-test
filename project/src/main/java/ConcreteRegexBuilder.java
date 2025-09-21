import java.util.*;
// ConcreteRegexBuilder class
public class ConcreteRegexBuilder implements RegexBuilder{
    private List<String> component = new ArrayList<>();

    public void buildLiteral(String literal) {
        component.add(literal);
    }
    public void buildAnyCharacter() {
        component.add(".");
    }
    public void buildDigit() {
        component.add("\\d");
    }
    public void buildWhitespace() {
        component.add("\\s");
    }
    public void buildWordCharacter() {
        component.add("\\w");
    }
    @Override
    public Regex getResult() {
        return new Regex(new ArrayList(component));
    }
}