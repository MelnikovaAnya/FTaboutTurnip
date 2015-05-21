package ua.org.oa.melnikova;

import java.util.logging.Logger;

public class Turnip {

    private static Logger log = Logger.getLogger(Turnip.class.getName());
    private Boolean pulledGrandpa;
    private Boolean pulledGranddaughter;
    private Boolean pulledMouse;
    private Boolean pulledKitty;
    private Boolean pulledDoggy;
    private Boolean pulledGrandma;

    public Turnip() {
        setPulledGrandpa(false);
        setPulledMouse(false);
        setPulledKitty(false);
        setPulledGrandma(false);
        setPulledDoggy(false);
        setPulledGranddaughter(false);
        log.info("The turnip grew bigger and bigger. ");
    }

    private void resetTurnip() {
        setPulledDoggy(false);
        setPulledGranddaughter(false);
        setPulledGrandma(false);
        setPulledGrandpa(false);
        setPulledKitty(false);
        setPulledMouse(false);
    }

    public Boolean checkTurnipUp() {
        if ((getPulledDoggy()) & (getPulledGranddaughter()) & (getPulledGrandma()) & (getPulledGrandpa()) &
                (getPulledKitty()) & (getPulledMouse())) {
            log.info("Pulled and pulled and pulled the turnip up!");
            return true;
        } else {
            log.info("Pulled and pulled but couldn't pull it up ");
            return false;
        }
    }

    public void pulledTurnip(Actor actor) {
        switch (actor.getCharacter()) {
            case "Grandpa":
                setPulledGrandpa(true);
                break;
            case "Grandma":
                setPulledGrandma(true);
                break;
            case "Granddaughter":
                setPulledGranddaughter(true);
                break;
            case "doggy":
                setPulledDoggy(true);
                break;
            case "kitty":
                setPulledKitty(true);
                break;
            case "mouse":
                setPulledMouse(true);
                break;
            default:
                break;
        }
    }


    public Boolean getPulledMouse() {
        return pulledMouse;
    }

    public void setPulledMouse(Boolean pulledMouse) {
        this.pulledMouse = pulledMouse;
    }

    public Boolean getPulledGranddaughter() {
        return pulledGranddaughter;
    }

    public void setPulledGranddaughter(Boolean pulledGranddaughter) {
        this.pulledGranddaughter = pulledGranddaughter;
    }

    public Boolean getPulledKitty() {
        return pulledKitty;
    }

    public void setPulledKitty(Boolean pulledKitty) {
        this.pulledKitty = pulledKitty;
    }

    public Boolean getPulledDoggy() {
        return pulledDoggy;
    }

    public void setPulledDoggy(Boolean pulledDoggy) {
        this.pulledDoggy = pulledDoggy;
    }

    public Boolean getPulledGrandpa() {
        return pulledGrandpa;
    }

    public void setPulledGrandpa(Boolean pulledGrandpa) {
        this.pulledGrandpa = pulledGrandpa;
    }

    public Boolean getPulledGrandma() {
        return pulledGrandma;
    }

    public void setPulledGrandma(Boolean pulledGrandma) {
        this.pulledGrandma = pulledGrandma;
    }


}
