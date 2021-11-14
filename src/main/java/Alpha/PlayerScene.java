package Alpha;

public class PlayerScene extends Scene {

    private boolean changingScene = false;
    private float changeSceneTime = 1.0f;

    public PlayerScene() {
        System.out.println("Inside Scene Player");
    }

    @Override
    public void update(float dt) {
        ChangeScene(dt);
    }

    private void ChangeScene(float dt) {
        if (!changingScene && MouseListener.mouseButtonDown(1))
        {
            changingScene = true;
        }

        if (changingScene && changeSceneTime > 0)
        {
            changeSceneTime -= dt;
        }
        else if (changingScene) {
            Window.changeScene(0);
        }
    }
}
