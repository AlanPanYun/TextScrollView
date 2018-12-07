package alan.example.com.textscrollview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Alan on 2018/12/7.
 */
public class TextScrollView extends View {

    public final String drawText = "正在加载中....";
    public int progress;

    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private int widthText;

    public TextScrollView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    {
        paint.setTextSize(Utils.dpToPixel(20));
//        paint.setTextAlign(Paint.Align.CENTER);

        Rect bounds = new Rect();
        paint.getTextBounds(drawText, 0, drawText.length(), bounds);
        widthText = bounds.width();

    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
        invalidate();
    }


    public String getDrawText() {
        return drawText;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText(drawText, 0, progress, getWidth() / 2 - widthText / 2, getHeight() / 2, paint);
    }


}
