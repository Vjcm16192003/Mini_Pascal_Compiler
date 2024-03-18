public class VariableDeclaration extends Expression {
    public String id;
    public String type;

    public VariableDeclaration(String id, String type){
        this.id = id;
        this.type = type;
    }
}