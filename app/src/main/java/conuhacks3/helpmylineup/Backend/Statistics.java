package conuhacks3.helpmylineup.Backend;

/**
 * Created by krish on 2018-01-27.
 */

public class Statistics {

    double toi;
    int gp;

    int goals;
    int assists;
    int points;
    int pim;
    int ppg;
    int ppa;
    int ppp;
    int shg;
    int sha;
    int shp;
    int gwg;
    int fw;
    int fl;
    int hit;
    int blk;

    int gs;
    int win;
    int loss;
    int sho;
    int sa;
    int sv;
    int ga;
    int gaa;

    public double avgGoalSeason(){
       return this.goals/this.gp*LeagueSettings.GetValue(LeagueSettings.StatValues.GOALS);
    }
    public double avgAssistsSeason(){
        return this.assists/this.gp*LeagueSettings.GetValue(LeagueSettings.StatValues.ASSISTS);
    }
    /*TODO
    public double avgPointsSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.points/this.gp*sett.points;
    }

    public double avgPimSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.pim/this.gp*sett.pim;
    }
    public double avgPpgSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.ppg/this.gp*sett.ppg;
    }
    public double avgPpaSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.ppa/this.gp*sett.ppa;
    }
    public double avgPppSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.ppp/this.gp*sett.ppp;
    }
    public double avgShgSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.shg/this.gp*sett.shg;
    }
    public double avgShaSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.sha/this.gp*sett.sha;
    }
    public double avgShpSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.shp/this.gp*sett.shp;
    }
    public double avgGwgSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.gwg/this.gp*sett.gwg;
    }
    public double avgFwSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.fw/this.gp*sett.fw;
    }
    public double avgFlSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.fl/this.gp*sett.fl;
    }
    public double avgHitSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.hit/this.gp*sett.hit;
    }
    public double avgBlkSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.blk/this.gp*sett.blk;
    }
    public double avgWinSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.win/this.gp*sett.win;
    }
    public double avgLossSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.loss/this.gp*sett.loss;
    }
    public double avgShoSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.sho/this.gp*sett.sho;
    }
    public double avgSaSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.sa/this.gp*sett.sa;
    }
    public double avgSvSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.sv/this.gp*sett.sv;
    }
    public double avgGaSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.ga/this.gp*sett.ga;
    }
    public double avgGasSeason(conuhacks3.helpmylineup.Backend.LeagueSettings sett){
        return this.gaa/this.gp*sett.gaa;
    }*/
}
