public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MenuItem> menu1 = new ArrayList<>();
        List<String> menu2= new ArrayList<>();

        menu1.add(new MenuItem("1", "Nasi Goreng", 20000, 10, Category.FOOD));
        menu1.add(new MenuItem("2", "Sate", 25000, 8, Category.FOOD));
        menu1.add(new MenuItem("3", "Mie Ayam", 15000, 12, Category.FOOD));
        menu1.add(new MenuItem("4", "Es Teh", 5000, 20, Category.DRINK));
        menu1.add(new MenuItem("5", "Es Teh Lemon", 7000, 15, Category.DRINK));
        menu1.add(new MenuItem("6", "Air Putih", 3000, 30, Category.DRINK));
        menu1.add(new MenuItem("7", "Es Cream", 10000, 10, Category.DESSERT));
        menu1.add(new MenuItem("8", "Pudding", 12000, 10, Category.DESSERT));
        menu1.add(new MenuItem("9", "Cake", 20000, 5, Category.DESSERT));

        double total = 0;
        while (true) {
            System.out.println("\n  DAFTAR MENU ");
            for (MenuItem item : menu1) {
                System.out.println(item.getId() + ". " + item.getName() +
                        " - Stock: " + item.getStock());
            }
            try {
                System.out.print("Choose the Menu: ");
                String pilihan = scanner.nextLine();
                
                MenuItem selectedItem = null;
                for (MenuItem item : menu1) {
                    if (item.getId().equals(pilihan)) {
                        selectedItem = item;
                        break;
                    }
                }
                if (selectedItem == null) {
                    System.out.println("Menu tidak ditemukan!");
                    continue;
                }
                System.out.print("Masukkan jumlah pesanan: ");
                int jumlah = scanner.nextInt();
                scanner.nextLine(); 

                if (jumlah > selectedItem.getStock()) {
                    throw new ExceptionHandling("Stok tidak mencukupi untuk " + selectedItem.getName());
                }
                double total1 = selectedItem.getPrice() * jumlah;
                total += total1;
                menu2.add(selectedItem.getName() + " x" + jumlah + " = " + total1);

                selectedItem.setStock(selectedItem.getStock() - jumlah);
                System.out.println("\nDETAIL PESANAN");
                System.out.println("Menu   : " + selectedItem.getName());
                System.out.println("Jumlah : " + jumlah);
                System.out.println("Total  : " + total1);
                System.out.println("Pesanan Berhasil Dicatat!");
                System.out.print("Tambah pesanan lagi? (y/n): ");
                String lanjut = scanner.nextLine();

                if (lanjut.equalsIgnoreCase("n")) {
                    break;
                }

            } catch (ExceptionHandling e) {
                System.out.println("Gagal: " + e.getMessage());

            } catch (Exception e) {
                System.out.println("Terjadi kesalahan pada input!");
                scanner.nextLine();
            }
        }

        System.out.println("\n===== STRUK BELANJA =====");
        for (String item : menu2) {
            System.out.println(item);
        }
        System.out.println("--------------------");
        System.out.println("TOTAL Rp. " + total);
        System.out.println("====================");

        scanner.close();
    }
}