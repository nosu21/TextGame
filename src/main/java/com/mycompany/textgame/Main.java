
package com.mycompany.textgame;

import com.mycompany.textgame.domain.Location;
import com.mycompany.textgame.domain.Player;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        
        String playerName = askPlayerAboutName();
        
        Player player = new Player(playerName);
        Location startLoc = new Location("Mały pokoj", "Jesteś w małym ciemnym pokoju");
        
        player.setCurrentLocation(startLoc);
        System.out.println(player.getCurrentLocationDescription());
              
    }

    private static String askPlayerAboutName() {
        System.out.println("Podaj imię ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("\n Witaj w świecie " + name +"\n");
        scanner.close();
        return name;
    }
    
}
