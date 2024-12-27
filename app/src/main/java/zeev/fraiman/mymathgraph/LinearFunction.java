package zeev.fraiman.mymathgraph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class LinearFunction extends AppCompatActivity {

    EditText etA1, etB1;
    String stA="", stB="";
    int a=0,b=0;
    GraphView graphL;
    double x, xL, xR, y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_function);

        etA1=findViewById(R.id.etA1);
        etB1=findViewById(R.id.etB1);
        graphL=findViewById(R.id.graphL);
    }

    public void viewGraph(View view) {
        stA=etA1.getText().toString().trim();
        stB=etB1.getText().toString().trim();
        if (stA.equals("") || stB.equals(""))  {
            return;
        }
        a=Integer.parseInt(stA);
        b=Integer.parseInt(stB);

        x = (-b * 1.0) / a;

        LineGraphSeries<DataPoint> series = new LineGraphSeries<>();

        xL = x - 5;
        y = a * xL + b;
        series.appendData(new DataPoint(xL, y), false, 2);

        xR = x + 5;
        y=a*xR+b;
        series.appendData(new DataPoint(xR, y), false, 2);

        graphL.addSeries(series);
    }
}