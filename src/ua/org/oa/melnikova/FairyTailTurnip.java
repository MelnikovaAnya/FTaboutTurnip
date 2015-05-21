package ua.org.oa.melnikova;

import java.util.ArrayList;
import java.util.logging.Logger;

public class FairyTailTurnip {
    private static Logger log = Logger.getLogger(Turnip.class.getName());
    private ArrayList<Actor> actors = new ArrayList<>();
    private Turnip turnip;

    public FairyTailTurnip() {
        createActors();
        toPlantTurnip();
        turnipUp();
    }

    private void createActors() {
        actors.add(new Actor("Grandpa") {
            @Override
            public void pull(Turnip turnip) {
                super.pull(turnip);
                log.info(getCharacter() + " pulled the turnip.");
            }

            @Override
            public void came() {
                log.info(getCharacter() + " planted a turnip.");
                turnip = new Turnip();
            }

            @Override
            public void call() {
                log.info(getCharacter() + " called Grandma");
            }
        });

        actors.add(new Actor("Grandma") {
            @Override
            public void pull(Turnip turnip) {
                super.pull(turnip);
                log.info(getCharacter() + " pulled Grandpa.");
            }

            @Override
            public void call() {
                log.info(getCharacter() + " called Granddaughter");
            }
        });

        actors.add(new Actor("Granddaughter") {
            @Override
            public void pull(Turnip turnip) {
                super.pull(turnip);
                log.info(getCharacter() + " pulled Grandma.");
            }

            @Override
            public void call() {
                log.info(getCharacter() + " called doggy");
            }
        });

        actors.add(new Actor("doggy") {
            @Override
            public void pull(Turnip turnip) {
                super.pull(turnip);
                log.info(getCharacter() + " pulled Granddaughter.");
            }

            @Override
            public void call() {
                log.info(getCharacter() + " called kitty");
            }
        });

        actors.add(new Actor("kitty") {
            @Override
            public void pull(Turnip turnip) {
                super.pull(turnip);
                log.info(getCharacter() + " pulled doggy.");
            }

            @Override
            public void call() {
                log.info(getCharacter() + " called mouse");
            }
        });

        actors.add(new Actor("mouse") {
            @Override
            public void pull(Turnip turnip) {
                super.pull(turnip);
                log.info(getCharacter() + " pulled kitty.");
            }

            @Override
            public void call() {
                log.info(getCharacter() + " can't call");
            }
        });
    }


    private void toPlantTurnip() {
        actors.get(0).came();
    }

    private void turnipUp() {
        int members = 0;
        while (true) {
            for (int i = members; i >= 0; i--) {
                actors.get(i).pull(turnip);
            }
            if (!turnip.checkTurnipUp()) {
                actors.get(members).call();
                members++;
                actors.get(members).came();
            } else {
                break;
            }

        }
    }
}
