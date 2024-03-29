package conuhacks3.helpmylineup.Backend;

/**
 * Created by krish on 2018-01-27.
 */

public class Constant {

    public enum teamID {
        Anaheim(3),
        Arizona(6),
        Boston(18),
        Buffalo(21),
        Calgary(4),
        Carolina(27),
        Chicago(9),
        Colorado(8),
        Columbus(24),
        Dallas(10),
        Detroit(16),
        Edmonton(2),
        Florida(17),
        LosAngeles(7),
        Minnesota(13),
        Montreal(20),
        NewJersey(29),
        NewYorkIslanders(25),
        NewYorkRangers(26),
        Ottawa(15),
        Philadelphia(28),
        Pittsburg(23),
        SaintLouis(14),
        SanJose(5),
        TampaBay(22),
        Toronto(19),
        Vancouver(1),
        Vegas(35),
        Washington(30),
        Winnipeg(12);

        public int iD;
        teamID(int id){
            iD = id;
        }
        public int getId(teamID team){
            return team.iD;
        }
    }

    public static final String URI_PRE = "http://conu.astuce.media:9993";
    public static final String URI_TEAMS = "/api/sports/hockey/teams/?Id=";
    public static final String URI_TEAM_PLAYERS = "/api/sports/hockey/team/persons?TeamId=";


}
