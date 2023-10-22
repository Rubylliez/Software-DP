class LightAdapter implements SmartHouseAdapter {
    private LegacyLightingSystem adaptee;

    public LightAdapter(LegacyLightingSystem adaptee) {
        this.adaptee = adaptee;
    }

    public void controlLights(int lightId, int intensity) {
        adaptee.adjustLight(lightId, intensity);
    }

    public void turnOnLights(int lightId) {
        adaptee.turnOn(lightId);
    }

    public void turnOffLights(int lightId) {
        adaptee.turnOff(lightId);
    }
}
