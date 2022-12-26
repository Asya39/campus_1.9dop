public class Geom {
    public static double segmentLength(int x1, int y1, int x2, int y2) {

        double length;
        //d=sqrt(x1-x2)^2+(y1-y2)^2

        length = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));

        return length;
    }

    public static double trianglePerimetr(int x1, int y1, int x2, int y2, int x3, int y3){

        double perimetr;

        //finding length of each side
        double a = segmentLength(x1, y1, x2, y2);
        double b = segmentLength(x2, y2, x3, y3);
        double c = segmentLength(x3, y3, x1, y1);

        //calculating perimetr
        perimetr = a+b+c;

        return perimetr;
    }

    public static void main(String[] args) {
       // System.out.println(segmentLength(1,1,3,5));
       // System.out.println(segmentLength(3,5,5,2));
       // System.out.println(segmentLength(5,2,1,1));
        System.out.println(trianglePerimetr(0,0,1,0,0,1));
    }
}
