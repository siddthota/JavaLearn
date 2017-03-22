package com.siddartha;

public class Main {

    public static void main(String[] args) {

        //encapsulation -

        BankAcct johnsAcct = new BankAcct(4552345, 2342.31, "John Backer", "john_backer@gmail.com", "(408)-453-5342");

        johnsAcct.deposit(123.14);
        johnsAcct.withdraw(3120.41);

        BankAcct jacksAcct = new BankAcct(8875574, 56342.11, "Jack Stunner", "jack.stun@gmail.com", "(832)-234-2342");

        jacksAcct.withdraw((1400.41));
        jacksAcct.deposit(1100.41);

        VipCustomer johnVip = new VipCustomer();
        System.out.println(johnVip.getCreditLimit());
        VipCustomer terryVip = new VipCustomer("Terry Jones", 34221.211);
        System.out.println(terryVip.getVipName());
        VipCustomer teaghanVip = new VipCustomer("Teaghan Lary", 4311.123, "teaghan@gmail.com");
        System.out.println(teaghanVip.getVipEmail());

        // Method OverLoading - The class to have two or more methods having same name, if their argument lists are different.
        calcFeetAndInchesToCentimeters(5, 10);
        calcFeetAndInchesToCentimeters(65);

        //Polymorphism - An operation may exhibit different behavior in different instances

        for(int i=1; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {

        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double inchesToCm = inches * 2.54;
            double feetToInches = 2.54 * (12 * feet);
            double totalCms = inchesToCm + feetToInches;
            System.out.println("Total Cms " + totalCms);
            return totalCms;
        } else {
            return -1;
        }

    }

    public static double calcFeetAndInchesToCentimeters(int inches) {

        if (inches >= 0) {
            int inchesToFeet = inches / 12;
            int leftOverInches = inches % 12;
            double totalCms = calcFeetAndInchesToCentimeters(inchesToFeet, leftOverInches);
            return totalCms;
        } else {
            return -1;
        }
    }


    //Polymorphism -

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }

        return null;
    }
}

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No plot method
}


