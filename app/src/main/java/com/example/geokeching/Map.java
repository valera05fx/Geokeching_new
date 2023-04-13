package com.example.geokeching;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Geocoder;
import android.os.Bundle;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.GeoObjectCollection;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.mapview.MapView;

public class Map extends AppCompatActivity {
    private MapView mapview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);


        MapKitFactory.initialize(this);

        // Укажите имя Activity вместо map.
        setContentView(R.layout.activity_map);
        mapview = (MapView)findViewById(R.id.mapview);
        com.yandex.mapkit.map.Map map = mapview.getMap();
        map.move(
                new CameraPosition(new Point(55.751574, 37.573856), 11.0f, 0.0f, 0.0f),
                new Animation(Animation.Type.SMOOTH, 0),
                null);
        map.getMapObjects().addPlacemark(new Point(55.75222, 37.61556));

        //добавление слоя дорог и улиц
        GeoObjectCollection geoObjects = new GeoObjectCollection();


    }


}