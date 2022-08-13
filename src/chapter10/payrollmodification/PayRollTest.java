package chapter10.payrollmodification;

public class PayRollTest {

        public static void main(String[] args) {
            Employee[] employee = new Employee[]{
                    new CommissionEmployee("Godman", "Daniels", "345-5644", 0.42, 2000),
                    new HourlyEmployee("Dan", "Uj",  "464-5697", 200, 41),
                    new SalariedEmployee("Lat", "Adi", "242-4535",10000),
                    new BasePlusCommissionEmployee("Fave", "Adu","343-6810",0.3, 1000, 300),
                    new PieceWorker("Das", "Iyi", "616-8328", 5, 100)
            };

            for(Employee employees : employee){
                System.out.printf("%n%s %n%s: $%,.2f%n",employees, "Workers earning", employees.earnings());
            }

        }
    }

