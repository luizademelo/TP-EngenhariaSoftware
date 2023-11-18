package com.sistema_esportivo;

import com.sistema_esportivo.Utils.MenuScreens;
import com.sistema_esportivo.Utils.Loader;

public class Main {

    public static void main(String[] args){

        Loader.loadAllFunctions();
        MenuScreens.initialMenu();
    }
}