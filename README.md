# DesignPattern-Building-management-system

This project aim to learn Open closed principle and Design patterns

## Project details and background information
Imaginary Big Building Corporation is a property management company in Hong Kong. The company manages various kinds of buildings from overseas whose owners are people from Hong Kong. The company plans to develop a building management system (BMS) for maintaining different kinds of building records. The following is the simplified class diagram of existing data maintained by the company

![image](https://user-images.githubusercontent.com/31412017/208288185-47943997-43cd-4e64-9ef6-2117fe35d8ae.png)

As a system analyst of the Company, you are required to design and develop BMS. You are reminded that the design of the existing classes: Building, Apartment, House and Room must be kept unchanged. MS should provide the following functions:
1. Create a building record (Apartment, House or any new kind of Building in the coming future).
2. Modify a building record (Apartment, House or any new kind of Building in the coming future)
3. Display Building details (such as building id, corresponding attributes and rooms) by a given building id (input building id=* to display all building records) 
4. Add, update or delete rooms in a building record
5. Undo last command
6. Redo the last undone command
7. Show undo/redo list

Your system design should conform to the Open Closed Principle so that your design should easily be extended to support new building (e.g. Warehouse or Shop).

You MUST apply the following design patterns for your new system

> Command pattern to provide the “add building”, “display buildings”, “modify building”, “add room”, "delete room", "modify room", “undo”, “redo” and “list undo/redo list” functions

> Factory pattern or Abstract Factory Pattern to create different kinds of Command objects and different kinds of Building objects (e.g. Apartment object, House object, etc.)

> Memento pattern to provide “Undo” and “Redo” functions on "modify building" and "modify room"

### Completion time: 13-11-2022
