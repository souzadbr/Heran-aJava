package br.com.zup.Exemplo2;

import java.lang.reflect.GenericArrayType;

public class Main {
    public static void main(String[] args) {
        Guerreiros guerreiros = new Guerreiros("trovão", "Armadura","Thor", 100, "Martelo");
        Voadores voador = new Voadores("Anivia", "Azul", "Gelo", 800, 50);

        int danoAplicado = voador.aplicarDano();
        System.out.println(guerreiros.getVida());
        guerreiros.perderVida(voador.aplicarDano());
    }
        }
