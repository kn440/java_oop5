

import java.io.Console;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Unit.BaseUnit;
import Unit.Crossbowman;
import Unit.Farmer;
import Unit.Monk;
import Unit.Robber;
import Unit.Sniper;
import Unit.Spearman;
import Unit.Wizard;

public class Main {
    public static final int  GANG_SIZE =10;
    public static ArrayList<BaseUnit> whiteSide;
    public static ArrayList<BaseUnit> darkSide;
    public static ArrayList<BaseUnit> allUnit;

    public static void main (String[] args) {
        init();
        Scanner scanner = new Scanner(System.in);
        while (true){
            ConsoleView.view();
            makeStep();
            scanner.nextLine();
        }
    }

    private static void makeStep() {
    }

    private static void init() {
        whiteSide=new ArrayList<>();
        darkSide=new ArrayList<>();
        allUnit=new ArrayList<>();
        int x=1;
        int y=1;
        for (int i=0;i<GANG_SIZE;i++ ){
            switch(new Random().nextInt(4)){
                case 0: whiteSide.add(new Farmer(whiteSide, x, y++, GANG_SIZE)); break;
                case 1: whiteSide.add(new Robber(whiteSide, x, y++, GANG_SIZE)); break;
                case 2: whiteSide.add(new Sniper(whiteSide, x, y++, GANG_SIZE)); break;
                default: whiteSide.add(new Monk(whiteSide, x, y++, GANG_SIZE)); break;
            }
        }
        x=GANG_SIZE;
        y=1;
        for (int i=0; i<GANG_SIZE; i++){
            switch(new Random().nextInt(4)){
                case 0: darkSide.add(new Farmer(darkSide, x, y++, GANG_SIZE)); break;
                case 1: darkSide.add(new Spearman(darkSide, x, y++, GANG_SIZE)); break;
                case 2: darkSide.add(new Crossbowman(darkSide, x, y++, GANG_SIZE)); break;
                default: darkSide.add(new Wizard(darkSide, x, y++, GANG_SIZE)); break;
            }
    }
    allUnit.addAll(whiteSide);
    allUnit.addAll(darkSide);
}
}
