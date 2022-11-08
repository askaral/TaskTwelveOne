public class Main {
    public static void main(String[] args) {

        University university1 = new University();
        university1.setName("Oxford");
        university1.setAddress("Oxford OX1 2JD, Great Britan");
        university1.setStudents(27500);
        university1.setWebsite("www.ox.ac.uk");
        university1.setTel("+44-1865-270000");
        University university2 = new University();
        university2.setName("Cambridge");
        university2.setAddress("Cambridge CB2 1TN, Great Britan");
        university2.setStudents(21656);
        university2.setWebsite("www.cam.ac.uk");
        university2.setTel("+44-1223-337733");
        University university3 = new University();
        university3.setName("Harward");
        university3.setAddress("Massachusetts, USA");
        university3.setStudents(36012);
        university3.setWebsite("www.harward.edu");
        university3.setTel("+1 617-495-1000");
        University[] universities = new University[]{university1,university2,university3};
        for (University university: universities) {
            university.getInfoUniversity();
            System.out.println("_ . _ . _ . _ . _ . _ . _ . _");

        }

        School school1 = new School();
        school1.setName("Toktosun Ataev");
        school1.setAddress("Naizabekova street 12, Baktuu-Dolonotu");
        school1.setTeacher(40);
        school1.setPupils(680);
        School school2 = new School();
        school2.setName("N.Bakirov");
        school2.setAddress("Markc street, Temen-Suu");
        school2.setTeacher(25);
        school2.setPupils(500);
        School school3 = new School();
        school3.setName("Nr. 62");
        school3.setAddress("Suyerkulov street, Bishkek");
        school3.setTeacher(85);
        school3.setPupils(3401);
        School [] schools = new School[]{school1,school2,school3};
        for (School school:schools) {
            school.getallInfo();
            System.out.println("- * - * - * - * - * - * - * - * -");
        }

    }

}