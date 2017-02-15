package softwaredesign.mx.graficosandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by upam on 15/02/17.
 */
//http://www.jtech.ua.es/apuntes/ajdm2010/sesiones/sesion11-apuntes.html
public class Graficos extends View {

    public Graficos(Context ctx){
        super(ctx);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setColor(Color.RED);
        canvas.drawRect(100,100,100,100,paint);

    }
}
