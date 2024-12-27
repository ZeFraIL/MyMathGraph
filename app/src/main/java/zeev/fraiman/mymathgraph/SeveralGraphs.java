package zeev.fraiman.mymathgraph;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class SeveralGraphs extends AppCompatActivity {

    int a=2,b=10,c=-100, numPoints=100, i=-1;
    GraphView graphS;
    double d, x, x1, x2, xmin, dx=0.4, xL, xR,y;
    int[] colors={Color.BLACK, Color.BLUE, Color.RED, Color.MAGENTA};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_several_graphs);

        graphS=findViewById(R.id.graphS);
    }

    public void viewGraph(View view) {
        i++;
        if (i==0)  {
            buildGraph(a,b,c);
        }
        if (i==1)  {
            buildGraph(-a,b,c);
        }
        if (i==2)  {
            buildGraph(a,-b,c);
        }
        if (i==3)  {
            buildGraph(a,b,-c);
        }
    }

    public void buildGraph(int a, int b, int c)  {
        LineGraphSeries<DataPoint> series=new LineGraphSeries<>();
        xL=-20.0;
        //xR=20.0;
        //dx=(xR-xL)/(1.0*numPoints);
        x=xL;
        for (int i = 1; i <=(numPoints+1) ; i++) {
            y=a*x*x+b*x+c;
            series.appendData(new DataPoint(x,y), false, numPoints+1);
            x+=dx;
        }
        graphS.addSeries(series);
        series.setColor(colors[i]);
    }
}