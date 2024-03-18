import java.util.ArrayList;

public class Composite implements Component {
    private List<Component> components = newArrayList<>();

    public void addComponent(Component component){
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);

    }
    }
    public void operation(){
        System.out.println("Выполняется операция в составном компоненте");

        for (Component component: components){
            component.operation();x
        }
    }
}