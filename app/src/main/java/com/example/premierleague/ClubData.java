package com.example.premierleague;

import java.util.ArrayList;

public class ClubData {
    private static String [] clubName = {
            "Arsenal",
            "Aston Villa",
            "Brighton & Hove Albion",
            "Burnley",
            "Chelsea",
            "Crystal Palace",
            "Everton",
            "Fulham",
            "Leeds United",
            "Leicester City",
            "Liverpool",
            "Manchester City",
            "Manchester United",
            "Newcastle United",
            "Sheffield United",
            "Southampton",
            "Tottenham Hotspur",
            "West Bromwich Albion",
            "West Ham United FC",
            "Wolverhampton Wanderers"
    };

    private static String [] clubDetail = {
            "Arsenal club bola 1",
            "Aston Villa club bola 2 ",
            "Brighton & Hove Albion club bola 3",
            "Burnley club bola 4",
            "Chelsea",
            "Crystal Palace club bola 5",
            "Everton club bola 6",
            "Fulham club bola 7",
            "Leeds United club bola 8",
            "Leicester City club bola 9",
            "Liverpool club bola 10",
            "Manchester City club bola 11",
            "Manchester United club bola 12",
            "Newcastle United club bola 13",
            "Sheffield United club bola 14",
            "Southampton club bola 15",
            "Tottenham Hotspur club bola 16",
            "West Bromwich Albion club bola 17",
            "West Ham United FC club bola 18",
            "Wolverhampton Wanderers club bola 19"

    };

    private static int[] clubimage = {
            R.drawable.arsenal,
            R.drawable.aston,
            R.drawable.brighton,
            R.drawable.burnley,
            R.drawable.chelsea,
            R.drawable.crystal,
            R.drawable.everton,
            R.drawable.fulham,
            R.drawable.leeds,
            R.drawable.leicester,
            R.drawable.liverpool,
            R.drawable.mancity,
            R.drawable.manutd,
            R.drawable.newcastle,
            R.drawable.sheffield,
            R.drawable.southampton,
            R.drawable.tottenham,
            R.drawable.wba,
            R.drawable.westham,
            R.drawable.wolverhampton
    };

    static ArrayList<Club> getListData(){
        ArrayList<Club> list = new ArrayList<>();
        for (int position = 0; position <clubName.length; position++){
            Club club = new Club();
            club.setNama(clubName[position]);
            club.setDetail(clubDetail[position]);
            club.setPhoto(clubimage[position]);
            list.add(club);
        }
        return list;
    }


}
