package zeev.fraiman.mymathgraph;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class CircleFunction extends AppCompatActivity {

    int amp=100, x, numPoints=201;
    GraphView graphCircle;
    double y;
    LineGraphSeries<DataPoint> series1, series2, series3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_function);

        graphCircle=findViewById(R.id.graphCircle);
        series1=new LineGraphSeries<>();
        series2=new LineGraphSeries<>();
        series3=new LineGraphSeries<>();
        for (int i = -100; i <=100 ; i++) {
            x=i;
            y=Math.sqrt(amp*amp-x*x);
            series1.appendData(new DataPoint(i,y), false, numPoints);
        }

        for (int i = -100; i <=100 ; i++) {
            x=-i;
            y=-Math.sqrt(amp*amp-x*x);
            series2.appendData(new DataPoint(i,y), false, numPoints);
        }

        series3.appendData(new DataPoint(0,0), false, 2);
        double x1=amp*Math.cos(30*Math.PI/180);
        double y1=amp*Math.sin(30*Math.PI/180);
        series3.appendData(new DataPoint(x1,y1), false, 2);

        graphCircle.addSeries(series1);
        series1.setColor(Color.BLACK);
        graphCircle.addSeries(series2);
        series2.setColor(Color.BLACK);
        graphCircle.addSeries(series3);
        series3.setColor(Color.RED);
    }
}