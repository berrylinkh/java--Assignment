public class Nigeria {
    private GeopoliticalRegion region;
    private String states;


    public  String getState(String inputState) {
        for (GeopoliticalRegion region : GeopoliticalRegion.values()) {
            for (String currentState : region.getState()) {
                if (currentState.equals(inputState)) {
                    System.out.println("The region is: " + region);
                    return region.toString();
                }
            }

        }
        throw new IllegalArgumentException("State +" + inputState + " + not found in Nigeria");
    }
}
