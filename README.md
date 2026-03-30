1. System description
This food processing application system is a simple Java-based cashier system that starts with the main menus of Food, Drinks, and Desserts. Users can also order food back and forth, and all orders are entered into the same receipt.
2. Class structure
- Class MenuItem = This class is created to store data from the menu (Id, Name, Price, Stock, Category)
- Enum Category = Here Category is used to group the types of menus (FOOD, DRINK, DESSERT) so that the menu is neat.
- ExceptionHandling Class = This class functions to handle certain errors in this program, such as invalid input or insufficient stock and will automatically give a warning if the item is out of stock.
- Main Class = Main Class functions to display a menu for the user, receive input from the user using a scanner and also manage the ordering process from the user.
3. Exception handlingd:
Exceptions to handle errors when the program is run in Exceptions created in the ExceptionHandling class work to display error messages and control conditions such as out of stock, a warning message appears that the stock is out. In addition, this program also uses try-catch to handle errors due to out of stock.

