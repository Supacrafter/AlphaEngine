package components;

import Alpha.Component;

public class Debug extends Component {
    private  boolean firstTime = false;

    @Override
    public void start() {
        System.out.println("Im Starting");
    }

    @Override
    public void update(float dt) {
        if (!firstTime) {
            System.out.println("I am updating");
            firstTime = true;
        }
    }
}
