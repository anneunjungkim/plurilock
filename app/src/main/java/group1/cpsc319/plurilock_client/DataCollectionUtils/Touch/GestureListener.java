package group1.cpsc319.plurilock_client.DataCollectionUtils.Touch;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.util.Log;


/**
 * Created by BK on 16-02-29.
 */

public class GestureListener extends GestureDetector.SimpleOnGestureListener
        implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{

    public static final String TAG = "GestureListener";

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Log.i(TAG, "Single Tap Up" + coordination(e) + precision(e) + getTouchType(e) + abTime(e));
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Log.i(TAG, "Long Press" + coordination(e) + precision(e) + getTouchType(e) + abTime(e));
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
                            float distanceY){
        Log.i(TAG, "Scroll" + scrollCoordination(e1, e2) + getTouchType(e1));
        return false;
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
                           float velocityY) {
        Log.i(TAG, "Fling" + scrollCoordination(e1, e2) + getTouchType(e1));
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        Log.i(TAG, "Show Press" + coordination(e) + precision(e) + getTouchType(e) + abTime(e));
    }

    @Override
    public boolean onDown(MotionEvent e) {
        Log.i(TAG, "Down" + coordination(e) + precision(e) + getTouchType(e) + abTime(e));
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        Log.i(TAG, "Double tap" + coordination(e) + precision(e) + getTouchType(e) + abTime(e));
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        Log.i(TAG, "Event within double tap" + coordination(e) + precision(e) + getTouchType(e) + abTime(e));
        return false;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        Log.i(TAG, "Single tap confirmed" + coordination(e) + precision(e) + getTouchType(e) + abTime(e));
        return false;
    }

    private String coordination(MotionEvent e) {
        int x = (int)e.getX();
        int y = (int)e.getY();
        return "(" + x + " , " + y + ")";
    }

    private String scrollCoordination(MotionEvent e1, MotionEvent e2) {
        int x1 = (int)e1.getX();
        int y1 = (int)e1.getY();
        int x2 = (int)e2.getX();
        int y2 = (int)e2.getY();

        return "(" + (x2 - x1) + " , " + (y2 - y1) + ")";
    }

    private String precision(MotionEvent e){
        int x = (int)e.getXPrecision();
        int y = (int)e.getYPrecision();
        return "(" + x + " , " + y + ")";
    }

    //
    private String abTime(MotionEvent e) {
        long eventDuration = e.getEventTime() - e.getDownTime();
        return "(" + eventDuration+ "ms)";
    }


    private static String getTouchType(MotionEvent e) {
        String touchTypeDescription = " ";
        int touchType = e.getToolType(0);
        if (touchType == 1) {
            touchTypeDescription += "(finger)";
        } else {
            touchTypeDescription += "(unknown)";
        }
        return touchTypeDescription;
    }
}