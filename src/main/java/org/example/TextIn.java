package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextIn{
    public static ArrayList<Users> initUsers(){
        ArrayList<Users> users = new ArrayList<Users>();
        File file = new File("src/main/java/org/example/Users.text");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                int id = sc.nextInt();
                String name = sc.next();
                String pass = sc.next();
                String type = sc.nextLine();
                Users user = new Users(id,name,pass,type);
                users.add(user);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }

    public static ArrayList<Cart> initCart(){
        ArrayList<Cart> cart = new ArrayList<Cart>();
        File file = new File("src/main/java/org/example/Cart.text");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                int id = sc.nextInt();
                float price = sc.nextFloat();
                int number = sc.nextInt();
                sc.nextLine();
                Cart cart1 = new Cart(id,price,number);
                cart.add(cart1);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return cart;
    }

    public static ArrayList<Client> initClient(){
        ArrayList<Client> client = new ArrayList<Client>();
        File file = new File("src/main/java/org/example/Client.text");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                int id = sc.nextInt();
                String name = sc.next();
                String grade = sc.next();
                String regtime = sc.next();
                float cost = sc.nextFloat();
                String phone = sc.next();
                String email = sc.nextLine();
                Client client1 = new Client(id,name,grade,regtime,cost,phone,email);
                client.add(client1);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return client;
    }

    public static ArrayList<Goods> initGoods(){
        ArrayList<Goods> goods = new ArrayList<Goods>();
        File file = new File("src/main/java/org/example/Goods.text");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                int id = sc.nextInt();
                String name = sc.next();
                String producer = sc.next();
                float price = sc.nextFloat();
                int num = sc.nextInt();
                sc.nextLine();
                Goods goods1 = new Goods(id,name,producer,price,num);
                goods.add(goods1);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return goods;
    }

    public static ArrayList<History> initHistory(){
        ArrayList<History> history = new ArrayList<History>();
        File file = new File("src/main/java/org/example/History.text");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                int id = sc.nextInt();
                float price = sc.nextFloat();
                int number = sc.nextInt();
                String time =sc.nextLine();
                History history1 = new History(id,price,number,time);
                history.add(history1);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return history;
    }


}
