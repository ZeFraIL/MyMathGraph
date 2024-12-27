package zeev.fraiman.mymathgraph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intent go=new Intent(MainActivity.this, CircleFunction.class);
        //startActivity(go);
    }

    public void goLinear(View view) {
        Intent go=new Intent(MainActivity.this, LinearFunction.class);
        startActivity(go);
    }

    public void goQuadratic(View view) {
        Intent go=new Intent(MainActivity.this, QuadraticFunction.class);
        startActivity(go);
    }

    public void goSeveral(View view) {
        Intent go=new Intent(MainActivity.this, SeveralGraphs.class);
        startActivity(go);
    }

    public void goSinCos(View view) {
        Intent go=new Intent(MainActivity.this, SinusCosinus.class);
        startActivity(go);
    }
}