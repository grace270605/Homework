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
    for(
    int i = 0;i<JMenuItem.size();i++)

    {
        System.out.println(i + 1) + "." + JMenuItem.get(i).getName() + "-Stock:" + JMenuItem.get(i).getStock();
    }
    System.out.print("Pilih menu(nomor):");
    int pilihan = sc.nextInt();
}
if(pilihan < 1 || pilihan >JMenuItem.size()){
        System.out.

println("Pilihan  Tidak Valid!");
    return;
            }
MenuItem selectedItem = menuList.get(pilihan -1);

System.out.println("Masukkan jumlah pesanan:");
int jumlah = sc.nextInt();

System.out.println("\n===DETAIL  PESANAN===");
System.out.println("Menu: "+ selectedItem.getName());
System.out.println("Jumlah:"+ jumlah);

selectedItem.setStock(selectedItem.getStock()-jumlah);
System.out.println("Pesanan Berhasil Dicatat!");
