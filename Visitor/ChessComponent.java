public abstract class ChessComponent {
    private String componentName;

    public ChessComponent(String name) {
        this.componentName = name;
    }

    public String getComponentName() {
        return this.componentName;
    }
 
    abstract void accept(Visitor v); //implement in subclasses
}
 