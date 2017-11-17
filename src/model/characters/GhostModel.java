package model.characters;

import utils.GhostState;
import utils.Updatable;

public class GhostModel extends CharacterModel implements Updatable {
        
    private GhostState state;
    private int counter = 0;
    
    public GhostModel(double realRow, double realCol) {
        super(realRow, realCol);
        
        state = GhostState.NORMAL;
    }

    public GhostState getState() {
        return state;
    }

    public void setState(GhostState state) {
        this.state = state;
        if (state == GhostState.RUNNING || state == GhostState.RUNNING_END)
            setSpeed(STANDARD_SPEED/2);
        else
            setSpeed(STANDARD_SPEED);
    }
    
    public void startRunning() {
        if (state != GhostState.DEAD1) {
            setState(GhostState.RUNNING);
            counter = 0;
        }
    }
    
    public boolean isEatable() {
        return state == GhostState.RUNNING || state == GhostState.RUNNING_END;
    }

    @Override
    public void update() {
        
        if (isEatable())
            counter++;
        
        if (state == GhostState.RUNNING && counter == PacManModel.POWER_TIME*0.8)
            setState(GhostState.RUNNING_END);
        else if (state == GhostState.RUNNING_END && counter == PacManModel.POWER_TIME)
            setState(GhostState.NORMAL);
    }
    
}
