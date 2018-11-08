package com.unava.dia.retrofitdotaopenapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.unava.dia.retrofitdotaopenapi.model.PlayerMatches;

import java.util.ArrayList;
import java.util.List;


import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    public List<PlayerMatches> list;
    public List<String> matchesInfoStrings;

    String playerId = "187666576";

    @BindView(R.id.listView) ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        list = new ArrayList<>();
        matchesInfoStrings = new ArrayList<>();
    }


    public void onFindClick(View view) {
        //TODO по клику достаем из editText номер матча и ищем его.
        //TODO поправить разметку
        getPlayerMatch(playerId);
    }

    private void getPlayerMatch(String playerId) {
        APIClient.getInstance()
                .getPlayerMatch(playerId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<PlayerMatches>>() {

                    @Override public void onError(Throwable e) {
                        e.printStackTrace();
                        Log.d("ddd", "In onError()");
                    }

                    @Override
                    public void onComplete() {
                        Log.d("ddd", "In onCompleted()");

                        for (PlayerMatches temp : list) {
                            matchesInfoStrings.add(temp.toString());
                        }

                        // пихаем в адаптер
                        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,
                                android.R.layout.simple_list_item_1, matchesInfoStrings);

                        listView.setAdapter(adapter);
                    }

                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override public void onNext(List<PlayerMatches> users) {
                        Log.d("ddd", "In onNext()");
                        list = users;
                    }
                });

    }

}
