
package coursemanagement;
public class Processor {

    private CourseArrayList courseList;

    public Processor() {
        courseList = new CourseArrayList();
    }

    public void addOnlineCourse() {

        OnlineCourse online = new OnlineCourse(
                "", 0, null, false, 0, "", 0
        );

        online.addCourse();

        courseList.addCourseToArrayList(online);
    }

    public void addOfflineCourse() {

        OfflineCourse offline = new OfflineCourse(
                "", 0, null, false, 0, "", 0
        );

        offline.addCourse();

        courseList.addCourseToArrayList(offline);
    }

    public void updateCourse() {

        System.out.print("Enter course ID: ");

        String id = Course.scanner.nextLine();

        courseList.updateCourseById(id);
    }

    public void deleteCourse() {

        System.out.print("Enter course ID: ");

        String id = Course.scanner.nextLine();

        courseList.deleteCourseById(id);
    }

    public void displayAllCourses() {

        courseList.displayAllCourses();
    }

    public void displayAvailableCourses() {

        courseList.displayAvailableCourses();
    }

    public void calculateTotalFees() {

        double total = courseList.calculateTotalFees();

        System.out.println("Total fees: " + total);
    }

    public void run() {

        while (true) {

            System.out.println("\n===== COURSE ENROLLMENT MANAGEMENT =====");
            System.out.println("1. Add Online Course");
            System.out.println("2. Add Offline Course");
            System.out.println("3. Update Course");
            System.out.println("4. Delete Course");
            System.out.println("5. Display All Courses");
            System.out.println("6. Display Available Courses");
            System.out.println("7. Calculate Total Fees");
            System.out.println("8. Exit");

            System.out.print("Choose: ");

            int choice =
                    Integer.parseInt(Course.scanner.nextLine());

            switch (choice) {

                case 1:
                    addOnlineCourse();
                    break;

                case 2:
                    addOfflineCourse();
                    break;

                case 3:
                    updateCourse();
                    break;

                case 4:
                    deleteCourse();
                    break;

                case 5:
                    displayAllCourses();
                    break;

                case 6:
                    displayAvailableCourses();
                    break;

                case 7:
                    calculateTotalFees();
                    break;

                case 8:
                    System.out.println("Program ended!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}