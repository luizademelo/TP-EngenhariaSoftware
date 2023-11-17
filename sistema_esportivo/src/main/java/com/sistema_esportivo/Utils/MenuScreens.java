package com.sistema_esportivo.Utils;

import com.sistema_esportivo.Helpers.*;

import static com.sistema_esportivo.Utils.IOMethods.*;

public class MenuScreens {

    public static void initialMenu() {
        print("-------Bem Vindo(a) à Copa do Mundo!--------");
        print("-----------O que você procura?--------------");
        printLine();
        print("Selecione uma opção");
        print("(1) Times participantes");
        print("(2) Informações sobre locais");
        print("(3) Distribuição dos grupos");
        print("(4) Ver todas as partidas"); 
        print("(5) Regras e critérios");
        print("(6) Jogadores e Estatísticas");
        print("(7) Sair do sistema");

        boolean using = true;

        while(true) {
            int option = readInt();
            switch (option) {
                case 1:
                    TeamHelper.printAllTeams();
                    break;
                case 2:
                    StadiumHelper.printAllStadiums();
                    break;
                case 3:
                    GroupHelper.printAllgroups();
                    break;
                case 4:
                    MatchHelper.printAllMatches();
                    break;
                case 5:
                    RuleHelper.printAllrules();
                    break;
                case 6:
                    PlayerHelper.printAllPlayers();
                    break;
                case 7:
                    using = false;
                    break;
                default:
                    break;
            }

            if(!using)
                break;

            printLine();
            print("-----------Deseja mais algo?--------------");
            printLine();
            print("Selecione outra opção");
            print("(1) Times participantes");
            print("(2) Informações sobre locais");
            print("(3) Distribuição dos grupos");
            print("(4) Ver todas as partidas");
            print("(5) Regras e critérios");
            print("(6) Estatísticas relevantes");
            print("(7) Sair do sistema");
        }
    }

}
