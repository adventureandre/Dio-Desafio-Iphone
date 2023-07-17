package com.iphone;

import com.iphone.services.navegar.Navegar;
import com.iphone.services.reproduzir.Reproduzir;
import com.iphone.services.telefone.Telefone;

public class Iphone implements Navegar, Telefone, Reproduzir {
    private boolean powerStatus;
    private boolean musicaPlay = false;
    private String msnDesligado = "O telefone está desligado";

    // BASICO DO IPHONE
    public void Power() {
        this.powerStatus = !this.powerStatus;
    }

    public void status() {
        System.out.println("O telefone está: " + (this.powerStatus ? "Ligado" : "Desligado"));
    }

    // NAVEGAÇÃO
    @Override
    public void navegarWeb() {
        if (powerStatus) {
            System.out.println("Você está navegando na web!");
        } else {
            System.out.println(msnDesligado);
        }
    }

    @Override
    public void adicionarNovaAba() {
        if (powerStatus) {
            System.out.println("Nova aba adicionada!");
        } else {
            System.out.println(msnDesligado);
        }
    }

    @Override
    public void atualizarPagina() {
        if (powerStatus) {
            System.out.println("Página atualizada!");
        } else {
            System.out.println(msnDesligado);
        }
    }

    // REPRODUZIR
    @Override
    public void tocar() {
        if (powerStatus) {
            if (musicaPlay) {
                System.out.println("A música já está tocando!");
                return;
            }
            System.out.println("Tocando música");
            musicaPlay = true;

        } else {
            System.out.println(msnDesligado);
        }
    }

    @Override
    public void pausar() {
        if (powerStatus) {
            if (musicaPlay) {
                System.out.println("Música pausada");
                musicaPlay = false;
            } else {
                System.out.println("Música despausada");
                musicaPlay = true;
            }
        } else {
            System.out.println(msnDesligado);
        }
    }

    @Override
    public void selecionarMusica() {
        if (powerStatus) {
            System.out.println("Música selecionada!");
        } else {
            System.out.println(msnDesligado);
        }
    }

    // TELEFONE
    @Override
    public void ligar() {
        if (powerStatus) {
            System.out.println("Ligando...");
        } else {
            System.out.println(msnDesligado);
        }
    }

    @Override
    public void atender() {
        if (powerStatus) {
            System.out.println("Atendendo chamada...");
        } else {
            System.out.println(msnDesligado);
        }
    }

    @Override
    public void iniciarCorrerioVoz() {
        if (powerStatus) {
            System.out.println("Iniciando correio de voz...");
        } else {
            System.out.println(msnDesligado);
        }
    }


}
