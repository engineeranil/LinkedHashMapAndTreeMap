public class Student {
private int note;
private int  no;
private String name;

Student(int note,int no , String name){
        this.note=note;
        this.no=no;
        this.name=name;
}

    public int getNote(){
    return this.note;
    }
    public void setNote(int note){
        this.note=note;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
