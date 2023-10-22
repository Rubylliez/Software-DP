public class SmartHouseMain {
    public static void main(String[] args) {
        LegacyLightingSystem legacyLight = new LegacyLightingSystem();
        SmartHouseAdapter adapter = new LightAdapter(legacyLight);

        adapter.controlLights(1, 100);
        adapter.turnOnLights(2);
        adapter.turnOffLights(3);
    }
}
