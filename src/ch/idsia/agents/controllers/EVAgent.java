package ch.idsia.agents.controllers;

import ch.idsia.agents.Agent;
import ch.idsia.benchmark.mario.engine.sprites.Mario;
import ch.idsia.benchmark.mario.environments.Environment;

/**
 * Created with IntelliJ IDEA.
 * User: Thibaut Royer
 * Date: 24/08/13
 * Time: 19:25
 */

public class EVAgent extends BasicMarioAIAgent implements Agent
{

    // Never ever modify these lines !
    public EVAgent()
    {
        super("EVAgent");
        reset();
    }

    // Called at level start
    public void reset()
    {
    }

    // Called every tick
    public boolean[] getAction()
    {
        // The action table sets the buttons (pressed or not) every tick. Please, code here and enjoy !
        return action;
    }

}
