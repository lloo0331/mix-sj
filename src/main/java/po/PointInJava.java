package po;

public class PointInJava {

    private int x;
    private int y;

    public PointInJava(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void move(int moveX,int moveY){
        this.x+=moveX;
        this.y+=moveY;
        System.out.println("x的坐标点:"+x);
        System.out.println("y的坐标点:"+y);
    }

    public int getX() {return x;}

    public int getY() {return y;}

    public void setX(int x) {this.x = x;}

    public void setY(int y) {this.y = y;}

    public String toString(){
        return "x:"+x+";y="+y;
    }

    public static void main(String args[]){

        PointInJava point = new PointInJava(1,2);

        System.out.println(point);

        point.move(2,2);

        System.out.println(point);

        System.out.println(point.getX());

        point.setX(20);
        point.setY(20);

        System.out.println(point);
    }

}
