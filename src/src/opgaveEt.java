void main() {
    //opgave 1
    /*
    double itemHerring = 25.50;
    double itemButter = 15.00;
    double itemCheeseCake = 30.00;

    float paymentSum = (float) (itemButter + itemHerring + itemCheeseCake); //sum af beløb
    System.out.println(paymentSum);

    double tax = 1.25;
    double totalPayment = paymentSum * tax;
    System.out.println(totalPayment);
*/
    //opgave 2 Opgave 2: Split restaurant bill
/*
    float burgerMenuStor = 450.0f;
    float drinks = 120.0f;
    float tips = 50.0f;
    int dinnerguests = 4;

    float totalpayment = burgerMenuStor + drinks + tips;
    float paymentPrGuest = totalpayment / dinnerguests;
    System.out.println(paymentPrGuest +"kr"); // resultat = 155.0kr.
*/
    // opgave 3 Discount calculation
/*
    float originalPrice = 300.0f;
    float discount = 20.0f;
    float tax = 25.0f;

    float priceWithDiscount = originalPrice - (originalPrice * discount / 100.0f); // = 240
    float totalPrice = priceWithDiscount + (priceWithDiscount * tax / 100);

    System.out.println(originalPrice);
    System.out.println(priceWithDiscount);
    System.out.println(totalPrice);
*/

    //opgave 4 Opgave 4: Party planning
/*
    int peopleCount = 15;
    int cupcakes = 40;

    int cupcakesPerPeople = cupcakes / peopleCount;
    int restCupcakes = cupcakes % peopleCount;

    System.out.println(cupcakesPerPeople);
    System.out.println(restCupcakes);

    System.out.println("Each guest gets " + cupcakesPerPeople + " " + "cupcakes and there is " + restCupcakes + " " + " cupcakes left");
 */

    // opgave 5 Opgave 5: Build greeting message
/*
    StringBuilder greeting = new StringBuilder("Hello, ");
    greeting.append("Henning");
    greeting.append("! ");
    greeting.append("You are ");
    greeting.append("20 ");
    greeting.append("years old. ");


    System.out.println(greeting);
*/

    //opgave 6: Using +=
/*
    int score = 100;
    System.out.println(score)
    score +=50
    System.out.println(score)
    score = 25
    System.out.println(score)

*/
 // opgave 7 Opgave 7: Using -=
 /*
    int healthPoints = 100;
    System.out.println(healthPoints -= 15);

    healthPoints -= 20;

    System.out.println(healthPoints);
*/
    //opgave 8: Using *=
/*
    int price = 50;
    System.out.println(price);
    price *= 2;
    System.out.println( price);
*/

    //opgave 9 Increment og decrement med 1
/*
    int counter = 10;
    System.out.println(counter);

    counter ++;
    System.out.println(counter);

    counter --;
    System.out.println(counter);

*/
    //opgave 10 All compound operators
/*
    int number = 10;
    System.out.println(number += 5);

    number -=3;
    System.out.println(number);
    number ++;
    System.out.println(number);
    number --;
    System.out.println(number);
*/

    //opgave 11 E-commerce product
/*
    String producttype = "Laptop";
    double grandTotal = 7999.99;
    boolean availableInventory = true;
    int inventoryQuantity = 15;
    double discountPercent = 10.0;
    String category = "Eletronics" //evt. GroupType?

 */
    //opgave 12 Karaktersystem
/*
    String pupilName = "Anna";
    int testScore = 88;
    int handInScore = 47;
    double averageGrade = 88.9;
    boolean pasingDegree = true;

 */
    //opgave 13 Bookingsystem
/*
    String guestName = "Peter Hansen";
    int givenRoomNumber = 304;
    int ammountOfNights = 5;
    double paymentPerNight = 799.99;
    boolean breakfastIncluded = true;
    double totalPayment = 2345,93;

 */
    //Opgave 14: Fitness-tracker
/*
    int stepsToday = 9324;
    int stepGoal = 10000;
    double totalWalkDistance = 6.2;
    int caloriesBurned = 500;
    boolean stepGoalReached = false;

 */

    //Opgave 15: Bibliotekssystem
/*
    String bookTitle;
    String authorName;
    int serialBooknumber = //x; //barcodeForBook borcode - isbnNumber
    int totalBookPages = //x;
    boolean bookInStock = //true/false
    String whoBorrowed =; //name
    String dueDate =; // indsæt dato
    int finePayment =; // f.eks 10kr pr. dag
    boolean isBestseller =; // true/false
    double bookRating =; // f.eks 4.7

 */
}