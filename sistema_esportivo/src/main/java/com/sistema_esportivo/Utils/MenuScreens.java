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
                    printLine();
                    print("TIMES PARTICIPANTES");
                    printLine();
                    TeamHelper.printAllTeams();
                    break;
                case 2:
                    printLine();
                    print("LOCALIZAÇÕES");
                    printLine();
                    LocationsPrinter.printAllLocations();
                    break;
                case 3:
                    printLine();
                    print("GRUPOS");
                    printLine();
                    GroupHelper.printAllgroups();
                    break;
                case 4:
                    printLine();
                    print("PARTIDAS");
                    printLine();
                    MatchHelper.printAllMatches();
                    break;
                case 5:
                    printLine();
                    print("REGRAS E CRITÉRIOS");
                    printLine();
                    RuleHelper.printAllrules();
                    break;
                case 6:
                    printLine();
                    print("JOAGADORES E ESTATÍSTICAS");
                    printLine();
                    PlayerHelper.printAllPlayers();
                    break;
                case 7:
                    using = false;
                    printLine();
                    print("Saindo do sistema. Volte sempre!");
                    break;
                default:
                    printLine();
                    print("Opção inválida. Tente novamente.");
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
            print("(6) Jogadores e Estatísticas");
            print("(7) Sair do sistema");
        }
    }

}
