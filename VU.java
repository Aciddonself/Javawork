class VU {
    private static final double MIN_BASE_PAY = 40000.0;
    private static final int MAX_WORK_HOURS = 60;
    private static final int REGULAR_HOURS = 40;
    private static final double OVERTIME_RATE = 1.5;

    public static void calculatePay(String employeeName, double basePay, int hoursWorked) {
        if (basePay < MIN_BASE_PAY) {
            System.out.println("Error: Base pay cannot be less than the minimum wage (UGX 40,000 an hour)");
            return;
        }
        if (hoursWorked > MAX_WORK_HOURS) {
            System.out.println("Error: Employee cannot work more than 60 hours in a week");
            return;
        }

        double totalPay;
        if (hoursWorked <= REGULAR_HOURS) {
            totalPay = basePay * hoursWorked;
        } else {
            double regularPay = basePay * REGULAR_HOURS;
            double overtimePay = (hoursWorked - REGULAR_HOURS) * basePay * OVERTIME_RATE;
            totalPay = regularPay + overtimePay;
        }

        System.out.println("Employee: " + employeeName + "\nTotal Pay: UGX " + totalPay);
    }

    public static void main(String[] args) {
        // Employee A
        calculatePay("Employee A", 28000.0, 35);

        // Employee B
        calculatePay("Employee B", 35000.0, 45);

        // Employee C
        calculatePay("Employee C", 38000.0, 75);
    }
}

