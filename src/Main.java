public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKg = 82;
        double heightInMeters = 1.73;
        int bmi = service.calculate(weightInKg, heightInMeters);
        System.out.println(bmi);
    }
}
