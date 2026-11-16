package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[10];
    private MidDeveloper[] midDevelopers = new MidDeveloper[10];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[10];

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void addEmployee(int index, JuniorDeveloper developer) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Gecersiz index: " + index);
        } else if (juniorDevelopers[index] != null) {
            System.out.println("Uyari: " + index + ". index dolu, veri ezilmedi.");
        } else {
            juniorDevelopers[index] = developer;
        }
    }

    public void addEmployee(int index, MidDeveloper developer) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Gecersiz index: " + index);
        } else if (midDevelopers[index] != null) {
            System.out.println("Uyari: " + index + ". index dolu, veri ezilmedi.");
        } else {
            midDevelopers[index] = developer;
        }
    }

    public void addEmployee(int index, SeniorDeveloper developer) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Gecersiz index: " + index);
        } else if (seniorDevelopers[index] != null) {
            System.out.println("Uyari: " + index + ". index dolu, veri ezilmedi.");
        } else {
            seniorDevelopers[index] = developer;
        }
    }

    @Override
    public void work() {
        System.out.println(getName() + " insan kaynaklari yonetiyor.");
        setSalary(getSalary() + 500);
    }
}
