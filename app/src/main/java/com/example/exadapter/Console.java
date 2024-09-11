package com.example.exadapter;

import java.util.ArrayList;
import java.util.List;

public class Console {

    public String nome;
    public String ano;
    public int img;

    public Console(String nome, int img, String ano) {
        this.nome = nome;
        this.img = img;
        this.ano = ano;
    }

    public static List<Console> getConsoles(){
        List<Console> consoles = new ArrayList<>();
        consoles.add(new Console("PlayStation 1", R.drawable.ps1, "Lançamento: 3 de dezembro de 1994"));
        consoles.add(new Console("PlayStation 2", R.drawable.ps2, "Lançamento: 4 de março de 2000"));
        consoles.add(new Console("PlayStation 3", R.drawable.ps3, "Lançamento: 11 de novembro de 2006"));
        consoles.add(new Console("PlayStation 4", R.drawable.ps4, "Lançamento: 15 de novembro de 2013"));
        consoles.add(new Console("PlayStation 5", R.drawable.ps5, "Lançamento: 12 de novembro de 2020"));
        return consoles;
    }
}
