public class Client {
    public static void main(String[] args) {

        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();

        Component composite1 = new Composite();
        composite1.addComponent(leaf1);
        composite1.addComponent(leaf2);
        
        Component leaf3 = new Leaf();
        Component composite2 = new Composite();
        composite2.addComponent(leaf3);
        composite2.addComponent(composite1);

        composite2.operation();
    }
    
}
