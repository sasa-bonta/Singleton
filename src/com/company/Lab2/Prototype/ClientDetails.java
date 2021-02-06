package com.company.Lab2.Prototype;

import java.util.ArrayList;
import java.util.List;

public class ClientDetails implements Cloneable {

    private ArrayList clientList;

    public ClientDetails() {
        this.clientList = new ArrayList<>();
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
    protected Object clone() throws CloneNotSupportedException {
        List temp = new ArrayList();
        for (Object c: this.getClientList()) {
            temp.add(c);
        }
        return new ClientDetails((ArrayList) temp);
    }
}
