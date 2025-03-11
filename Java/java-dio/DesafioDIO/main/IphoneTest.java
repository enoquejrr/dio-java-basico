package DesafioDIO.main;

import DesafioDIO.entities.Iphone;

public class IphoneTest {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone da DIO", "DIO");

        iphone.iniciarInternet();
        iphone.iniciarIpod();
        iphone.iniciarPhone();

        System.out.println(iphone);
    }
}
