package DesafioDIO.services;

public abstract class AppleStore {
    protected String nomeIphone;
    protected String aplicativos;

    public AppleStore(String nomeIphone, String aplicativo) {
        this.nomeIphone = nomeIphone;
        this.aplicativos = aplicativo;
    }

}
