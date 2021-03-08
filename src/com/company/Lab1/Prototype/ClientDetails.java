package com.company.Lab1.Prototype;

import java.util.ArrayList;
import java.util.List;

public class ClientDetails implements Cloneable {

    public ArrayList<Client> clientList;

    public ClientDetails() {
        this.clientList = new ArrayList<Client>();
    }

    public ClientDetails(ArrayList clients) {
        this.clientList = clients;
    }

    public void getClients() {
        ClientService cs = new ClientService();
        this.clientList = cs.getClients();
    }

    public ArrayList getClientList() {
        return clientList;
    }

    @Override
    protected ClientDetails clone() throws CloneNotSupportedException {         // Override al metodei Cloneable.clone
        List temp = new ArrayList();                                            // Se creaza o lista temp
        for (Object c: this.getClientList()) {                                  // foreach pentru lista Clients
            Client client = (Client) c;                                         // Clientul client = obiectul c de tipul Client
            Client clientNew = new Client(client.email, client.password);       // clientNew are aceleasi atribute (email, password) ca si client
            temp.add(clientNew);                                                // clientNew este adaugat la lista temp
        }
        return new ClientDetails((ArrayList) temp);                             // ClientDetails returneaza lista temp
    }
}
