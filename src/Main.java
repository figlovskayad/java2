public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98
        double height = 1.87;
        int index = (int) service.calculate(height, weight);
        System.out.println(index);
    }
}
