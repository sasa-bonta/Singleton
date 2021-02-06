package com.company.Lab2.Prototype;

import java.util.List;

/**
 * The prototype design pattern has been developed and is being used by a number of popular frameworks in Java.
 * In fact, one of the bean scopes in the Spring framework is the prototype scope. This scope signifies the creation
 * of a new object each time it is required. This pattern has a lot of benefits. A few of them are listed below:
 *
 * Provides a lower latency in creation of objects
 * Provides easier way of cloning objects
 * Reduces the load on the database for fetching the data
 * Improves overall application performance
 * Reduces the effort of cloning an object for the application developer
 * Make the cloning code independent of the implementing classes
 * Allows you to easily modify the existing class and its prototyping function which would not have been the case
 * if cloning takes place elsewhere
 */

public class Implementation {

    public static void main(String[] args) {
        ClientDetails clients = new ClientDetails();
        clients.getClients();

        ClientDetails clientsNew;

        try {
            clientsNew = (ClientDetails) clients.clone();
            ClientDetails clientsNew1 = (ClientDetails) clients.clone();
            List list = clientsNew.getClientList();
            list.add(new Client("user@test.user", "testSuccess"));
            List list1 = clientsNew1.getClientList();
            list1.remove(0);

            System.out.println("");
            System.out.println("###Clients List: " + clients.getClientList().size() + clients.getClientList());
            System.out.println("");
            System.out.println("###Clients New List: " + list.size() + list);
            System.out.println("");
            System.out.println("###Clients New1 List: " + list1.size() + list1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
