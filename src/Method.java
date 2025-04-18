package src;
public class Method {
    public String type;
    public String name;
    public JortParser.ParameterListContext params;
    public JortParser.BlockContext block;
    public Method(String type, String name, JortParser.ParameterListContext params, JortParser.BlockContext block) {
        this.type = type;
        this.name = name;
        this.params = params;
        this.block = block;
    }
}
