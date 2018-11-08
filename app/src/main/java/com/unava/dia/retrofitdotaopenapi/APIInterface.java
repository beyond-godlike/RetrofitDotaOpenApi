package com.unava.dia.retrofitdotaopenapi;

import com.unava.dia.retrofitdotaopenapi.model.PlayerMatches;

import java.util.List;
import io.reactivex.Observable;

import retrofit2.http.*;

/**
 * Created by Dia on 05.11.2018.
 */

public interface APIInterface {
    // Get Player Profile
    @GET("players/{accountId}/matches")
    Observable<List<PlayerMatches>> getPlayerMatches(@Path("accountId") String accountId);
}