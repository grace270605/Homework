public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MenuItem> menu1 = new ArrayList<>();

        menu1.add(new MenuItem("1", "Nasi Goreng", 20000, 10, Category.FOOD));
        menu1.add(new MenuItem("2", "Sate", 25000, 8, Category.FOOD));
        menu1.add(new MenuItem("3", "Mie Ayam", 15000, 12, Category.FOOD));
        menu1.add(new MenuItem("4", "Es Teh", 5000, 20, Category.DRINK));
        menu1.add(new MenuItem("5", "Es Teh Lemon", 7000, 15, Category.DRINK));
        menu1.add(new MenuItem("6", "Air Putih", 3000, 30, Category.DRINK));
        menu1.add(new MenuItem("7", "Es Cream", 10000, 10, Category.DESSERT));
        menu1.add(new MenuItem("8", "Pudding", 12000, 10, Category.DESSERT));
        menu1.add(new MenuItem("9", "Cake", 20000, 5, Category.DESSERT));

        System.out.println("Choose the menu :");
        String menu = scanner.nextLine();
    }
}