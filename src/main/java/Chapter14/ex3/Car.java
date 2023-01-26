package Chapter14.ex3;

public class Car {
    private static final int OK = 100;
    private static final int ERROR_CHECK_ENGINE = 200;
    private static final int ERROR_NO_FUEL = 300;
    private static final int WARNING_FUEL_FLAP_OPEN = 400;
    private static final int WARNING_DOORS_OPEN = 500;

    private int fuel;
    private boolean engineOk;
    private boolean engineOn;
    private boolean fuelFlapOpen;
    private boolean doorsOpen;

    public Car(int fuel, boolean engineOk, boolean fuelFlapOpen, boolean doorsOpen, boolean engineOn) {
        this.fuel = fuel;
        this.engineOk = engineOk;
        this.fuelFlapOpen = fuelFlapOpen;
        this.doorsOpen = doorsOpen;
        setEngineOn(engineOn);
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        if (fuel <= 0) {
            engineOn = false;
        }
        this.fuel = fuel;
    }

    public boolean isEngineOk() {
        return engineOk;
    }

    public void setEngineOk(boolean engineOk) {
        if (!engineOk) {
            engineOn = false;
        }
        this.engineOk = engineOk;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        int systemCheck = systemCheck();
        if (systemCheck == ERROR_CHECK_ENGINE || systemCheck == ERROR_NO_FUEL) {
            this.engineOn = false;
        } else {
            this.engineOn = true;
        }
    }

    public boolean isFuelFlapOpen() {
        return fuelFlapOpen;
    }

    public void setFuelFlapOpen(boolean fuelFlapOpen) {
        this.fuelFlapOpen = fuelFlapOpen;
    }

    public boolean isDoorsOpen() {
        return doorsOpen;
    }

    public void setDoorsOpen(boolean doorsOpen) {
        this.doorsOpen = doorsOpen;
    }

    private int systemCheck() {
        if (!engineOk)
            return ERROR_CHECK_ENGINE;

        if (fuel == 0)
            return ERROR_NO_FUEL;

        if (fuelFlapOpen)
            return WARNING_FUEL_FLAP_OPEN;

        if (doorsOpen)
            return WARNING_DOORS_OPEN;

        return OK;
    }

    int start () {
        int systemCheck = systemCheck();
        setEngineOn(true);
        return systemCheck;
    }

    String status () {
        if (systemCheck() == OK)
            return "All system ok you can drive";

        String status = "Car status \n";
        if (!engineOk)
            status += "> Engine damaged";
        if (fuel == 0)
            status += "> no Fuel";
        if (doorsOpen)
            status += "> Doorsa are open";
        if (fuelFlapOpen)
            status += "> Close fuel cap";
        if (engineOn)
            status += "> Engine on";
        else
            status += "> Engine off";

        return status;
    }
}
