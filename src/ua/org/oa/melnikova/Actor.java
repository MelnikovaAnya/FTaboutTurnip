package ua.org.oa.melnikova;

import java.util.logging.Logger;

public abstract class Actor implements Pullable, Callable {
    private static Logger log = Logger.getLogger(Turnip.class.getName());
    private String character;

    public Actor(String character) {
        this.setCharacter(character);
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public void came() {
        log.info("The " + getCharacter() + " came.");
    }

    @Override
    public void pull(Turnip turnip) {
        turnip.pulledTurnip(this);

    }


}
