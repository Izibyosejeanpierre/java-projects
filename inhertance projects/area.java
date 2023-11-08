class values{
    int len,wid;
    void getvalue(int l,int w)
    {
        len=l;
        wid=w;
    }
}
class rect extends values{
void recArea(){
    System.out.println("area of rectangle="+(len*wid));
}
}
class square extends values{
    void sqArea(){
        System.out.println("area of square="+(len*len));
    }
}
class area{
    public static void main(String args[]){
        rect r=new rect();
        square sq=new square();
        r.getvalue(8,10);
        r.recArea();
        sq.getvalue(8,8);
        sq.sqArea();
    }
}