package hci2.group5.a2part3.config;

import android.graphics.Color;
import android.graphics.Paint;

public class PaintFactory {

	public static int DEFAULT_ALL_RECOGNIZED_SHAPE_COLOR = Color.GREEN;
	
	public static int DEFAULT_DRAFT_SHAPE_COLOR = Color.BLACK;
	
	public static int STROKE_COLOR_WHEN_FILLED= DEFAULT_DRAFT_SHAPE_COLOR;
	
	public static Paint defaultPaint;
	static {
		defaultPaint = new Paint();
		defaultPaint.setColor(DEFAULT_ALL_RECOGNIZED_SHAPE_COLOR);
		defaultPaint.setStyle(Paint.Style.STROKE);
		defaultPaint.setAntiAlias(true);
		defaultPaint.setStrokeJoin(Paint.Join.ROUND);
		defaultPaint.setStrokeCap(Paint.Cap.ROUND);
		defaultPaint.setStrokeWidth(2);
	}

	public static Paint draftPaint;
	static {
		draftPaint = new Paint(defaultPaint);
		draftPaint.setColor(DEFAULT_DRAFT_SHAPE_COLOR);
	}

	public static void fillAllRecognizedShapesWithColor(int color) {
		if (defaultPaint.getStyle() != Paint.Style.FILL) {
			defaultPaint.setStyle(Paint.Style.FILL);
		}
		defaultPaint.setColor(color);
	}
}
