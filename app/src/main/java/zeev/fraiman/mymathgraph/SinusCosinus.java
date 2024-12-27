package zeev.fraiman.mymathgraph;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class SinusCosinus extends AppCompatActivity {

    int amp=10, numPoints=720;
    GraphView graphSiCo;
    double y,f=0.25*Math.PI;
    LineGraphSeries<DataPoint> series1, series2, series3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinus_cosinus);

        graphSiCo=findViewById(R.id.graphSiCo);

        //sinus
        series1=new LineGraphSeries<>();
        for (int i = 0; i <=numPoints ; i++) {
            y=amp*Math.sin(i*Math.PI/180);
            series1.appendData(new DataPoint(i,y), false, numPoints);
        }
        graphSiCo.addSeries(series1);
        series1.setColor(Color.BLACK);

        //sinus+f
        series3=new LineGraphSeries<>();
        for (int i = 0; i <=numPoints ; i++) {
            y=amp*Math.sin(i*Math.PI/180+f);
            series3.appendData(new DataPoint(i,y), false, numPoints);
        }
        graphSiCo.addSeries(series3);
        series3.setColor(Color.RED);

        //cosinus
        series2=new LineGraphSeries<>();
        for (int i = 0; i <=numPoints ; i++) {
            y=amp*Math.cos(i*Math.PI/180);
            series2.appendData(new DataPoint(i,y), false, numPoints);
        }
        graphSiCo.addSeries(series2);
        series2.setColor(Color.MAGENTA);

    }
}