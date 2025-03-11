package DesafioDIO.entities;
import DesafioDIO.services.AppleStore;
import DesafioDIO.services.Internet;
import DesafioDIO.services.Ipod;
import DesafioDIO.services.Phone;

public class Iphone extends AppleStore implements Phone, Ipod, Internet {

    public Iphone(String nomeIphone, String aplicativo) {
        super(nomeIphone, aplicativo);
    }

    @Override
    public void iniciarInternet() {
        System.out.println("Iniciando navegação");
    }

    @Override
    public void iniciarIpod() {
        System.out.println("Iniciando Musica");
    }

    @Override
    public void iniciarPhone() {
        System.out.println("Iniciando ligação");
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "nomeIphone='" + nomeIphone + '\'' +
                ", aplicativo='" + aplicativos + '\'' +
                '}';
    }
}
