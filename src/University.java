public class University {

    private String name;
    private String address;
    private int students;
    private String website ;
    private String tel;

    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setStudents(int students){
        this.students=students;
    }
    public void setWebsite(String website){
        this.website = website;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getStudents() {
        return students;
    }

    public String getWebsite(){
        return website;
    }

    public String getTel() {
        return tel;
    }

    public void getInfoUniversity(){
        System.out.println("Name: "+getName());
        System.out.println("Address: "+getAddress());
        System.out.println("Website: "+getWebsite());
        System.out.println("Tel/Fax: "+getTel());
        System.out.println("Amount of students: "+getStudents());
    }
}


