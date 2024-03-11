public class Main {
    public static void main(String[] args) {
        // Задание 1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        // Задание 2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        // Задание 3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        // Задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Задание 6
        var weightOneBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var weightTwoBoxers = weightOneBoxer + weightSecondBoxer;
        System.out.println("Масса двух боксеров " + weightTwoBoxers + " кг!");
        var differenceWeightBoxers = weightSecondBoxer - weightOneBoxer;
        System.out.println("Разница между массами боксеров " + differenceWeightBoxers + " кг!");
        // Задание 7
        var divisionWeight = weightSecondBoxer % weightOneBoxer;
        System.out.println("Остаток от деления " + divisionWeight);
        // Задание 8
        var totalOperatingHours = 640;
        var timeWork = 8;
        var amountWorkers = totalOperatingHours / timeWork;
        System.out.println("Всего работников в компании - " + amountWorkers + " человек");
        amountWorkers = amountWorkers + 94;
        var newHours = totalOperatingHours / amountWorkers;
        System.out.println("Если в компании работает " + amountWorkers + " человек, то всего " + newHours + " часа работы может быть поделенно между сотрудниками");
    }
}