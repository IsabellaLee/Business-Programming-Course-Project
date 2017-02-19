/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portfolioapp;

import java.util.LinkedList;

/**
 *
 * @author isabellalee
 */
public class PortfolioSystem {
    private static LinkedList<User> userList = new LinkedList<User>();

    public PortfolioSystem() {
    }

    public static LinkedList<User> getUserList() {
        return userList;
    }

    public static void setUserList(LinkedList<User> userList) {
        PortfolioSystem.userList = userList;
    }
    
    public static void addUser(String firstName, String lastName, String riskPreference, String bankAccountNum, String brokerageNum, String password) {
        userList.add(new User(firstName, lastName, riskPreference, bankAccountNum, brokerageNum, password));
    }
    public static User searchUser(String firstName) {
        for(int i=0; i < userList.size(); i++) {
                if(firstName.equals(userList.get(i).getFirstName())) return userList.get(i);
        }
        return null;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        StartScreenGUI g = new StartScreenGUI();
        g.setVisible(true);
    }
}
