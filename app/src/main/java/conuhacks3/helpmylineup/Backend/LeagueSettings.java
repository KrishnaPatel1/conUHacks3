package conuhacks3.helpmylineup.Backend;

/**
 * Created by krish on 2018-01-27.
 */

public class LeagueSettings {

    private static int[] settings = new int[2];
    public enum StatValues{
        GOALS(0),
        ASSISTS(1),
        /*POINTS(2),
        PIM(3),
        PPG(4),
        PPA(5),
        PPP(6),
        SHG(7),
        SHA(8),
        SHP(9),
        GWG(10),
        FW(11),
        FL(12),
        HIT(13),
        BLK(14),

        GS(15),
        WIN(16),
        LOSS(17),
        SHO(18),
        SA(19),
        SV(20),
        GA(21),
        GAA(22);*/;


        private int index;
        StatValues(int index){this.index = index;}
        public int getIndex(){return this.index;}
    };

    public static int GetValue(StatValues stat)
    {
        return settings[stat.getIndex()];
    }
}
