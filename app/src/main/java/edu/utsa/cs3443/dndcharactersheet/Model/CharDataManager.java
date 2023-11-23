package edu.utsa.cs3443.dndcharactersheet.Model;

import android.app.Activity;
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import edu.utsa.cs3443.dndcharactersheet.Model.Attributes;
import edu.utsa.cs3443.dndcharactersheet.Model.Character;
import edu.utsa.cs3443.dndcharactersheet.Model.Statistics;

public class CharDataManager {
/**
    public Activity activity;
    public AssetManager assets;

    public CharDataManager(Activity activity){
        this.activity = activity;
        this.assets = activity.getAssets();
    }

    public Character loadCharacter(int saveFile){
        Attributes tempAtt;
        Statistics tempStats;

        String text;
        String[] line = null;

        //prepares a null scanner
        Scanner scan = null;
        try {
            //Creates an input sting that reads the file stated
            InputStream file = assets.open("Data.csv");
            //scans the input stram
            scan = new Scanner(file);
            //places each line from the file into an arrange
            while(scan.hasNextLine()){
                //System.out.println("do it");
                text = scan.nextLine();
                line = text.split(",");
                if (Integer.parseInt(line[0]) == saveFile)
                    break;
            }
        }catch (IOException e){
            //Catches an error
            System.out.println("Err");
        }
        finally {
            //closes once the file is finished reading
            scan.close();
        }


        tempStats = makeStatistics(line);
        tempAtt = makeAttributes(line);
        loadBonuses(tempStats, line);

        return new Character(tempStats,tempAtt);

    }

    private Attributes makeAttributes(String[] line){
        String name; String role;
        int ac; int spd;
        int hp; int initBonus;

        name = line[0]; role = line[1];
        ac = Integer.parseInt(line[2]); spd = Integer.parseInt(line[3]);
        hp = Integer.parseInt(line[4]); initBonus = Integer.parseInt(line[5]);

        return new Attributes(name,role, ac, spd, hp, initBonus);
    }
    private Statistics makeStatistics(String line[]){
        int str; int dex;
        int con; int itl;
        int wis; int chr;

        str = Integer.parseInt(line[6]);
        dex = Integer.parseInt(line[7]);
        con = Integer.parseInt(line[8]);
        itl = Integer.parseInt(line[9]);
        wis = Integer.parseInt(line[10]);
        chr = Integer.parseInt(line[11]);

        return new Statistics(str,dex,con,itl,wis,chr);
    }

    private void loadBonuses(Statistics statistics, String[] list){
        int a;
        for (int i =12; i <= list.length - 1; i++){
            a = Integer.parseInt(list[i]);
            statistics.setBonusValue(i,a);
        }
    }

    public void saveCharacter(int saveFile, Character character){
        Character temp;
        Attributes tempAtt;
        Statistics tempStats;



    }

    public boolean isEmpty(int saveFile){
        return true;
    }

**/
}
