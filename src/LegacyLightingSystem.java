class LegacyLightingSystem {
    void adjustLight(int lightId, int intensity) {
        System.out.println("Adjusting light " + lightId + " to " + intensity + "%");
    }

    void turnOff(int lightId) {
        System.out.println("Light " + lightId + " is turned off");
    }

    void turnOn(int lightId) {
        System.out.println("Light " + lightId + " is turned on");
    }
}