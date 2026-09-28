/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursemanagement;
import java.util.Date;

public class OnlineCourse extends Course {

    private String platformName;
    private double discountPercent;

    public OnlineCourse(String id, double feePerStudent,
                         Date startDate, boolean isAvailable,
                         int enrolledStudents,
                         String platformName,
                         double discountPercent) {

        super(id, feePerStudent, startDate,
              isAvailable, enrolledStudents);

        this.platformName = platformName;
        this.discountPercent = discountPercent;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public void addCourse() {

        super.addCourse();

        System.out.print("Enter platform name: ");
        platformName = scanner.nextLine();

        System.out.print("Enter discount percent: ");
        discountPercent = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void updateCourse() {

        super.updateCourse();

        System.out.print("Enter new platform name: ");
        platformName = scanner.nextLine();

        System.out.print("Enter new discount percent: ");
        discountPercent = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void displayDetails() {

        System.out.println("===== ONLINE COURSE =====");

        super.displayDetails();

        System.out.println("Platform name: " + platformName);
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Total fee: " + calculateTotalFee());
    }

    @Override
    public double calculateTotalFee() {

        return getFeePerStudent()
                * getEnrolledStudents()
                * (1 - discountPercent / 100);
    }
}