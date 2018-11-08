package com.unava.dia.retrofitdotaopenapi.model;

/**
 * Created by Dia on 05.11.2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayerMatches {

    @SerializedName("match_id")
    @Expose
    private Long matchId;

    @SerializedName("player_slot")
    @Expose
    private Integer playerSlot;

    @SerializedName("radiant_win")
    @Expose
    private Boolean radiantWin;

    @SerializedName("duration")
    @Expose
    private Integer duration;

    @SerializedName("game_mode")
    @Expose
    private Integer gameMode;

    @SerializedName("lobby_type")
    @Expose
    private Integer lobbyType;

    @SerializedName("hero_id")
    @Expose
    private Integer heroId;

    @SerializedName("start_time")
    @Expose
    private Integer startTime;

    @SerializedName("version")
    @Expose
    private Object version;

    @SerializedName("kills")
    @Expose
    private Integer kills;

    @SerializedName("deaths")
    @Expose
    private Integer deaths;

    @SerializedName("assists")
    @Expose
    private Integer assists;

    @SerializedName("skill")
    @Expose
    private Object skill;

    @SerializedName("leaver_status")
    @Expose
    private Integer leaverStatus;

    @SerializedName("party_size")
    @Expose
    private Object partySize;

    @Override
    public String toString() {
        String str = " match id: " + matchId.toString()
                + "  K: " + kills.toString()
                +"  D:  " + deaths.toString()
                + "  A:  " + assists.toString();
        return str;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Integer getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(Integer playerSlot) {
        this.playerSlot = playerSlot;
    }

    public Boolean getRadiantWin() {
        return radiantWin;
    }

    public void setRadiantWin(Boolean radiantWin) {
        this.radiantWin = radiantWin;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getGameMode() {
        return gameMode;
    }

    public void setGameMode(Integer gameMode) {
        this.gameMode = gameMode;
    }

    public Integer getLobbyType() {
        return lobbyType;
    }

    public void setLobbyType(Integer lobbyType) {
        this.lobbyType = lobbyType;
    }

    public Integer getHeroId() {
        return heroId;
    }

    public void setHeroId(Integer heroId) {
        this.heroId = heroId;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Object getSkill() {
        return skill;
    }

    public void setSkill(Object skill) {
        this.skill = skill;
    }

    public Integer getLeaverStatus() {
        return leaverStatus;
    }

    public void setLeaverStatus(Integer leaverStatus) {
        this.leaverStatus = leaverStatus;
    }

    public Object getPartySize() {
        return partySize;
    }

    public void setPartySize(Object partySize) {
        this.partySize = partySize;
    }
}