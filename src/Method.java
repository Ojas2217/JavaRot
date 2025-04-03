package src;
public class Method {
    public String type;
    public String name;
    public JavaRotParser.BlockContext block;
    public Method(String type, String name, JavaRotParser.BlockContext block) {
        this.type = type;
        this.name = name;
        this.block = block;
    }
}
