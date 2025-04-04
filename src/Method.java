package src;
public class Method {
    public String type;
    public String name;
    public JavaRotParser.ParameterListContext params;
    public JavaRotParser.BlockContext block;
    public Method(String type, String name, JavaRotParser.ParameterListContext params, JavaRotParser.BlockContext block) {
        this.type = type;
        this.name = name;
        this.params = params;
        this.block = block;
    }
}
