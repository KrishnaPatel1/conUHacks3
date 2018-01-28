package conuhacks3.helpmylineup.Backend;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by luca3 on 1/28/2018.
 */

public class Players {
    public static String getPlayer(String playerName) {
        try {
            JSONArray teams = HttpClient.GET(Constant.URI_PRE + Constant.URI_TEAMS);
g
            for (int i = 0; i < teams.length(); i++) {
                JSONObject team = teams.getJSONObject(i);
                String teamId = (String) team.get("Id");
                JSONArray players = HttpClient.GET(Constant.URI_PRE + Constant.URI_TEAM_PLAYERS + teamId);

                for (int j = 0; j < players.length(); j++) {
                    JSONObject player = players.getJSONObject(j);
                    String playerLastName = (String) player.get("LastName");
                    if (playerLastName.equalsIgnoreCase(playerName)) {
                        System.out.println("Found" + playerLastName);
                        return playerLastName;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
