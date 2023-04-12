

import java.util.*;
/*
 * 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
 */

public class Task1 {
    public static void main(String[] args) {
        phoneBookMain();

    }
    
    
    //----------------------- Меню

    static void phoneBookMain() {
        Map<String, List<String>> phoneBook = new HashMap<>();
        Scanner in = new Scanner(System.in, "CP866");
        boolean flag = true;
        while (flag) {
            System.out.println("\n Choose an action please: \n 1 - Add a record to list" +
                    " \n 2 - Search a last name \n 3 - Print the list \n 4 - Exit \n");
            String choice = in.next();
            switch (choice) {
                case "1":
                    recording(phoneBook);
                    System.out.println("Added\n");
                    break;
                case "2":
                    search(phoneBook);
                    System.out.println("Search complited");
                    break;
                case "3":
                    System.out.println("The list is \n");
                    System.out.println(phoneBook);
                    break;
                case "4":
                    flag = false;
                    System.out.println("Exiting");
                    break;
                default:
                    break;
            }
        }
    }
    

    static void recording(Map<String, List<String>> phoneBook) {
        Scanner in = new Scanner(System.in, "CP866");
        System.out.println("Please enter First and Last names");
        String data = in.nextLine();
        System.out.println("Enter a phone number");
        String number = in.nextLine();

        if (phoneBook.containsKey(data)) {
            List<String> list = phoneBook.get(data);
            list.add(number);
        } else {
            List<String> list = new ArrayList<>();
            list.add(number);
            phoneBook.put(data, list);
        }
    }


    static void search(Map<String, List<String>> phoneBook) {
        Scanner in = new Scanner(System.in, "CP866");
        System.out.println("Please enter First and Last name");
        String data = in.nextLine();
        
        for (String record : phoneBook.keySet()) {
            if (record.toLowerCase().contains(data.toLowerCase())) {
                List<String> list = phoneBook.get(record);
                System.out.println(record + list);
            }
        }  
    }
    

}
