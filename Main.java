public class Main{
    public static void main(String[] args) {
        List<MenuItem> menu1 = new ArrayList<>();

        menu1.add(new MenuItem("Nasi Goreng", 20000, 10, Category.FOOD));
        menu1.add(new MenuItem("Sate", 25000, 8, Category.FOOD));
        menu1.add(new MenuItem("Mie Ayam", 15000, 12, Category.FOOD));
        menu1.add(new MenuItem("Es Teh", 5000, 20, Category.DRINK));
        menu1.add(new MenuItem("Es Teh Lemon", 7000, 15, Category.DRINK));
    }
}