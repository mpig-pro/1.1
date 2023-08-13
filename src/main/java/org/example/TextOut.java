package org.example;

import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class TextOut {
    public static void outUsers(ArrayList<Users> users) throws IOException {
        try (FileWriter fileWriter = new FileWriter("src/main/java/org/example/Users.text")) {
            String str = "";
            for(Users user : users){
                str=str+user.getId()+" "+user.getName()+" "+user.getPass()+" "+user.getType()+"\n";
            }
            fileWriter.append(str);
        }
    }

    public static void outCart(ArrayList<Cart> cart) throws IOException {
        try (FileWriter fileWriter = new FileWriter("src/main/java/org/example/Cart.text")) {
            String str = "";
            for(Cart cart1 : cart){
                str=str+cart1.getId()+" "+cart1.getPrice()+" "+cart1.getNum()+"\n";
            }
            fileWriter.append(str);
        }
    }

    public static void outClient(ArrayList<Client> client) throws IOException {
        try (FileWriter fileWriter = new FileWriter("src/main/java/org/example/Client.text")) {
            String str = "";
            for(Client client1: client){
                str=str+client1.getId()+" "+client1.getName()+" "+client1.getGrade()+" "+client1.getRegtime()+" "+client1.getCost()+" "+client1.getPhone()+" "+client1.getEmail()+"\n";
            }
            fileWriter.append(str);
        }
    }

    public static void outGoods(ArrayList<Goods> goods) throws IOException {
        try (FileWriter fileWriter = new FileWriter("src/main/java/org/example/Goods.text")) {
            String str = "";
            for(Goods goods1 : goods){
                str=str+goods1.getId()+" "+goods1.getName()+" "+goods1.getProducer()+" "+goods1.getPrice()+" "+goods1.getNum()+"\n";
            }
            fileWriter.append(str);
        }
    }

    public static void outHistory(ArrayList<History> history) throws IOException {
        try (FileWriter fileWriter = new FileWriter("src/main/java/org/example/History.text")) {
            String str = "";
            for(History history1 : history){
                str=str+history1.getId()+" "+history1.getPrice()+" "+history1.getNum()+" "+history1.getTime()+"\n";
            }
            fileWriter.append(str);
        }
    }
}
