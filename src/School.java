public class School {

    private String name;
    private String address;
    private int teacher;
    private int pupils;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(int teacher) {
        this.teacher = teacher;
    }

    public void setPupils(int pupils) {
        this.pupils = pupils;
    }


    public String getAddress(){
        return address;
    }
    public int getTeacher()
    {
        return teacher;
    }
    public int getPupils(){
        return pupils;
    }
    public String getName(){
        return name;
    }
    void getallInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Address: "+getAddress());
        System.out.println("Amount of Teacher: "+getTeacher());
        System.out.println("Amount of Pupils: "+getPupils());
    }


}


