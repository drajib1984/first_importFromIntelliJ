package Assignments;

public class DemoPageAssignment2 {

    public static void main(String[] args) {

        FamilyAssignment2 fa = new FamilyAssignment2("Mickey","Minnie","Morty",
                "Millie", 4000,3000,400,500,1000);

        System.out.println("The details of family is as follows: "+"\n Father: "+ fa.getFatherName()+
                "\n Mother: "+fa.getMotherName()+"\n Son: "+ fa.getSonName()+"\n Daughter: "+fa.getDaughterName()+
        "\n Father income: $"+fa.getFatherSalary()+"\n Mother income: $"+fa.getMotherSalary()+"\n Son's school fees: $"
                +fa.getSonFees()+"\n Daughter's fees: $"+fa.getDaughterFees()+"\n Monthly groceries: $"+fa.getGrocery());


        System.out.println("The names of all family members are: "+fa.displayNames());

        System.out.println("The total salary is $"+fa.getTotalSalary());

        System.out.println("The total fees is: $"+fa.getTotalFees());

        System.out.println("The savings for the month is: "+fa.getSavings());



    }
}
