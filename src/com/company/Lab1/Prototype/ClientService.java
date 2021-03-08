package com.company.Lab1.Prototype;

import java.util.ArrayList;

public class ClientService {

    ArrayList clients;

    public ClientService() {
        clients = new ArrayList();

        clients.add(new Client("skoch@optonline.net", "cMfQ98rF"));
        clients.add(new Client("gtewari@verizon.net", "xSArh9Wzn"));
        clients.add(new Client("xtang@verizon.net", "nSm9j93N"));
        clients.add(new Client("rnelson@me.com", "MbHTZ4wM"));
        clients.add(new Client("wonderkid@gmail.com", "wHKRPfs7"));
//        clients.add(new Client("carmena@sbcglobal.net", "Timestamp:"));
//        clients.add(new Client("sfoskett@icloud.com", "2021-02-06 21:43:45 UTC"));
//        clients.add(new Client("flakeg@mac.com", "jqMxw846"));
//        clients.add(new Client("brainless@yahoo.ca", "5adbZ3yt"));
//        clients.add(new Client("geeber@yahoo.com", "C6cGRHKE"));
//        clients.add(new Client("wenzlaff@optonline.net", "yQz45QQt"));
//        clients.add(new Client("sjava@yahoo.ca", "8wT3yh9f"));
    }

    public ArrayList getClients() {
        return clients;
    }
}
