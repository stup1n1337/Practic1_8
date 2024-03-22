package com.mycompany.practic1_8;
import java.util.ArrayList;
import java.util.Scanner;
public class Practic1_8 {

    public static void main(String[] args) {
   ArrayList<Telephone> telephoneList = new ArrayList<>();
   telephoneList.add(new Telephone("Nokia", "1488", "Green", false));
   telephoneList.add(new Telephone("Samsung", "1337", "Blue", true));
   telephoneList.add(new Telephone("IPhone", "228", "Black", true));
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add telephone");
            System.out.println("2. Remove telephone by serial number");
            System.out.println("3. Remove all telephones");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter model: ");
                    String model = scanner.next();
                    System.out.print("Enter serial number: ");
                    String serialNumber = scanner.next();
                    if (telephoneList.stream().anyMatch(t -> t.serialNumber.equals(serialNumber))) {
                        System.out.println("Telephone with this serial number already exists.");
                    } else {
                        System.out.print("Enter color: ");
                        String color = scanner.next();
                        System.out.print("Is it mobile? (Yes/No): ");
                        String wtf = scanner.next();
                        boolean isMobile = wtf.contains("Yes");
                        telephoneList.add(new Telephone(model, serialNumber, color, isMobile));
                    }
                    break;
                case 2:
                    System.out.print("Enter serial number of telephone to remove: ");
                    String serialToRemove = scanner.next();
                    telephoneList.removeIf(t -> t.serialNumber.equals(serialToRemove));
                    break;
                case 3:
                    telephoneList.clear();
                    break;
            }

            System.out.println("Current telephone list:");
            for (Telephone telephone : telephoneList) {
                System.out.println(telephone);
            }
            System.out.println();
        }
    }
}
