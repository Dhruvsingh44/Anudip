class HillStations {
    public void location() {
        System.out.println("Hill Station - Location");
    }

    public void famousFor() {
        System.out.println("Hill Station - Famous For");
    }
}

class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Manali - Himachal Pradesh");
    }

    @Override
    public void famousFor() {
        System.out.println("Manali - Adventure Sports");
    }
}

class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Mussoorie - Uttarakhand");
    }

    @Override
    public void famousFor() {
        System.out.println("Mussoorie - Scenic Beauty");
    }
}

class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Gulmarg - Jammu and Kashmir");
    }

    @Override
    public void famousFor() {
        System.out.println("Gulmarg - Skiing");
    }
}

public class HillStationsDemo {
    public static void main(String[] args) {
        // Calling methods using superclass reference
        HillStations hillStation = new HillStations();
        hillStation.location();
        hillStation.famousFor();

        // Calling methods using subclass references
        Manali manali = new Manali();
        Mussoorie mussoorie = new Mussoorie();
        Gulmarg gulmarg = new Gulmarg();

        manali.location();
        manali.famousFor();

        mussoorie.location();
        mussoorie.famousFor();

        gulmarg.location();
        gulmarg.famousFor();
    }
}
