public class Main {
    public static void main(String[] args) {
      var totalTime = 640;
      var onePersonUsedTime = 8;
      var totalPersons = totalTime / onePersonUsedTime;
        System.out.println("Всего работников в компании " + totalPersons + " человек");
        var extraPersons = 94;
        totalPersons = totalPersons + extraPersons;
        System.out.println(totalPersons);
       totalTime= totalPersons * onePersonUsedTime;
        System.out.println("Если в компании работает "+totalPersons+ " человек, то всего "+totalTime+ " часов работы может быть поделено между сотрудниками");
    }
}