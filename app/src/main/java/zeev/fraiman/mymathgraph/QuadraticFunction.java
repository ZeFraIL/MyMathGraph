package zeev.fraiman.mymathgraph;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.OnDataPointTapListener;
import com.jjoe64.graphview.series.Series;

public class QuadraticFunction extends AppCompatActivity {

    EditText etA2, etB2, etC2;
    String stA="", stB="", stC="";
    int a=0,b=0,c=0, numPoints=100;
    GraphView graphQ;
    double d, x, x1, x2, xmin, dx, xL, xR,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadratic_function);

        etA2=findViewById(R.id.etA2);
        etB2=findViewById(R.id.etB2);
        etC2=findViewById(R.id.etC2);
        graphQ=findViewById(R.id.graphQ);
    }

    public void viewGraph(View view) {
        stA=etA2.getText().toString().trim();
        stB=etB2.getText().toString().trim();
        stC=etC2.getText().toString().trim();
        if (stA.equals("") || stB.equals("") || stC.equals(""))  {
            return;
        }
        a=Integer.parseInt(stA);
        b=Integer.parseInt(stB);
        c=Integer.parseInt(stC);
        d=b*b-4*a*c;

        LineGraphSeries<DataPoint> series=new LineGraphSeries<>();
        if (d<=0)  {
            xmin=-1.0*b/(2*a);
            xL=xmin-5.0;
            xR=xmin+10.0;
            dx=(xR-xL)/(1.0*numPoints);
            //Toast.makeText(this, "dx="+dx, Toast.LENGTH_SHORT).show();
        }

        if (d>0&&a>0)  {
            x1=(-b-Math.sqrt(d))/(2.0*a);
            x2=(-b+Math.sqrt(d))/(2.0*a);
            xL=x1-5;
            xR=x2+5;
            dx=(xR-xL)/(1.0*numPoints);
        }
        if (d>0&&a<0)  {
            x1=(-b-Math.sqrt(d))/(2.0*a);
            x2=(-b+Math.sqrt(d))/(2.0*a);
            xL=x2-5;
            xR=x1+5;
            dx=(xR-xL)/(1.0*numPoints);
        }
        x=xL;
        for (int i = 1; i <=(numPoints+1) ; i++) {
            y=a*x*x+b*x+c;
            series.appendData(new DataPoint(x,y), false, numPoints+1);
            x+=dx;
        }
        graphQ.addSeries(series);
        series.setAnimated(true);
        series.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                String stXY="("+dataPoint.getX()+","+dataPoint.getY()+")";
                Toast.makeText(QuadraticFunction.this, stXY, Toast.LENGTH_SHORT).show();
            }
        });
        series.setTitle("Parabola");
    }
}