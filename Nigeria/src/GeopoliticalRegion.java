public enum GeopoliticalRegion {
    NORTHCENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTHEAST("Adamawa", "Bauchi", "Borno","Gombe","Taraba", "Yobe"),
    NORTHWEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTHEAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTHSOUTH("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTHWEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");

    private final String [] states;

    GeopoliticalRegion (String ... state) {
        this.states = state;
    }
    public String[] getState(){
        return states;
    }
}
