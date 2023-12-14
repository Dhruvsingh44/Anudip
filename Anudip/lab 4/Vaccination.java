abstract class Vaccine {
    int age;
    String nationality;

    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    public void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("You are eligible for the first dose of the vaccine.");
            System.out.println("Please pay Rs. 250.");
        } else {
            System.out.println("Sorry, you are not eligible for the first dose.");
        }
    }

    public void secondDose() {
        System.out.println("You can take the second dose only after completing the first dose.");
    }

    public abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine {
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose() {
        System.out.println("You are eligible for the booster dose of the vaccine.");
        System.out.println("Please consult your healthcare provider for the booster dose schedule.");
    }
}

public class Vaccination {
    public static void main(String[] args) {
        // Sample input
        int age = 18;
        String nationality = "Indian";

        // Create an object of VaccinationSuccessful
        Vaccine user = new VaccinationSuccessful(age, nationality);

        // Scenario 1: First Dose
        user.firstDose();

        // Scenario 2: Second Dose
        user.secondDose();

        // Scenario 3: Booster Dose
        user.boosterDose();
    }
}
