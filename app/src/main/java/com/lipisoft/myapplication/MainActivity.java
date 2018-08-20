package com.lipisoft.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kr.go.seoul.trafficbus.TrafficBusButtonTypeA;
import kr.go.seoul.trafficbus.TrafficBusButtonTypeB;
import kr.go.seoul.trafficbus.TrafficBusButtonTypeN;
import kr.go.seoul.trafficbus.TrafficBusTypeMini;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TrafficBusButtonTypeA typeA = findViewById(R.id.trafficBusButtonTypeA);
        final TrafficBusButtonTypeB typeB = findViewById(R.id.trafficBusButtonTypeB);
        final TrafficBusButtonTypeN typeN = findViewById(R.id.trafficBusButtonTypeN);
        final TrafficBusTypeMini typeMini = findViewById(R.id.trafficBusTypeMini);
        typeA.setOpenAPIKey("API Key");
        typeB.setOpenAPIKey("API Key");
        typeN.setOpenAPIKey("API Key");
        typeMini.setOpenAPIKey("API Key");
    }
}
