import java.util.*;

public class JavaPriorityQueue {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Priorities priorities = new Priorities();

        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }




    }



}


class Student implements Comparable<Student>{

    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }




    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getCgpa(), getCgpa());
    }
}

class Priorities{

    public List<Student> getStudents(List<String> events) {

        List<Student> students = new ArrayList<>();
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

        String[] line; String event, name;
        double cgpa; int id;

        for (String s: events){

            line = s.split("\\s+");
            event = line[0];

            switch (event) {

                case "ENTER":

                    name = line[1];
                    cgpa = Double.parseDouble(line[2]);
                    id   = Integer.parseInt(line[3]);
                   // System.out.println(line[0] + " " + name + " " + cgpa + " " + id);
                    priorityQueue.add(new Student(id, name, cgpa));

                break;

                case "SERVED":
                    // faz o sort com base nas regras, e faz o pop do user.
                    // para fazer o sort, preciso ter acesso aos metodos e fazer a comparacao e sort...
                    // eh preciso ordenar o queue antes de fazer o pop...mas como? se eh um priority queue?
                   // students.add(priorityQueue.poll());

                   priorityQueue.poll();

                   //  System.out.println("Should pop the student obj");

                break;

            }

           // System.out.println(s);



        }

      //  System.out.println(events);


        for (Student e: priorityQueue) {
            System.out.println(e.getName() + " " + e.getCgpa() + " " + e.getId());
            students.add(e);
        }

     //   System.out.println(Collections.singletonList(priorityQueue));

        return  students;

    }




}
