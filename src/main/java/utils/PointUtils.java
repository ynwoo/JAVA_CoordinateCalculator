package utils;

import coordinate.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PointUtils {

    public static List<Point> stringArrayToPointList(String[] stringPointArray) {
        ArrayList<Point> pointList = new ArrayList<>();
        for (String stringPoint : stringPointArray) {
            String pattern = "\\((\\d+),(\\d+)\\)";
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(stringPoint);

            if (m.matches()) {
                int x = Integer.parseInt(m.group(1));
                int y = Integer.parseInt(m.group(2));
                pointList.add(new Point(x, y));
            }
        }
        return pointList;
    }

}
