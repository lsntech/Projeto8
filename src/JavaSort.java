import java.util.*;

public class JavaSort {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student_> studentList = new ArrayList<Student_>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student_ st = new Student_(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList,  Comparator.comparing(Student_::getCgpa).reversed()
                .thenComparing(Student_:: getFname)
                .thenComparing(Student_:: getId));

        for(Student_ st: studentList){
            System.out.println(st.getFname());
        }




    }



}



class Student_ {
    private int id;
    private String fname;
    private double cgpa;
    public Student_(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }


}

//class CompareName implements Comparator<Student>{
//
//    @Override
//    public int compare(Student a, Student b) {
//        return CharSequence.compare(a.getFname(), b.getFname());
//    }
//
//}
//
//class CompareId implements Comparator<Student>{
//
//    @Override
//    public int compare(Student a, Student b) {
//        return Integer.compare(a.getId(), b.getId());
//    }
//
//}
//
//class CompareCgpa implements Comparator<Student>{
//
//    @Override
//    public int compare(Student a, Student b) {
//        return Double.compare(b.getCgpa(), a.getCgpa());
//    }
//
//}
//
//
//
//



